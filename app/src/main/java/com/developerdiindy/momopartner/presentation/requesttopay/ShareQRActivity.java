package com.developerdiindy.momopartner.presentation.requesttopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.transfer.SelectPayeeActivity;
import com.developerdiindy.momopartner.presentation.transfer.TransferDetailsActivity;

public class ShareQRActivity extends AppCompatActivity {

    Button btnShareQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_qractivity);

        SetupShareButton();
    }

    private void SetupShareButton() {
        btnShareQR = findViewById(R.id.btn_shareQR);
        btnShareQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShareQRActivity.this, QRStatusActivity.class));
            }
        });
    }
}