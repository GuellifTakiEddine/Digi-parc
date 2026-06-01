/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;

import raven.glassmorphism.GlassIcon;
import raven.glassmorphism.bean.editor.GlassIconEditor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author MSI_GS
 */
public class GlassIconBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor glassIconConfigProperty = new PropertyDescriptor("glassIconConfig", GlassIcon.class);
            glassIconConfigProperty.setPropertyEditorClass(GlassIconEditor.class);

            return new PropertyDescriptor[]{glassIconConfigProperty};
        } catch (IntrospectionException e) {
            return null;
        }
    }
}