package GroupProject;

/**
 * This class stores student object.
 *
 * @author Nan Xia
 */

public class Student {

    private String iD;
    private String courseInformation;
    private String postgraduateOrUnderGraduate;
    private String fieldOfEducation;
    private String age;
    private String gender;
    private String citizenship;
    private String termResidence;
    private String permanentResidence;
    private String basisForAdmission;
    private String typeOfAttendance;
    private String modeOfAttendance;
    private String countryOfBirth;
    private String languageSpokenAtHome;
    private String yearOfArrivalInUsa;
    private String entranceScore;
    private String equityData;
    private String highestLevelOfEducationPriorToCommencement;
    private String courseCompletionYear;
    private String courseGpaEarned;

    /**
     * This method gets the age of student.
     *
     * @return age.
     */
    public String getAge() {
        return age;
    }

    /**
     * This method sets the age of student.
     *
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * This method gets the gender of student.
     *
     * @return gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method sets the gender of student.
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method gets the id of student.
     *
     * @return the iD
     */
    public String getiD() {
        return iD;
    }

    /**
     * This method sets the id of student.
     *
     * @param iD the iD to set
     */
    public void setiD(String iD) {
        this.iD = iD;
    }

    /**
     * This method gets the course information of student.
     *
     * @return the courseInformation
     */
    public String getCourseInformation() {
        return courseInformation;
    }

    /**
     * This method sets the course information of student.
     *
     * @param courseInformation the courseInformation to set
     */
    public void setCourseInformation(String courseInformation) {
        this.courseInformation = courseInformation;
    }

    /**
     * This method gets the graduate status of student.
     *
     * @return the postgraduateOrUnderGraduate
     */
    public String getPostgraduateOrUnderGraduate() {
        return postgraduateOrUnderGraduate;
    }

    /**
     * This method sets the graduate status of student.
     *
     * @param postgraduateOrUnderGraduate the postgraduateOrUnderGraduate to set
     */
    public void setPostgraduateOrUnderGraduate(String postgraduateOrUnderGraduate) {
        this.postgraduateOrUnderGraduate = postgraduateOrUnderGraduate;
    }

    /**
     * This method gets the field of student.
     *
     * @return the fieldOfEducation
     */
    public String getFieldOfEducation() {
        return fieldOfEducation;
    }

    /**
     * This method sets the field of education of student.
     *
     * @param fieldOfEducation the fieldOfEducation to set
     */
    public void setFieldOfEducation(String fieldOfEducation) {
        this.fieldOfEducation = fieldOfEducation;
    }

    /**
     * This method gets the citizenship of student.
     *
     * @return the citizenship
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * This method sets the citizenship of student.
     *
     * @param citizenship the citizenship to set
     */
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    /**
     * This method gets the term residence of student.
     *
     * @return the termResidence
     */
    public String getTermResidence() {
        return termResidence;
    }

    /**
     * This method sets the term residence of student.
     *
     * @param termResidence the termResidence to set
     */
    public void setTermResidence(String termResidence) {
        this.termResidence = termResidence;
    }

    /**
     * This method gets the permanent residence of student.
     *
     * @return the permanentResidence
     */
    public String getPermanentResidence() {
        return permanentResidence;
    }

    /**
     * This method sets the permanent residence of student.
     *
     * @param permanentResidence the permanentResidence to set
     */
    public void setPermanentResidence(String permanentResidence) {
        this.permanentResidence = permanentResidence;
    }

    /**
     * This method gets the basis for admission of student.
     *
     * @return the basisForAdmission
     */
    public String getBasisForAdmission() {
        return basisForAdmission;
    }

    /**
     * This method sets the basis for admission of student.
     *
     * @param basisForAdmission the basisForAdmission to set
     */
    public void setBasisForAdmission(String basisForAdmission) {
        this.basisForAdmission = basisForAdmission;
    }

    /**
     * This method gets the type of attendance of student.
     *
     * @return the typeOfAttendance
     */
    public String getTypeOfAttendance() {
        return typeOfAttendance;
    }

    /**
     * This method sets the type of attendance of student.
     *
     * @param typeOfAttendance the typeOfAttendance to set
     */
    public void setTypeOfAttendance(String typeOfAttendance) {
        this.typeOfAttendance = typeOfAttendance;
    }

    /**
     * This method gets the mode of attendance of student.
     *
     * @return the modeOfAttendance
     */
    public String getModeOfAttendance() {
        return modeOfAttendance;
    }

    /**
     * This method sets the mode attendance of student.
     *
     * @param modeOfAttendance the modeOfAttendance to set
     */
    public void setModeOfAttendance(String modeOfAttendance) {
        this.modeOfAttendance = modeOfAttendance;
    }

    /**
     * This method gets the country of birth of student.
     *
     * @return the countryOfBirth
     */
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * This method sets the country of birth of student.
     *
     * @param countryOfBirth the countryOfBirth to set
     */
    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    /**
     * This method gets the language of student.
     *
     * @return the languageSpokenAtHome
     */
    public String getLanguageSpokenAtHome() {
        return languageSpokenAtHome;
    }

    /**
     * This method sets the language of student.
     *
     * @param languageSpokenAtHome the languageSpokenAtHome to set
     */
    public void setLanguageSpokenAtHome(String languageSpokenAtHome) {
        this.languageSpokenAtHome = languageSpokenAtHome;
    }

    /**
     * This method gets the year of arrival of student.
     *
     * @return the yearOfArrivalInUsa
     */
    public String getYearOfArrivalInUsa() {
        return yearOfArrivalInUsa;
    }

    /**
     * This method sets the year of arrival of student.
     *
     * @param yearOfArrivalInUsa the yearOfArrivalInUsa to set
     */
    public void setYearOfArrivalInUsa(String yearOfArrivalInUsa) {
        this.yearOfArrivalInUsa = yearOfArrivalInUsa;
    }

    /**
     * This method gets the entrance score of student.
     *
     * @return the entranceScore
     */
    public String getEntranceScore() {
        return entranceScore;
    }

    /**
     * This method sets the entrance score of student.
     *
     * @param entranceScore the entranceScore to set
     */
    public void setEntranceScore(String entranceScore) {
        this.entranceScore = entranceScore;
    }

    /**
     * This method gets the equity data of student.
     *
     * @return the equityData
     */
    public String getEquityData() {
        return equityData;
    }

    /**
     * This method sets the equity data of student.
     *
     * @param equityData the equityData to set
     */
    public void setEquityData(String equityData) {
        this.equityData = equityData;
    }

    /**
     * This method gets the highestlevel of student.
     *
     * @return the highestLevelOfEducationPriorToCommencement
     */
    public String getHighestLevelOfEducationPriorToCommencement() {
        return highestLevelOfEducationPriorToCommencement;
    }

    /**
     * This method sets the level of student.
     *
     * @param highestLevelOfEducationPriorToCommencement the
     * highestLevelOfEducationPriorToCommencement to set
     */
    public void setHighestLevelOfEducationPriorToCommencement(String highestLevelOfEducationPriorToCommencement) {
        this.highestLevelOfEducationPriorToCommencement = highestLevelOfEducationPriorToCommencement;
    }

    /**
     * This method gets the completion year of student.
     *
     * @return the courseCompletionYear
     */
    public String getCourseCompletionYear() {
        return courseCompletionYear;
    }

    /**
     * This method sets the completion year of student.
     *
     * @param courseCompletionYear the courseCompletionYear to set
     */
    public void setCourseCompletionYear(String courseCompletionYear) {
        this.courseCompletionYear = courseCompletionYear;
    }

    /**
     * This method gets the gpa of student.
     *
     * @return the courseGpaEarned
     */
    public String getCourseGpaEarned() {
        return courseGpaEarned;
    }

    /**
     * This method sets the gpa of student.
     *
     * @param courseGpaEarned the courseGpaEarned to set
     */
    public void setCourseGpaEarned(String courseGpaEarned) {
        this.courseGpaEarned = courseGpaEarned;
    }

    @Override
    /**
     * This method overrides the toString to make the string format.
     *
     * @return String student.
     */
    public String toString() {
        return "Student{" + "iD=" + iD + ", courseInformation=" + courseInformation + ", postgraduateOrUnderGraduate=" + postgraduateOrUnderGraduate + ", fieldOfEducation=" + fieldOfEducation + ", age=" + age + ", gender=" + gender + ", citizenship=" + citizenship + ", termResidence=" + termResidence + ", permanentResidence=" + permanentResidence + ", basisForAdmission=" + basisForAdmission + ", typeOfAttendance=" + typeOfAttendance + ", modeOfAttendance=" + modeOfAttendance + ", countryOfBirth=" + countryOfBirth + ", languageSpokenAtHome=" + languageSpokenAtHome + ", yearOfArrivalInUsa=" + yearOfArrivalInUsa + ", entranceScore=" + entranceScore + ", equityData=" + equityData + ", highestLevelOfEducationPriorToCommencement=" + highestLevelOfEducationPriorToCommencement + ", courseCompletionYear=" + courseCompletionYear + ", courseGpaEarned=" + courseGpaEarned + '}';
    }

}
