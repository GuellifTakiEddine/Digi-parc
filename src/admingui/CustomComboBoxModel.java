/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;

import javax.swing.*;

/**
 *
 * @author MSI_GS
 */
public class CustomComboBoxModel extends DefaultComboBoxModel {
    public void addElement(Salairep.User user) {
        insertElementAt(user, getSize()); // Insert the user at the end of the model
    }
}
