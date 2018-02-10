package com.example.zangt.application_a2;

/**
 * Created by zangt on 2018/2/9.
 */

public class passwordCheck {


    public int lengthCheck(String pd) {
        if (pd.length() > 7)
            return 0;
        else
            return 100;
    }

    public int equalCheck(String pd) {
        if (!pd.equals("password"))
            return 1;
        else
            return 101;
    }

    public int digitsCheck(String pd) {
        if (!pd.matches("[0-9]+")) {
            return 30;
        }
        return 2;
    }

    public int ifLower(String pd) {
        if (!pd.matches("[0-9a-z]+")) {
            return 60;
        }
        return 3;
    }

    public int ifUpper(String pd) {
        if (!pd.matches("[0-9a-zA-Z]+")) {

            return 90;
        }
        return 4;
    }

}