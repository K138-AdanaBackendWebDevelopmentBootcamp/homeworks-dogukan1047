package com.proje.model;

import javax.persistence.Entity;

@Entity
public class VisitingInstructor extends Instructors {
    private double sumHourlySalary;
    private int hourlyFee = 20;//Saatlik ucret


    public VisitingInstructor(String name, String address, String phoneNumber, int id, double sumHourlySalary) {
        super(name, address, phoneNumber, id);
        this.sumHourlySalary = sumHourlySalary;
    }

    public VisitingInstructor() {

    }


    public double getSumHourlySalary() {
        return sumHourlySalary * hourlyFee;
    }

    public void setSumHourlySalary(double sumHourlySalary) {
        this.sumHourlySalary = sumHourlySalary;
    }
}
