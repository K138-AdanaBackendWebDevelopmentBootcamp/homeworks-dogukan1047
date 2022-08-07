package com.example.loanapplicationsystem.service;


import com.example.loanapplicationsystem.model.LimitCalculation;
import org.springframework.stereotype.Service;

@Service
public interface LimitCalculationServices {


    LimitCalculation createLimit(LimitCalculation limitCalculation,long tc);

    LimitCalculation getLimit(long tc);
}
