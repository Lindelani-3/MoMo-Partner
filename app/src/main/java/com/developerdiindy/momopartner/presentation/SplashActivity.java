package com.developerdiindy.momopartner.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.appuser.LoginActivity;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        doSplash();
    }

    private void doSplash() {
        final Intent i = new Intent(SplashActivity.this, LoginActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);

                finish();
            }
        }, 2000);
    }
}