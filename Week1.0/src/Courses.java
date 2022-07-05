import java.util.List;

public class Courses {
    private String name;
    private String coursesCode;//sonradan üzerinde işlem yapmayacağımız sayısal ifadeleri string tanımladım
    private int creditScore;
    private List<Student> studentLists;

    public Courses() {
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                ", coursesCode='" + coursesCode + '\'' +
                ", creditScore=" + creditScore +
                ", studentLists=" + studentLists +
                '}';
    }

    public Courses(String name, String coursesCode, int creditScore, List<Student> studentLists) {
        this.name = name;
        this.coursesCode = coursesCode;
        this.creditScore = creditScore;
        this.studentLists = studentLists;
    }

    public List<Student> getStudentLists() {
        return studentLists;
    }

    public void setStudentLists(List<Student> studentLists) {
        this.studentLists = studentLists;
    }

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
