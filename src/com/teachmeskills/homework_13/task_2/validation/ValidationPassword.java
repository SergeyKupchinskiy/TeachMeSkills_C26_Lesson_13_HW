package com.teachmeskills.homework_13.task_2.validation;

import com.teachmeskills.homework_13.task_2.exception.WrongPasswordException;
import com.teachmeskills.homework_13.task_2.charArray.CharNumber;
import com.teachmeskills.homework_13.task_2.charArray.PasswordCharSpace;

public class ValidationPassword {

    public static int LENGTH_LIMIT = 20;
    public static void validationPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= LENGTH_LIMIT ){
            throw new WrongPasswordException("Incorrect password. Maximum password length exceeded.");
        }
        if (CharNumber.charNumberCheck(password)){
            throw new WrongPasswordException("Incorrect password. The password must contain at least one number.");
        }
        if (PasswordCharSpace.charSpaceCheck(password)){
            throw new WrongPasswordException("Incorrect password. Password cannot contain a space.");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Incorrect password. The confirmation password must match the password");
        }

    }
}
