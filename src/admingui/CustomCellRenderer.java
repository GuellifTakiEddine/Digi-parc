/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
/**
 *
 * @author MSI_GS
 */
public class CustomCellRenderer extends DefaultTableCellRenderer {
   private int row = -1;

    CustomCellRenderer(Color BLUE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (this.row == row) {
            c.setBackground(new Color(238, 247, 255)); // Light blue
        } else {
            c.setBackground(Color.WHITE); // Default background color
        }
        return c;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }
}