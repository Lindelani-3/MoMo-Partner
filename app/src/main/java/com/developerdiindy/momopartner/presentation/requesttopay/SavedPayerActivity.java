package com.developerdiindy.momopartner.presentation.requesttopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;

public class SavedPayerActivity extends AppCompatActivity {

    Button btnSavedPayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_payer);

        setupRequestDetailsButton();
    }

    private void setupRequestDetailsButton() {
        btnSavedPayer = findViewById(R.id.btn_selectSavedPayer);
        btnSavedPayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SavedPayerActivity.this, RequestDetailsActivity.class));
            }
        });
    }
}