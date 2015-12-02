/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */

package GroupProject;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
 
import java.io.File;
import java.io.IOException;
 
public class CSVtoArff {
  /**
   * takes 2 arguments:
   * - CSV input file
   * - ARFF output file
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