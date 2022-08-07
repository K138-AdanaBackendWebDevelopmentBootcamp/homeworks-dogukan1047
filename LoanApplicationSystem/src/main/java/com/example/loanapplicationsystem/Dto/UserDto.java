package com.example.loanapplicationsystem.Dto;

import lombok.Data;

import javax.persistence.Column;


@Data
public class UserDto {


    @Column(name = "tc")
    private long tc;
    @Column(name="fullname")
    private String fullName;
    @Column(name="monthlysalary")
    private int monthlySalary;

    @Column(name = "phonenumber")
    private String phoneNumber;//
    @Column(name = "creditscoredefault")
    private  int creditScore;

}
