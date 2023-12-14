package com.teachmeskills.homework_13.task_2.charArray;

public class LoginCharSpace {

    public static boolean charSpaceCheck(String login) {

        char[] chars = login.toCharArray();

        for (char i : chars) {
            if (i == 32) {
                return true;
            }

        }
        return false;
    }

}
