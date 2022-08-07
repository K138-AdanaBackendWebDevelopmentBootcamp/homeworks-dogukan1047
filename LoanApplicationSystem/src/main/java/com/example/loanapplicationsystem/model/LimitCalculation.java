package com.example.loanapplicationsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
public class LimitCalculation {
    @Id
    @Column(name = "tc", nullable = false)
    @JsonIgnore
    private long tc;

    @OneToOne
    @JoinColumn(name="tc")
    @JsonIgnore
    private User user;

    private int creditLimit;


}
