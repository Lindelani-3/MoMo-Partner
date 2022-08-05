package com.developerdiindy.momopartner.presentation.appuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.business.model.AppUser;
import com.developerdiindy.momopartner.business.util.Validator;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnRegister, btnLogin;
    EditText etEmail, etPassword;

    AppUser appUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Testing !!
        appUser = new AppUser(101);

        setupButtons();
    }

    private void setupButtons() {
        etEmail = findViewById(R.id.et_username_login);
        etPassword = findViewById(R.id.et_password_login);
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
                doLogin();
            }
        });
    }

    private void doLogin() {
        String strEmail = etEmail.getText().toString();
        String strPassword = etPassword.getText().toString();
        int isInputValid = Validator.checkUserInput_Login(LoginActivity.this, strEmail, strPassword);

        if (isInputValid == 0) {
            Bundle bundle = new Bundle();
            appUser.setEmail(strEmail);
            appUser.setPassword(strPassword);
            //ToDo return User in DB -> getUser (ID)
            // if noUser ->
            bundle.putInt("userId", appUser.getId());
            System.out.println(appUser.getId());
            startActivity(new Intent(LoginActivity.this, HomeActivity.class).putExtras(bundle));
            Toast.makeText(LoginActivity.this, "User Logged In", Toast.LENGTH_SHORT).show();
        }

    }
}