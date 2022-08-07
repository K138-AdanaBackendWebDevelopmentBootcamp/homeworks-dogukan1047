package com.example.loanapplicationsystem.exceptions;

public class CreditInfoNotFoundException extends RuntimeException{
    public CreditInfoNotFoundException(String msg){
        super(msg);
    }
}
