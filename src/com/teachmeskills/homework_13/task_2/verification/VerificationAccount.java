package com.teachmeskills.homework_13.task_2.verification;

import com.teachmeskills.homework_13.task_2.exception.WrongLoginException;
import com.teachmeskills.homework_13.task_2.exception.WrongPasswordException;

import static com.teachmeskills.homework_13.task_2.verification.VerificationLogin.doVerificationLogin;
import static com.teachmeskills.homework_13.task_2.verification.VerificationPassword.doVerificationPassword;

public class VerificationAccount {

    public static boolean doVerificationAccount(String login, String password, String confirmPassword){
        try {
            doVerificationLogin(login);
            doVerificationPassword(password, confirmPassword);
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