package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.developerdiindy.momopartner.R;

public class TransferDetailsActivity extends AppCompatActivity {

    Button btnTransfer;
    EditText etExternalId, etAmount, etPartyId, etMyMessage, etPayeeNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_details);

        getUserInput();
        setupButtons();
    }

    private void getUserInput() {
        setupInputViews();
    }

    private void setupInputViews() {
        etExternalId = findViewById(R.id.et_transfer_externalId);
        etAmount = findViewById(R.id.et_transfer_amount);
        etPartyId = findViewById(R.id.et_transfer_payeePartyID);
        etMyMessage = findViewById(R.id.et_transfer_payerMessage);
        etPayeeNote = findViewById(R.id.et_transfer_payeeNote);
    }

    private void setupButtons() {
        btnTransfer = findViewById(R.id.btn_transfer_transfer);
        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doTransfer();
                startActivity(new Intent(TransferDetailsActivity.this, TransferStatusActivity.class));
            }
        });
    }

    private void doTransfer() {
        doCreateAccessToken_POST();
        doTransfer_POST();
        doGetTransferStatus_GET();
    }

    private void doGetTransferStatus_GET() {

    }

    private void doTransfer_POST() {

    }

    private void doCreateAccessToken_POST() {

    }
}

