package com.teachmeskills.homework_13.task_1.exception;

public class WrongLoginException extends Exception {

    public WrongLoginException(){
        super();
    }
    public WrongLoginException(String message){
        super(message);
    }

}
