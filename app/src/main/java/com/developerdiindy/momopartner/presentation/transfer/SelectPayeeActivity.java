package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.requesttopay.LoggedRequestsActivity;
import com.developerdiindy.momopartner.presentation.requesttopay.RequestDetailsActivity;
import com.developerdiindy.momopartner.presentation.requesttopay.SavedPayerActivity;

import java.util.ArrayList;
import java.util.List;

public class SelectPayeeActivity extends AppCompatActivity {

    Button btnSelectPayee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_payee);

        setupPayeeButton();
        setupListView();
    }

    private void setupListView() {
        List<String> selectList = new ArrayList<>();
        selectList.add("Scan QR Code");
        selectList.add("Once Off Payee");
        selectList.add("Use Saved Payee");
        selectList.add("Previous Transfers");

        ListView lvSelectPayer = findViewById(R.id.lv_selectPayee);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, selectList);
        lvSelectPayer.setAdapter(adapter);

        lvSelectPayer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getApplicationContext(), ScanQRActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), TransferDetailsActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), SavedPayeeActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(), LoggedTransfersActivity.class));
                        break;
                }
            }
        });
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