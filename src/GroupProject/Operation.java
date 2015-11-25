/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupProject;

/**
 *
 * @author Jai
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.*;

public class Operation {

    
    public int calculateAge() {
        LocalDate birthdate = new LocalDate(1970, 1, 20);          //Birth date
        LocalDate now = new LocalDate();                    //Today's date
        Period period = new Period(birthdate, now, PeriodType.yearMonthDay());

        return period.getYears();
    }

    public Map<String, Integer> countOccurence(String checkThis, ArrayList<Student> vector) {
        String toCheck = checkThis;
        FileDownload student = new FileDownload();

        Map< String, Integer> stringMap = new HashMap<String, Integer>();
        String keyword = "";

        for (int i = 0; i < vector.size(); i++) {
            if (toCheck == "gender") {
                keyword = vector.get(i).getGender();
            }
            if (stringMap.containsKey(keyword)) {
                Integer wordCount = stringMap.get(vector.get(i));
                stringMap.put(keyword, new Integer(wordCount + 1));
            } else {
                stringMap.put(keyword, new Integer(1));
            }
        } 
        return stringMap;
    }
}

