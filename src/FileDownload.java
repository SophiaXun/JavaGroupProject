import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class FileDownload {
/**
 * This method lists the file in the Amazon s3 for user to choose. 
 * @param s3
 * @param bucketName
 */
	public static ArrayList<String> FileList(){
		String bucketName = "fightforjava1";
		AWSCredentials credentials = null;
		try {
            credentials = new ProfileCredentialsProvider("default").getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (C:\\Users\\Asus\\.aws\\credentials), and is in valid format.",
                    e);
        }
        AmazonS3 s3 = new AmazonS3Client(credentials);
        Region usWest2 = Region.getRegion(Regions.US_WEST_2);
        s3.setRegion(usWest2);
		//System.out.println("Listing Files");
        ObjectListing objectListing = s3.listObjects(new ListObjectsRequest()
                .withBucketName(bucketName)
                .withPrefix("Student"));
        ArrayList<String> fileList = new ArrayList<String>();
        for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {
        	String objectName = objectSummary.getKey();
        	fileList.add(objectName);
        }
        return fileList;
	}
	
	public static void DownloadFile(String fileKey) throws IOException{
		String bucketName = "fightforjava1";
		AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider("default").getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (C:\\Users\\Asus\\.aws\\credentials), and is in valid format.",
                    e);
        }
        AmazonS3 s3 = new AmazonS3Client(credentials);
        Region usWest2 = Region.getRegion(Regions.US_WEST_2);
        s3.setRegion(usWest2);
        try {
        	
        	S3Object object = s3.getObject(new GetObjectRequest("fightforjava1", fileKey));
            System.out.println("Content-Type: "  + object.getObjectMetadata().getContentType());
            displayTextInputStream(object.getObjectContent());
               

       
	 } catch (AmazonServiceException ase) {
         JOptionPane.showMessageDialog(null, "The request to AWS was reject!!", "Alert", JOptionPane.ERROR_MESSAGE);
     } catch (AmazonClientException ace) {
         JOptionPane.showMessageDialog(null, "The client encounered a serious internal problem while trying to communicate with AWS S3", "Alert", JOptionPane.ERROR_MESSAGE);
     }

	}
	private static void displayTextInputStream(InputStream input) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        while (true) {
            String line = reader.readLine();
            if (line == null) break;

            System.out.println("    " + line);
        }
        System.out.println();
    }

}
