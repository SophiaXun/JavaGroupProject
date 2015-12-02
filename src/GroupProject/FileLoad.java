/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * This class is for reading data from the local file and storing the file content in a temp file to protect the file.
 * 
 * @author Nan Xia
 */
public class FileLoad {
    public static ArrayList<Student> student = new ArrayList<Student>();
    
    /**
     * This method could read the data from local file. 
     * @param file
     * @throws IOException 
     */
    public static void readLocalFile(File file) throws IOException {
        InputStream input = new FileInputStream(file); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        //create a temp file to save the file, 
        File tempFile = new File("studentTemp.csv");
        Writer writer = new OutputStreamWriter(new FileOutputStream(tempFile));
         String line = null;
         while ((line = reader.readLine())!= null)
         {
           
            String[] attributeArray = null;
            if (line == null) {
                break;
            }
    
            writer.write(line + "\n");
            attributeArray = FileDownload.strToArray(line);
            Student newStudent = FileDownload.convertStrToStudent(attributeArray);
            FileLoad.student.add(newStudent);
            
        }
        FileLoad.print();
     
        writer.close();
    }
    /**
     * This method could be deleted it is for test. 
     */
        public static void print() {
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
    }
    }
