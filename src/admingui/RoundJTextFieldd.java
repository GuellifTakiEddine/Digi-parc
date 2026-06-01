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
public class RoundJTextFieldd extends JPanel{
    
     private JPasswordField passwordField;
    private Image icon;
    private String placeholder;
    private Font placeholderFont;

    public RoundJTextFieldd(int size, String iconPath) {
        setOpaque(false);
        setLayout(new BorderLayout());

        passwordField = new JPasswordField(size);
        passwordField.setOpaque(false);
        passwordField.setBorder(new EmptyBorder(0, 0, 0, 20)); // Adjust right padding for the icon
        add(passwordField, BorderLayout.CENTER);

        icon = new ImageIcon(iconPath).getImage();

        // Add focus listener to handle placeholder text
        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals(placeholder)) {
                    passwordField.setText("");
                    passwordField.setFont(passwordField.getFont().deriveFont(Font.PLAIN)); // Reset font to plain when typing
                    passwordField.setForeground(Color.BLACK); // Reset text color when typing
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).isEmpty()) {
                    passwordField.setText(placeholder);
                    passwordField.setFont(placeholderFont); // Set placeholder font
                    passwordField.setForeground(Color.GRAY); // Set placeholder text color
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
        g2d.setColor(getForeground());
        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        g2d.dispose();
    }

    public void setPlaceholder(String text) {
        this.placeholder = text;
        passwordField.setText(text);
        
        // Create a bold version of the current font for the placeholder
        Map<TextAttribute, Object> attributes = new HashMap<>(passwordField.getFont().getAttributes());
        attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
        placeholderFont = passwordField.getFont().deriveFont(attributes);
        
        // Set the placeholder font explicitly
        passwordField.setFont(placeholderFont);
        
        // Set the placeholder text color to grey
        passwordField.setForeground(Color.GRAY);
    }

    public void setText(String text) {
        passwordField.setText(text);
    }

    public String getText() {
        return String.valueOf(passwordField.getPassword());
    }
    
    public void setEchoChar(char c) {
        passwordField.setEchoChar(c);
    }
    
}
