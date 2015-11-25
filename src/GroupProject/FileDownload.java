package GroupProject;


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
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.UUID;

public class FileDownload {
    /**
     * This parameter stores all the students in a temp csv file. 
     */
    private ArrayList<Student> student = new ArrayList<Student>();
     public ArrayList<Student> getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    /**
     * This method lists the file in the Amazon s3 for user to choose.
     *
     * @param s3
     * @param bucketName
     * @return the student
     */
   
    public static ArrayList<String> FileList() {
        String bucketName = "fightforjava1";
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
/**
 * This method downloads the file content.
 * @param fileKey
 * @throws IOException 
 */
    public static void DownloadFile(String fileKey) throws IOException {
        String bucketName = "fightforjava1";
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
        try {

            S3Object object = s3.getObject(new GetObjectRequest("fightforjava1", fileKey));
            
            
            displayTextInputStream(object.getObjectContent());
             // System.out.println(object.getObjectContent());

        } catch (AmazonServiceException ase) {
            JOptionPane.showMessageDialog(null, "The request to AWS was reject!!", "Alert", JOptionPane.ERROR_MESSAGE);
        } catch (AmazonClientException ace) {
            JOptionPane.showMessageDialog(null, "The client encounered a serious internal problem while trying to communicate with AWS S3", "Alert", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static String[] strToArray(String str) {
        String[] array = null;
        array = str.split(",");
        return array;
    }

    public static Student convertStrToStudent(String[] line) {
        Student student = new Student();
        student.setiD(line[0]);
        student.setCourseInformation(line[1]);
        student.setPostgraduateOrUnderGraduate(line[2]);
        student.setFieldOfEducation(line[3]);
        student.setAge(line[4]);
        student.setGender(line[5]);
        student.setCitizenship(line[6]);
        student.setTermResidence(line[7]);
        student.setPermanentResidence(line[8]);
        student.setBasisForAdmission(line[9]);
        student.setTypeOfAttendance(line[10]);
        student.setModeOfAttendance(line[11]);
        student.setCountryOfBirth(line[12]);
        student.setLanguageSpokenAtHome(line[13]);
        student.setYearOfArrivalInUsa(line[14]);
        student.setEntranceScore(line[15]);
        student.setEquityData(line[16]);
        student.setHighestLevelOfEducationPriorToCommencement(line[17]);
        student.setCourseCompletionYear(line[18]);
        student.setCourseGpaEarned(line[19]);
        return student;
    }
    
    private static void displayTextInputStream(InputStream input) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        FileDownload filedownload = new FileDownload();
        //String fileName = "student" +  UUID.randomUUID();
        File file = new File("studentTemp.csv");
        Writer writer = new OutputStreamWriter(new FileOutputStream(file));
        while (true) {
            String line = reader.readLine();
            String[] attributeArray = null;
            if (line == null) break;
            writer.write(line + "\n");
            attributeArray = strToArray(line);
            Student newStudent = FileDownload.convertStrToStudent(attributeArray);
            filedownload.getStudent().add(newStudent);
        }
        filedownload.print();
        writer.close();
    }

    public void print() {
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
    }

}
