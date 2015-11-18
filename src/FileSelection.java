import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FileSelection {

	private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JButton downLoadButton;
    private String fileKey;
    public FileSelection(){
    	//generateGUI();
    
    }
    public static void Action(ArrayList<String> fileList){
    	FileSelection fileSelection = new FileSelection();
    	fileSelection.generateGUI();
    	fileSelection.ShowFileList(fileList);
    }
    private void generateGUI(){
    	mainFrame = new JFrame("AWS File List");
    	mainFrame.setSize(800,500);
    	mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent windowEvent) {
                 System.exit(0);
             }
         });
    	headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
    	statusLabel = new JLabel("", JLabel.CENTER);
    	statusLabel.setSize(350, 100);
    	controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        downLoadButton = new JButton("DownloadFileFromAWS");
        controlPanel.add(downLoadButton);
        downLoadButton.setVisible(true);
        downLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	downLoadButtonActionPerformed(evt);
            }
			
        });
    }
    private void downLoadButtonActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
    	try {
			FileDownload.DownloadFile(getSelectionFileName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
    private void ShowFileList(ArrayList<String> fileList){
    	headerLabel.setText("Files in AWS is as following:");
    	final ArrayList<JRadioButton> radButtonFile = new ArrayList<JRadioButton>();
    	 ButtonGroup group = new ButtonGroup();
    	for(int i = 0; i < fileList.size(); i++){
    		JRadioButton radioButton = new JRadioButton(fileList.get(i));
    		radioButton.addActionListener(new ActionListener(){
               
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					fileKey = radioButton.getText();
					statusLabel.setText("You choose File is : " + radioButton.getText());
				}
            });
            radButtonFile.add(radioButton);
            group.add (radButtonFile.get(i));
            controlPanel.add(radButtonFile.get(i));
        
    	}
    }
    private String getSelectionFileName(){
    	return fileKey;
    }
    //private 
}
