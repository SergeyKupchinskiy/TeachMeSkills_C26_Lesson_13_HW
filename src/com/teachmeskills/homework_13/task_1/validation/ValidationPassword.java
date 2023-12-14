package com.teachmeskills.homework_13.task_1.validation;

import com.teachmeskills.homework_13.task_1.exception.WrongPasswordException;

public class ValidationPassword {

    public static int LENGTH_LIMIT = 20;
    public static void validationPassword(String password, String confirmPassword) throws WrongPasswordException{
        if (password.length() >= LENGTH_LIMIT ){
            throw new WrongPasswordException("Incorrect password. Maximum password length exceeded.");
        }
        if (!password.matches("[A-Za-z]*[0-9]+")){
            throw new WrongPasswordException("Incorrect password. The password must contain at least one number.");
        }
        if (password.contains(" ")){
            throw new WrongPasswordException("Incorrect password. Password cannot contain a space.");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Incorrect password. The confirmation password must match the password");
        }

    }
}
