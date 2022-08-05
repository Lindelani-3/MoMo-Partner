package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.requesttopay.RequestDetailsActivity;
import com.developerdiindy.momopartner.presentation.requesttopay.SavedPayerActivity;

public class SavedPayeeActivity extends AppCompatActivity {

    Button btnSavedPayee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_payee);

        setupTransferDetailsButton();
    }

    private void setupTransferDetailsButton() {
        btnSavedPayee = findViewById(R.id.btn_selectSavedPayee);
        btnSavedPayee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SavedPayeeActivity.this, TransferDetailsActivity.class));
            }
        });
    }
}