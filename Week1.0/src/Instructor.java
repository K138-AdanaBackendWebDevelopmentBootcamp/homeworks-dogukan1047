public class Instructor extends Student {
    private String coursesName;
    private String phoneNumber;//değişmez sayısal ifadelere String turunde tanimladim
    private String address;
    public Instructor(){

    }
    public Instructor(String coursesName,String phoneNumber,String address){
        super();
        this.coursesName=coursesName;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }
    public String getName(){
        return coursesName;
    }
    public void setName(String coursesName){
        this.coursesName=coursesName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
