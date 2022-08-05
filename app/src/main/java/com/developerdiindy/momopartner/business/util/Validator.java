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

    public static int checkUserInput_Register(Context RegisterActivity, String firstName, String lastName, String email, String password, String confirmPassword) {
        if (firstName.equals("")) {
            Toast.makeText(RegisterActivity, "Enter First Name", Toast.LENGTH_LONG).show();
            return 1;
        }
        if (lastName.equals("")) {
            Toast.makeText(RegisterActivity, "Enter Last Name", Toast.LENGTH_LONG).show();
            return 1;
        }
        if (email.equals("")) {
            Toast.makeText(RegisterActivity, "Enter Email", Toast.LENGTH_LONG).show();
            return 1;
        }
        if (password.equals("")) {
            Toast.makeText(RegisterActivity, "Enter Password", Toast.LENGTH_LONG).show();
            return 1;
        }
        if (confirmPassword.equals("")) {
            Toast.makeText(RegisterActivity, "Re-Enter Password", Toast.LENGTH_LONG).show();
            return 1;
        }
        return 0;
    }
}
