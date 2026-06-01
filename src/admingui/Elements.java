/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;

/**
 *
 * @author MSI_GS
 */
public class Elements {

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEditColor() {
        return editColor;
    }

    public void setEditColor(String editColor) {
        this.editColor = editColor;
    }

    public Elements(String tag, String color, String editColor) {
        this.tag = tag;
        this.color = color;
        this.editColor = editColor;
    }

    public Elements() {
    }

    private String tag;
    private String color;
    private String editColor;

    public Object[] toTableRow() {
        return new Object[]{this, editColor};
    }

    @Override
    public String toString() {
        return tag;
    }
}