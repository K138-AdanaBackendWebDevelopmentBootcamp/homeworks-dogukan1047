public class Courses {
    private String name;
    private String coursesCode;//sonradan üzerinde işlem yapmayacağımız sayısal ifadeleri string tanımladım
    private int creditScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursesCode() {
        return coursesCode;
    }

    public void setCoursesCode(String coursesCode) {
        this.coursesCode = coursesCode;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
