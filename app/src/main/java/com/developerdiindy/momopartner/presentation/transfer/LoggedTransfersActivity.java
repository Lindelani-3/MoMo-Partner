
package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.developerdiindy.momopartner.R;

public class LoggedTransfersActivity extends AppCompatActivity {

    Button btnSelectTransfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_transfers);

        setupTransferDetailsButton();
    }

    private void setupTransferDetailsButton() {
        btnSelectTransfer = findViewById(R.id.btn_selectTransfer);
        btnSelectTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoggedTransfersActivity.this, TransferDetailsActivity.class));
            }
        });
    }
}