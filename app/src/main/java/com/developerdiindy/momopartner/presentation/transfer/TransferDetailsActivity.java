package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.test.core.app.ActivityScenario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;

public class TransferDetailsActivity extends AppCompatActivity {

    Button btnTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_details);

        setupButtons();
    }

    private void setupButtons() {
        btnTransfer = findViewById(R.id.btn_transfer_transfer);
        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TransferDetailsActivity.this, TransferStatusActivity.class));
            }
        });
    }
}

