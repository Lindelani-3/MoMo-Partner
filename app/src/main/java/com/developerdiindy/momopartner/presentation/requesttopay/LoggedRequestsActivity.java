package com.developerdiindy.momopartner.presentation.requesttopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;

public class LoggedRequestsActivity extends AppCompatActivity {

    Button btnLoggedRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_requests);

        setupRequestDetailsButton();
    }

    private void setupRequestDetailsButton() {
        btnLoggedRequest = findViewById(R.id.btn_selectRequest);
        btnLoggedRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoggedRequestsActivity.this, RequestDetailsActivity.class));
            }
        });
    }
}