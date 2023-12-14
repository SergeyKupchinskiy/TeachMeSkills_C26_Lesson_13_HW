package com.teachmeskills.homework_13.task_1.exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super();
    }
    public WrongPasswordException(String message){
        super(message);
    }
}
