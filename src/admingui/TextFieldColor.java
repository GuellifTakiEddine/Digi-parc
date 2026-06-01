/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;

import raven.glassmorphism.bean.editor.util.GlassIconEditorUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.function.Consumer;
/**
 *
 * @author MSI_GS
 */
public class TextFieldColor extends JTextField {

    public void setOnChange(Consumer onChange) {
        this.onChange = onChange;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        setText(color);
        repaint();
    }

    private Consumer onChange;

    private String color = "#CC6A26";
    private final int colorSize = 15;
    private final int space = 5;

    public TextFieldColor() {
        Insets margin = getMargin();
        setMargin(new Insets(margin.top, colorSize + space, margin.bottom, margin.right + colorSize + space));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == 10) {
                    String col = GlassIconEditorUtil.fixColor(getText().trim());
                    if (checkColor(col)) {
                        setColor(col);
                        onChange.accept(color);
                    }
                }
            }
        });
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String col = GlassIconEditorUtil.fixColor(getText().trim());
                col = getValue(col);
                setText(col);
                setColor(col);
                onChange.accept(color);
            }
        });
        initMouse();
    }

    private void initMouse() {
        MouseAdapter mouseEvent = new MouseAdapter() {
            private boolean press;

            private boolean isOver(MouseEvent e) {
                return (e.getX() >= getWidth() - colorSize - space && e.getX() <= getWidth() - space);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (isOver(e)) {
                    press = true;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (press && isOver(e)) {
                    selecteColor();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if (isOver(e)) {
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                } else {
                    setCursor(new Cursor(Cursor.TEXT_CURSOR));
                }
            }
        };
        addMouseListener(mouseEvent);
        addMouseMotionListener(mouseEvent);
    }

    private void selecteColor() {
        Color selectedColor = JColorChooser.showDialog(getParent().getParent(), "Shape Color", Color.decode(getColor()));
        if (selectedColor != null) {
            setColor(GlassIconEditorUtil.toColorText(selectedColor));
            onChange.accept(color);
        }
    }

    private boolean checkColor(String color) {
        try {
            Color.decode(color);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private String getValue(String col) {
        try {
            String text = col;
            Color.decode(text);
            return text;
        } catch (NumberFormatException e) {
            return color;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int height = getHeight();
        int size = Math.min(height - 10, colorSize);
        int x = 5;
        int y = (height - size) / 2;
        g2.setColor(getForeground());
        g2.fill(new Rectangle2D.Double(x, y, size, size));
        if (color.equals("")) {
            g2.setColor(Color.WHITE);
        } else {
            g2.setColor(Color.decode(color));
        }
        g2.fill(new Rectangle2D.Double(x + 1, y + 1, size - 2, size - 2));
        GlassIconEditorUtil.createCustomButton(this, g2, 15, size, space, getSelectionColor());
        g2.dispose();
    }
}