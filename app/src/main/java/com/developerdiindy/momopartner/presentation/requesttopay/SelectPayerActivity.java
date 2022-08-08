package com.developerdiindy.momopartner.presentation.requesttopay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.developerdiindy.momopartner.R;

import java.util.ArrayList;
import java.util.List;

public class SelectPayerActivity extends AppCompatActivity {

    Button btnSelectPayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_payer);

        setupPayerButton();
        setupListView();
    }

    private void setupListView() {
        List<String> selectList = new ArrayList<>();
        selectList.add("Share QR Code");
        selectList.add("Once Off Payer");
        selectList.add("Use Saved Payer");
        selectList.add("Previous RequestToPays");

        ListView lvSelectPayer = findViewById(R.id.lv_selectPayer);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, selectList);
        lvSelectPayer.setAdapter(adapter);

        lvSelectPayer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getApplicationContext(), ShareQRActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), RequestDetailsActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), SavedPayerActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), LoggedRequestsActivity.class));
                        break;
                }
            }
        });
    }

    private void setupPayerButton() {
        btnSelectPayer = findViewById(R.id.btn_selectPayer);
        btnSelectPayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectPayerActivity.this, RequestDetailsActivity.class));
            }
        });
    }
}