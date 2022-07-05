package com.proje.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity//Mysqlde sorgu yapılacagını belirtir
public class Courses {
    private String coursesName;
    private String creditScore;
    @Id//primary key olarak uniqe bir deger olduğunu belirtik
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coursesCode;

    public List<com.proje.model.Student> getStudent() {
        return Student;
    }

    public void setStudent(List<com.proje.model.Student> student) {
        Student = student;
    }

    @ManyToOne
    private Instructors instructors;



    @ManyToMany
    private List<Student> Student = new ArrayList<>();

    public Courses(String coursesName, String creditScore, int coursesCode) {
        this.coursesName = coursesName;
        this.creditScore = creditScore;
        this.coursesCode = coursesCode;
    }

    public Courses() {
    }

    public String getCoursesName() {
        return coursesName;
    }

    public void setCoursesName(String coursesName) {
        this.coursesName = coursesName;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public int getCoursesCode() {
        return coursesCode;
    }

    public void setCoursesCode(int coursesCode) {
        this.coursesCode = coursesCode;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "coursesName='" + coursesName + '\'' +
                ", creditScore='" + creditScore + '\'' +
                ", coursesCode=" + coursesCode +
                '}';
    }
}
