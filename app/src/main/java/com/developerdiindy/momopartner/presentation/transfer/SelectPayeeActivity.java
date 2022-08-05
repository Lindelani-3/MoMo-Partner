package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;

public class SelectPayeeActivity extends AppCompatActivity {

    Button btnSelectPayee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_payee);

        setupPayeeButton();
    }

    private void setupPayeeButton() {
        btnSelectPayee = findViewById(R.id.btn_selectPayee);
        btnSelectPayee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectPayeeActivity.this, TransferDetailsActivity.class));
            }
        });
    }
}