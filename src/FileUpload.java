
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.UUID;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import javax.swing.JOptionPane;

/**
 * This class provides methods and parameters for a user to upload the file into
 * AWS.
 *
 * @author Nan Xia
 */
public class FileUpload {
    //our default bucket to store this information. Try in others' computer. 
    String bucketName = "fightforjava1";
    public  static void Upload(File file) throws IOException {
        AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider("default").getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. "
                    + "Please make sure that your credentials file is at the correct "
                    + "location (C:\\Users\\Asus\\.aws\\credentials), and is in valid format.",
                    e);
            
        }
        AmazonS3 s3 = new AmazonS3Client(credentials);
        Region usWest2 = Region.getRegion(Regions.US_WEST_2);
        s3.setRegion(usWest2);
        
        
        // the key of one file. to ensure the key is unique, use UUID to generate a uniqueID as a post fix. 
        String key = "StudentInformation" + file.getName() + UUID.randomUUID();
        try {
            s3.putObject(new PutObjectRequest("fightforjava1", key, file));
            JOptionPane.showMessageDialog(null, "Success!", "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (AmazonServiceException ase) {
            JOptionPane.showMessageDialog(null, "The request to AWS was reject!!", "Alert", JOptionPane.ERROR_MESSAGE);
        } catch (AmazonClientException ace) {
            JOptionPane.showMessageDialog(null, "The client encounered a serious internal problem while trying to communicate with AWS S3", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

}
