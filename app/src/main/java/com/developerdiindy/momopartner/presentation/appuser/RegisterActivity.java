package com.developerdiindy.momopartner.presentation.appuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.business.model.AppUser;
import com.developerdiindy.momopartner.business.util.Validator;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    Button btnRegister, btnLogin;
    TextInputEditText etFullName, etEmail, etPassword, etConfirmPassword;

    AppUser appUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        setupViewItems();
    }

    private void setupViewItems() {
        etFullName = findViewById(R.id.et_fullname_register);
        etEmail = findViewById(R.id.et_email_register);
        etPassword = findViewById(R.id.et_password_register);
        etConfirmPassword = findViewById(R.id.et_confirm_password_register);

        btnRegister = findViewById(R.id.btn_reg);
        btnLogin = findViewById(R.id.btn_login_reg);

        // transfer
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ToDo register()
                startActivity(new Intent(RegisterActivity.this, HomeActivity.class));
                Toast.makeText(RegisterActivity.this, "User Registered", Toast.LENGTH_SHORT).show();
            }
        });

        // request
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }

    private void doRegister() {
        String strFullName = etFullName.getText().toString();
        String strEmail = etEmail.getText().toString();
        String strPassword = etPassword.getText().toString();
        String strConfirmPass = etConfirmPassword.getText().toString();

        int isInputValid = Validator.checkUserInput_Register(RegisterActivity.this, strFullName, strEmail, strPassword, strConfirmPass);

        if (isInputValid == 0) {
            Bundle bundle = new Bundle();
            appUser = new AppUser(strFullName, strEmail, strPassword);
            //ToDo add User to DB -> getUser (ID)
            // if existsUser ->
            bundle.putInt("userId", appUser.getId());
            System.out.println(appUser.getId());
            startActivity(new Intent(RegisterActivity.this, HomeActivity.class).putExtras(bundle));
            Toast.makeText(RegisterActivity.this, "User Logged In", Toast.LENGTH_SHORT).show();
        }
    }

}