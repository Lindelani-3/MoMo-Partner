package com.developerdiindy.momopartner.presentation.appuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnRegister, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupButtons();
    }

    private void setupButtons() {
        btnRegister = findViewById(R.id.btn_reg_login);
        btnLogin = findViewById(R.id.btn_login);

        // transfer
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        // request
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                Toast.makeText(LoginActivity.this, "User Logged In", Toast.LENGTH_SHORT).show();
            }
        });
    }

}