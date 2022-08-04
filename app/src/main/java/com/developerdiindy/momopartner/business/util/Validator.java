package com.developerdiindy.momopartner.business.util;

import android.content.Context;
import android.widget.Toast;


public class Validator {

    public static int checkUserInput_Login(Context loginActivity, String email, String password) {
        if (email.equals("")) {
            Toast.makeText(loginActivity, "Enter Valid Email", Toast.LENGTH_LONG).show();
            return 1;
        }
        if (password.equals("")) {
            Toast.makeText(loginActivity, "Enter Password", Toast.LENGTH_LONG).show();
            return 1;
        }
        return 0;
    }
}
