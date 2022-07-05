package com.proje.model;

import javax.persistence.Entity;

@Entity
public class ParmanentResearcher extends Instructors{
private double fixedSalary;

    public ParmanentResearcher(String name, String address, String phoneNumber, int id, double fixedSalary) {
        super(name, address, phoneNumber, id);
        this.fixedSalary = fixedSalary;
    }

    public ParmanentResearcher(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
