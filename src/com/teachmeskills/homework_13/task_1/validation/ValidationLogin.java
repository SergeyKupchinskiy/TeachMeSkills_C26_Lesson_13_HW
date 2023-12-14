package com.teachmeskills.homework_13.task_1.validation;

import com.teachmeskills.homework_13.task_1.exception.WrongLoginException;

public class ValidationLogin {

    public static int LENGTH_LIMIT = 20;
    public static void validationLogin(String login) throws WrongLoginException {
        if (login.length() >= LENGTH_LIMIT ){
            throw new WrongLoginException("Incorrect login. Maximum login length exceeded.");
        }
        if (login.contains(" ")){
            throw new WrongLoginException("Incorrect login. Login cannot contain a space.");
        }
        if (login.isEmpty()){
            throw new WrongLoginException("Incorrect login. Login cannot be empty.");
        }
    }
}
