import java.io.File;

public class FileTypeFilter extends javax.swing.filechooser.FileFilter {

	public boolean accept(File file){
		if(file.isDirectory()) return true;
		return file.getName().endsWith(".csv");
		
	}
	
	public String getDescription(){
		return ".csv";
	}
	
}
