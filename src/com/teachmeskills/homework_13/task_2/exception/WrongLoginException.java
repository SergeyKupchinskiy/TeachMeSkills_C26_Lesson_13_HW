package com.teachmeskills.homework_13.task_2.exception;

public class WrongLoginException extends Exception {

    public WrongLoginException(){
        super();
    }
    public WrongLoginException(String message){
        super(message);
    }

}
