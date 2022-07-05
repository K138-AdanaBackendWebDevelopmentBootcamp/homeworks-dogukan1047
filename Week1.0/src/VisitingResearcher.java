public class VisitingResearcher extends Instructor{
    private double sumHourlySalary;
    private int hourlyFee=20;//Saatlik ucret
    public VisitingResearcher() {
    }

    public VisitingResearcher(String coursesName, String phoneNumber, String address,double sumHourlySalary) {
        super(coursesName, phoneNumber, address);
        this.sumHourlySalary=sumHourlySalary;
    }

    public double getHourlySalary() {
        return sumHourlySalary*20;
    }

    public void setHourlySalary(double sumHourlySalary) {
        this.sumHourlySalary = sumHourlySalary;
    }


}
