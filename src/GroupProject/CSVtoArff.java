package GroupProject;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
 
import java.io.File;
import java.io.IOException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class is to transfer the csv file to arff file
 * @author Javier
 */

public class CSVtoArff {
  /**
   * This method transfer csv file to arff file
     * @param inputcsv CSV input file
     * @param outputarff ARFF output file
     * @throws java.io.IOException
   */
  public static void convert( String inputcsv, String outputarff) throws IOException {
   
    // load CSV
    CSVLoader loader = new CSVLoader();
    loader.setSource(new File(inputcsv));
    File testing = new File(inputcsv);
    if(testing != null){
        System.out.println("found the  file");
        System.out.println(testing.toString());
    }
    System.out.println("i got here");
    System.out.println(inputcsv);
    System.out.println(outputarff);
    Instances data = loader.getDataSet();
 
    // save ARFF
    ArffSaver saver = new ArffSaver();
    saver.setInstances(data);
    saver.setFile(new File(outputarff));
    //.saver.setDestination(new File(outputarff));
    saver.writeBatch();
  }
}