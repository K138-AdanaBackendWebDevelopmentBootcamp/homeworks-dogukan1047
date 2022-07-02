package com.proje.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity//burada sqlde tutulacagını belirtik
public class Student {
    @Id
    @Column(unique = true,length = 10,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20,updatable = false)
    private String name;
   // @Temporal(TemporalType.DATE)//tarih türünde olduğunu belirtik
    private String birthofDay;
    private String address;
    private String gender;

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    @ManyToMany(mappedBy = "Student")
    private List<Courses> courses = new ArrayList<>();

    public Student() {
    }

    public Student(int id, String name, String birthofDay, String address, String gender) {
        this.id = id;
        this.name = name;
        this.birthofDay = birthofDay;
        this.address = address;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthofDay=" + birthofDay +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthofDay() {
        return birthofDay;
    }

    public void setBirthofDay(String birthofDay) {
        this.birthofDay = birthofDay;
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
