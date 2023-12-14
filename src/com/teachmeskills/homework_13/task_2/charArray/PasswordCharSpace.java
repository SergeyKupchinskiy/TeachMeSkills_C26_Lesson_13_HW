package com.teachmeskills.homework_13.task_2.charArray;

public class PasswordCharSpace {
    public static boolean charSpaceCheck(String password) {

        char[] chars = password.toCharArray();

        for (char i : chars) {
            if (i == 32) {
                return true;
            }

        }
        return false;
    }

}


