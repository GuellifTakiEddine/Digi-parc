/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;

/**
 *
 * @author ASUS
 */

import javax.swing.*;
import java.io.Serializable;
import java.util.StringJoiner;

/**
 *
 * @author Raven
 */
public class FlatLafStyleComponent implements Serializable {

    public String getOwnStyle() {
        return ownStyle;
    }

    public void setOwnStyle(String ownStyle) {
        this.ownStyle = ownStyle;
    }

    public String[] getStyles() {
        return styles;
    }

    public void setStyles(String[] styles) {
        this.styles = styles;
    }

    public FlatLafStyleComponent(String ownStyle, String[] styles) {
        this.ownStyle = ownStyle;
        this.styles = styles;
    }

    public FlatLafStyleComponent() {
    }

    private String ownStyle;
    private String styles[];

    public void installStyle(JComponent component, String style) {
        String arrs[] = style.split(";");
        StringJoiner st = new StringJoiner(";");
        for (String arr : arrs) {
            if (arr.contains("=")) {
                String a[] = arr.split("=");
                component.putClientProperty(a[0], a[1]);
            } else {
                st.add(arr);
            }
        }
        if (st.length() > 0) {
            component.putClientProperty("FlatLaf.style", st.toString());
        }
    }
}