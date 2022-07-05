public class ParmanentInstructor extends Instructor{
    private double fixedSalary;

    public ParmanentInstructor() {

    }

    public ParmanentInstructor(String coursesName, String phoneNumber, String address, double fixedSalary) {
        super(coursesName, phoneNumber, address);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
