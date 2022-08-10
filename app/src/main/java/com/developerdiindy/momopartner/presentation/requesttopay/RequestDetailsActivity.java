package com.developerdiindy.momopartner.presentation.requesttopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.business.model.RequestToPay;

public class RequestDetailsActivity extends AppCompatActivity {

    Button btnRequest;
    EditText etExternalId, etAmount, etPartyId, etMyNote, etPayerMessage;

    RequestToPay requestToPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_details);

        getUserInput();
        setupButtons();
    }

    private void getUserInput() {
        setupInputViews();
        // ToDo
    }

    private void setupInputViews() {
        etExternalId = findViewById(R.id.et_request_externalId);
        etAmount = findViewById(R.id.et_request_amount);
        etPartyId = findViewById(R.id.et_payerPartyID);
        etMyNote = findViewById(R.id.et_request_payeeNote);
        etPayerMessage = findViewById(R.id.et_request_payerMessage);
    }

    private void setupButtons() {
        btnRequest = findViewById(R.id.btn_reqToPay_reqToPay);
        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doRequest();            }
        });
    }

    private void doRequest() {
        doCreateAccessToken_POST();
        doRequestToPay_POST();
        doRequestToPayStatus_GET();
        doRequestToPayDeliveryNotification_POST();

        // ToDo goToStatus page with Status from GET
        startActivity(new Intent(RequestDetailsActivity.this, RequestStatusActivity.class));
    }

    private void doRequestToPayDeliveryNotification_POST() {
        // ToDo
    }

    private void doRequestToPayStatus_GET() {
        // ToDo
    }

    private void doRequestToPay_POST() {
        // ToDo
    }

    private void doCreateAccessToken_POST() {
        // ToDo
    }
}