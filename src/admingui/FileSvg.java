/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admingui;
import java.io.File;

/**
 *
 * @author MSI_GS
 */
public class FileSvg {

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileSvg() {
    }

    public FileSvg(String packageName, File file) {
        this.packageName = packageName;
        this.file = file;
    }

    private String packageName;
    private File file;

    @Override
    public String toString() {
        return file.getName();
    }

    public String getNameWidthPacakgeName() {
        return packageName + toString();
    }
}