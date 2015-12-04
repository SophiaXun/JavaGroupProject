package GroupProject;

import java.io.File;

/**
 * This class constrict the file type.
 *
 * @author Nan Xia
 */
public class FileTypeFilter extends javax.swing.filechooser.FileFilter {

    /**
     * The method constricts the file type as csv.
     *
     * @param file
     * @return whether the file is accepted or not
     */
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        return file.getName().endsWith(".csv");

    }

    /**
     * The method overrides the getDescription methods.
     *
     * @return the new name of file
     */
    public String getDescription() {
        return ".csv";
    }

}
