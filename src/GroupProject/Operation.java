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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.joda.time.*;

public class Operation {

    public int calculateAge() {
        LocalDate birthdate = new LocalDate(1970, 1, 20);          //Birth date
        LocalDate now = new LocalDate();                    //Today's date
        Period period = new Period(birthdate, now, PeriodType.yearMonthDay());

        return period.getYears();
    }

    private int whichColumn(String check, Student student) {
        int index = 0;

        if (student.getCourseInformation().equals(check)) {
            index = 1;
        } else if (student.getPostgraduateOrUnderGraduate().equals(check)) {
            index = 2;
        } else if (student.getFieldOfEducation().equals(check)) {
            index = 3;
        } else if (student.getAge().equals(check)) {
            index = 4;
        } else if (student.getGender().equals(check)) {
            index = 5;
        } else if (student.getCitizenship().equals(check)) {
            index = 6;
        } else if (student.getTermResidence().equals(check)) {
            index = 7;
        } else if (student.getPermanentResidence().equals(check)) {
            index = 8;
        } else if (student.getBasisForAdmission().equals(check)) {
            index = 9;
        } else if (student.getTypeOfAttendance().equals(check)) {
            index = 10;
        } else if (student.getModeOfAttendance().equals(check)) {
            index = 11;
        } else if (student.getCountryOfBirth().equals(check)) {
            index = 12;
        } else if (student.getLanguageSpokenAtHome().equals(check)) {
            index = 13;
        } else if (student.getYearOfArrivalInUsa().equals(check)) {
            index = 14;
        } else if (student.getEntranceScore().equals(check)) {
            index = 15;
        } else if (student.getEquityData().equals(check)) {
            index = 16;
        } else if (student.getHighestLevelOfEducationPriorToCommencement().equals(check)) {
            index = 17;
        } else if (student.getCourseCompletionYear().equals(check)) {
            index = 18;
        } else if (student.getCourseGpaEarned().equals(check)) {
            index = 19;
        }

        return index;
    }

    public Map<String, Long> pieChart(String checkThis, ArrayList<Student> vector) {
        String keyword = "";
//        System.out.println(checkThis);
        ArrayList listKeyword = new ArrayList();
        Map< String, Long> stringMap = new HashMap<>();
        int index = whichColumn(checkThis, vector.get(0));

        for (int i = 1; i < vector.size(); i++) {
            if (index == 1) {
                keyword = vector.get(i).getCourseInformation();
            } else if (index == 2) {
                keyword = vector.get(i).getPostgraduateOrUnderGraduate();
            } else if (index == 3) {
                keyword = vector.get(i).getFieldOfEducation();
            } else if (index == 5) {
                keyword = vector.get(i).getGender();
            } else if (index == 6) {
                keyword = vector.get(i).getCitizenship();
            } else if (index == 7) {
                keyword = vector.get(i).getTermResidence();
            } else if (index == 8) {
                keyword = vector.get(i).getPermanentResidence();
            } else if (index == 9) {
                keyword = vector.get(i).getBasisForAdmission();
            } else if (index == 10) {
                keyword = vector.get(i).getTypeOfAttendance();
            } else if (index == 11) {
                keyword = vector.get(i).getModeOfAttendance();
            } else if (index == 12) {
                keyword = vector.get(i).getCountryOfBirth();
            } else if (index == 13) {
                keyword = vector.get(i).getLanguageSpokenAtHome();
            } else if (index == 14) {
                keyword = vector.get(i).getYearOfArrivalInUsa();
            } else if (index == 16) {
                keyword = vector.get(i).getEquityData();
            } else if (index == 17) {
                keyword = vector.get(i).getHighestLevelOfEducationPriorToCommencement();
            } else if (index == 18) {
                keyword = vector.get(i).getCourseCompletionYear();
            } else if (index == 19) {
                keyword = vector.get(i).getCourseGpaEarned();
            }
            System.out.println(keyword);
            listKeyword.add(keyword);
        }

        stringMap = (Map<String, Long>) listKeyword.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return stringMap;
    }
}
