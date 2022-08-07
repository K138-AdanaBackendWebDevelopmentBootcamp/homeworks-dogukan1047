package com.example.loanapplicationsystem.contoller;

import com.example.loanapplicationsystem.service.SmsSendServices;
import org.springframework.beans.factory.annotation.Autowired;

public class SmsSendContoller {
    @Autowired
    private final SmsSendServices smsSendServices;


    public SmsSendContoller(SmsSendServices smsSendServices) {
        this.smsSendServices = smsSendServices;
    }
}
