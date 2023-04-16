package com.orkunxy.UberEats.exception;

import lombok.Getter;

@Getter
public class UberEatsManagerExcepiton extends  RuntimeException{
    private final ErrorType errorType;
    public UberEatsManagerExcepiton(ErrorType errorType, String customMessage){
        super(customMessage);
        this.errorType = errorType;
    }
    public UberEatsManagerExcepiton(ErrorType errorType){
        this.errorType = errorType;
    }
}
