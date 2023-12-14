package com.teachmeskills.homework_13.task_2.charArray;

public class CharNumber {
    public static boolean CharNumberCheck(String password){

        char[] chars = password.toCharArray();

        for (char i : chars) {
                if (i >= 48 && i <= 57){
                    return false;
                }
        }
        return true;
    }

}
