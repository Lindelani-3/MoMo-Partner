package com.developerdiindy.momopartner.presentation.requesttopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;

public class SelectPayerActivity extends AppCompatActivity {

    Button btnSelectPayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_payer);

        setupPayerButton();
    }

    private void setupPayerButton() {
        btnSelectPayer = findViewById(R.id.btn_selectPayer);
        btnSelectPayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectPayerActivity.this, RequestDetailsActivity.class));
            }
        });
    }
}