package com.example.loanapplicationsystem.exceptions;

public class FullNameCannotBeEmptyException extends RuntimeException{
    public FullNameCannotBeEmptyException(String msg){
        super(msg);
    }

}
