/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author MSI_GS
 */
public class LabelBackground extends JLabel {

    public LabelBackground() {
        setHorizontalAlignment(JLabel.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();
        int size = 10;
        int col = width / size;
        int row = height / size;
        int x = 0;
        int y = 0;
        for (int i = 0; i <= row; i++) {
            boolean start = i % 2 == 0;
            for (int j = 0; j <= col; j++) {
                if (start) {
                    g2.setColor(getBackground());
                } else {
                    g2.setColor(new Color(190, 190, 190));
                }
                g2.fill(new Rectangle2D.Double(x, y, size, size));
                start = !start;
                x += size;
            }
            y += size;
            x = 0;
        }
        g2.dispose();
        super.paintComponent(g);
    }
}