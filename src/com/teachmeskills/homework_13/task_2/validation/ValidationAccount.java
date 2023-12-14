package com.teachmeskills.homework_13.task_2.validation;

import com.teachmeskills.homework_13.task_2.exception.WrongLoginException;
import com.teachmeskills.homework_13.task_2.exception.WrongPasswordException;

import static com.teachmeskills.homework_13.task_2.validation.ValidationLogin.validationLogin;
import static com.teachmeskills.homework_13.task_2.validation.ValidationPassword.validationPassword;

public class ValidationAccount {

    public static boolean validationAccount(String login, String password, String confirmPassword){
        try {
            validationLogin(login);
            validationPassword(password, confirmPassword);
            return true;

        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}