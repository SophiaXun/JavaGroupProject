package GroupProject;

/**
 *This class stores match attributes for the charts.
 * @author Nan Xia
 */
public class Peer {

    private String[] barXTitle = {"postgraduate_or_undergraduate", "field_of_education", "citizenship", "permanent_residence", "type_of_attendance", "country_of_birth"};
    private String[] barYTitle = {"age", "entrance_score", "course_gpa_earned"};
    private String[] pieXTitle = {"course_information", "postgraduate_or_undergraduate",
        "field_of_education", "gender", "citizenship", "term_residence", "permanent_residence",
        "type_of_attendance", "mode_of_attendance", "country_of_birth", "language_spoken_at_home",
        "year_of_arrival_in_usa", "entrance_score", "equity_data", "highest_level_of_education_prior_to_commencement",
        "course_completion_year", "course_gpa_earned"};
   
    private String[] lineYTitle = {"age", "entrance_score", "course_gpa_earned"};
    private String[] lineXTitle = {"year_of_arrival_in_usa", "course_completion_year"};
    private String[] scatterXTitle = {"postgraduate_or_undergraduate", "field_of_education", "citizenship", "permanent_residence", "type_of_attendance", "country_of_birth"};
    private String[] scatterYTitle = {"age", "entrance_score", "course_gpa_earned"};

    /**
     * This method gets the avaliable XTitle of bar. 
     * @return the barXTitle
     */
    public String[] getBarXTitle() {
        return barXTitle;
    }

    /**
     * @param barXTitle the barXTitle to set
     */
    public void setBarXTitle(String[] barXTitle) {
        this.barXTitle = barXTitle;
    }

    /**
     * This method gets the avaliable YTitle of bar.
     * @return the barYTitle
     */
    public String[] getBarYTitle() {
        return barYTitle;
    }

    /**
     * @param barYTitle the barYTitle to set
     */
    public void setBarYTitle(String[] barYTitle) {
        this.barYTitle = barYTitle;
    }

    /**
     * This method gets the avaliable XTitle of pie.
     * @return the pieXTitle
     */
    public String[] getPieXTitle() {
        return pieXTitle;
    }

    /**
     * This method sets the avaliable XTitle of pie.
     * @param pieXTitle the pieXTitle to set
     */
    public void setPieXTitle(String[] pieXTitle) {
        this.pieXTitle = pieXTitle;
    }

    /**
     * This method gets the avaliable XTitle of line.
     * @return the lineXTitle
     */
    public String[] getLineXTitle() {
        return lineXTitle;
    }

    /**
     * This method sets the avaliable XTitle of line.
     * @param lineXTitle the lineXTitle to set
     */
    public void setLineXTitle(String[] lineXTitle) {
        this.lineXTitle = lineXTitle;
    }

    /**
     * This method gets the avaliable YTitle of line.
     * @return the lineYTitle
     */
    public String[] getLineYTitle() {
        return lineYTitle;
    }

    /**
     * This method gets the avaliable YTitle of line.
     * @param lineYTitle the lineYTitle to set
     */
    public void setLineYTitle(String[] lineYTitle) {
        this.lineYTitle = lineYTitle;
    }



}
