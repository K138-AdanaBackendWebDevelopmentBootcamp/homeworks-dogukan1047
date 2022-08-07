package com.example.loanapplicationsystem.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class SmsSend {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="smssent")
    private boolean smsSent;

}
