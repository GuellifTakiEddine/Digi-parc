/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MSI_GS
 */
public class RoundJTextField extends JPanel{
    
    private JTextField textField;
    private Image icon;
    private String placeholder;
    private Font placeholderFont;

    public RoundJTextField(int columns, String iconPath) {
        setOpaque(false);
        setLayout(new BorderLayout());

        textField = new JTextField(columns);
        textField.setOpaque(false);
        textField.setBorder(new EmptyBorder(0, 0, 0, 20)); // Adjust right padding for the icon
        add(textField, BorderLayout.CENTER);

        icon = new ImageIcon(iconPath).getImage();

        // Add focus listener to handle placeholder text
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setFont(textField.getFont().deriveFont(Font.PLAIN)); // Reset font to plain when typing
                    textField.setForeground(Color.BLACK); // Change text color to black
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setFont(placeholderFont); // Set placeholder font
                    textField.setForeground(Color.GRAY); // Set placeholder text color to grey
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        super.paintComponent(g2d);

        if (icon != null) {
            int iconWidth = icon.getWidth(null);
            int iconHeight = icon.getHeight(null);
            int x = getWidth() - iconWidth - 5; // Adjust position from right side
            int y = (getHeight() - iconHeight) / 2;
            g2d.drawImage(icon, x, y, this);
        }

        g2d.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.gray);
        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        g2d.dispose();
    }

    public void setPlaceholder(String text) {
        this.placeholder = text;
        textField.setText(text);
        
        // Create a bold version of the current font for the placeholder
        Map<TextAttribute, Object> attributes = new HashMap<>(textField.getFont().getAttributes());
        attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
        Font boldFont = textField.getFont().deriveFont(attributes);
        
        // Set the placeholder font explicitly
        placeholderFont = boldFont;
        textField.setFont(boldFont);
        
        // Set the placeholder text color to grey
        textField.setForeground(Color.GRAY);
    }

    public void setText(String text) {
        textField.setText(text);
    }

    public String getText() {
        return textField.getText();
    }
    
}
