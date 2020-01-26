package model;

public class CourseModel {

    private String title;
    private String unite;

    public CourseModel() {
    }

    public CourseModel(String title, String unite) {
        this.title = title;
        this.unite = unite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    @Override
    public String toString() {
        return "CourseModel\n" +
                "title='" + title + '\t' +
                ", unite='" + unite +
                '}';
    }
}
