package com.example.week_3.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public abstract class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected String name;
    protected String address;
    protected long phoneNumber;
    @OneToMany(mappedBy = "instructor")
    protected List<Course> courseList = new ArrayList<>();


    public Instructor(){}
    public Instructor(String name, String address, long phoneNumber, List<Course> courseList) {
        if(courseList.size()>0) {
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.courseList = courseList;
            Course[] inCourseList= new Course[courseList.size()];
            setCourseInstructor(courseList.toArray(inCourseList));
        }
    }
    public Instructor(String name, String address, long phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Course> getCourseList() {
        return this.courseList;
    }

    public int getId() {
        return id;
    }
    private void setCourseInstructor(Course... courseList){ // to set an instructor to each course in the list
        for (Course course: courseList) {
            course.setInstructor(this);
        }
    }
    public void setCourse(Course... courses) { // course... courses pattern allows us to handle zero or a lot of courses as if we type Course[] courses
    }
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
        Course[] inCourseList= new Course[courseList.size()];
        setCourseInstructor(courseList.toArray(inCourseList));
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instructor)) return false;
        Instructor that = (Instructor) o;
        return phoneNumber == that.phoneNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,  phoneNumber);
    }

    @Override
    public String toString() {
        return "SchoolManagementSystem.Instructor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}