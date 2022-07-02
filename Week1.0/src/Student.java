import java.util.List;

public class Student extends Courses {
    private String name;
    private String birthDay;
    private String address;
    private  String gender;

    public Student(String name, String birthDay, String address, String gender, List<Courses> courseLists) {
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
        this.courseLists = courseLists;
    }

    public List<Courses> getCourseLists() {
        return courseLists;
    }

    public void setCourseLists(List<Courses> courseLists) {
        this.courseLists = courseLists;
    }

    private List<Courses> courseLists;

    //constructor
    public Student() {
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
