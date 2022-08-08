package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;

public class ScanQRActivity extends AppCompatActivity {

    Button btnScanQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qractivity);

        setupItemViews();
    }

    private void setupItemViews() {
        btnScanQR = findViewById(R.id.btn_scanQR);
        btnScanQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScanQRActivity.this, TransferDetailsActivity.class));
            }
        });
    }
}