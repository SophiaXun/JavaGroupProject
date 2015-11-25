package GroupProject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nan Xia
 */
public class Peer {

    String[] attributeTitle = {"course information", "enterance score", "gpa"};
    String[] courseinfo = {"gender", "type of attendance", "citizenship"};
    String[] entranceScore = {"gender", "citizenship", "course information"};
    String[] gpa = {"gender", "course information", "citizenship"};
    String[][] xyMeasure = {{"course information", "gender", "type of attendance", "citizenship"},
    {"entrance score", "gender", "citizenship", "course information"},
    {"gpa", "gender", "course information", "citizenship"}};

    /**
	 * @return the xyMeasure
	 */
	public String[][] getXyMeasure() {
		return xyMeasure;
	}
	/**
	 * @param xyMeasure the xyMeasure to set
	 */
	public void setXyMeasure(String[][] xyMeasure) {
		this.xyMeasure = xyMeasure;
	}
    /**
     * @return the attributeTitle
     */
    public String[] getAttributeTitle() {
        return attributeTitle;
    }

    /**
     * @param attributeTitle the attributeTitle to set
     */
    public void setAttributeTitle(String[] attributeTitle) {
        this.attributeTitle = attributeTitle;
    }

    /**
     * @return the courseinfo
     */
    public String[] getCourseinfo() {
        return courseinfo;
    }

    /**
     * @param courseinfo the courseinfo to set
     */
    public void setCourseinfo(String[] courseinfo) {
        this.courseinfo = courseinfo;
    }

    /**
     * @return the entranceScore
     */
    public String[] getEntranceScore() {
        return entranceScore;
    }

    /**
     * @param entranceScore the entranceScore to set
     */
    public void setEntranceScore(String[] entranceScore) {
        this.entranceScore = entranceScore;
    }

    /**
     * @return the gpa
     */
    public String[] getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(String[] gpa) {
        this.gpa = gpa;
    }

}
