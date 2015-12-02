package GroupProject;

/**
 *
 * @author Nan Xia
 */
public class Peer {

    private String[] barXTitle = {"postgraduate_or_undergraduate", "field_of_education", "citizenship", "permanent_residence", "type_of_attendance", "country_of_birth"};
    private String[] barYTitle = {"age", "entrance_score", "course_gpa_earned"};
    private String[] pieXTitle = {"course_information", "postgraduate_or_undergraduate",
        "field_of_education", "age", "gender", "citizenship", "term_residence", "permanent_residence",
        "type_of_attendance", "mode_of_attendance", "country_of_birth", "language_spoken_at_home",
        "year_of_arrival_in_usa", "entrance_score", "equity_data", "highest_level_of_education_prior_to_commencement",
        "course_completion_year", "course_gpa_earned"};
   
    private String[] lineYTitle = {"age", "entrance_score", "course_gpa_earned"};
    private String[] lineXTitle = {"year_of_arrival_in_usa", "course_completion_year"};
    private String[] scatterXTitle = {"postgraduate_or_undergraduate", "field_of_education", "citizenship", "permanent_residence", "type_of_attendance", "country_of_birth"};
    private String[] scatterYTitle = {"age", "entrance_score", "course_gpa_earned"};

    /**
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
     * @return the pieXTitle
     */
    public String[] getPieXTitle() {
        return pieXTitle;
    }

    /**
     * @param pieXTitle the pieXTitle to set
     */
    public void setPieXTitle(String[] pieXTitle) {
        this.pieXTitle = pieXTitle;
    }

    /**
     * @return the lineXTitle
     */
    public String[] getLineXTitle() {
        return lineXTitle;
    }

    /**
     * @param lineXTitle the lineXTitle to set
     */
    public void setLineXTitle(String[] lineXTitle) {
        this.lineXTitle = lineXTitle;
    }

    /**
     * @return the lineYTitle
     */
    public String[] getLineYTitle() {
        return lineYTitle;
    }

    /**
     * @param lineYTitle the lineYTitle to set
     */
    public void setLineYTitle(String[] lineYTitle) {
        this.lineYTitle = lineYTitle;
    }

    /**
     * @return the lineZTitle
     */
    

    /**
     * @return the scatterXTitle
     */
    public String[] getScatterXTitle() {
        return scatterXTitle;
    }

    /**
     * @param scatterXTitle the scatterXTitle to set
     */
    public void setScatterXTitle(String[] scatterXTitle) {
        this.scatterXTitle = scatterXTitle;
    }

    /**
     * @return the scatterYTitle
     */
    public String[] getScatterYTitle() {
        return scatterYTitle;
    }

    /**
     * @param scatterYTitle the scatterYTitle to set
     */
    public void setScatterYTitle(String[] scatterYTitle) {
        this.scatterYTitle = scatterYTitle;
    }

}
