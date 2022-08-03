package com.developerdiindy.momopartner.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        testIntent();
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(SettingsActivity.this, HomeActivity.class));
    }

    private void testIntent() {
        TextView textView = findViewById(R.id.tv_settings);

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("key1", "Default");

        textView.setText(title);
    }
}