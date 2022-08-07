package com.example.loanapplicationsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name="user")
public class User {


    @Id
    @Column(name = "tc")
    private long tc;

    @Column(name="fullname")
    private String fullName;

    @Column(name="monthlysalary")
    private int monthlySalary;

    @Column(name = "phonenumber")
    private String phoneNumber;//Numeric values that are not processed should be defined as strings.
    @JsonIgnore
    @Column(name = "creditscoredefault")
    private  int creditScore;


    public User() {

    }
}
