package com.developerdiindy.momopartner.database;

import android.os.Handler;
import android.os.Looper;

import com.developerdiindy.momopartner.business.model.AppUser;
import com.vishnusivadas.advanced_httpurlconnection.FetchData;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class DatabaseHandler {

    public static String doSignUpUser(AppUser appUser) {
        final String[] result = {""};

        //Start ProgressBar first (Set visibility VISIBLE)
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                //Starting Write and Read data with URL
                //Creating array for parameters
                String[] field = new String[3];
                field[0] = "full_name";
                field[1] = "email";
                field[2] = "password";
                //Creating array for data
                String[] data = new String[3];
                data[0] = appUser.getFullName();
                data[1] = appUser.getEmail();
                data[2] = appUser.getPassword();

                PutData putData = new PutData("https://projects.vishnusivadas.com/AdvancedHttpURLConnection/putDataTest.php", "POST", field, data);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        result[0] = putData.getResult();
                        //End ProgressBar (Set visibility to GONE)
                    }
                }
                //End Write and Read data with URL
            }
        });

        return result[0];
    }

    public static String doLoginUser(AppUser appUser) {
        final String[] result = {""};

        //Start ProgressBar first (Set visibility VISIBLE)
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                FetchData fetchData = new FetchData("https://projects.vishnusivadas.com/AdvancedHttpURLConnection/readTest.php");
                if (fetchData.startFetch()) {
                    if (fetchData.onComplete()) {
                        result[0] = fetchData.getResult();
                        //End ProgressBar (Set visibility to GONE)
                    }
                }
            }
        });
        return result[0];
    }
}
