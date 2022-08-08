package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;
import com.developerdiindy.momopartner.presentation.requesttopay.QRStatusActivity;

public class TransferStatusActivity extends AppCompatActivity {

    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_status);

        setupDoneButton();
    }

    private void setupDoneButton() {
        btnDone = findViewById(R.id.btn_transferStatus_finish);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TransferStatusActivity.this, HomeActivity.class));
            }
        });
    }
}