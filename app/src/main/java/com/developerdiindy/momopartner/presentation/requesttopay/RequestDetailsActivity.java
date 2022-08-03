package com.developerdiindy.momopartner.presentation.requesttopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;
import com.developerdiindy.momopartner.presentation.transfer.TransferDetailsActivity;

public class RequestDetailsActivity extends AppCompatActivity {

    Button btnRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_details);

        setupButtons();
    }

    private void setupButtons() {
        btnRequest = findViewById(R.id.btn_reqToPay_reqToPay);
        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RequestDetailsActivity.this, HomeActivity.class));
            }
        });
    }
}