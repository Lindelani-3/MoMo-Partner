package com.developerdiindy.momopartner.presentation.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.business.model.AppUser;
import com.developerdiindy.momopartner.presentation.appuser.SettingsActivity;
import com.developerdiindy.momopartner.presentation.home.fragments.HomeFragment;
import com.developerdiindy.momopartner.presentation.home.fragments.RequestPayFragment;
import com.developerdiindy.momopartner.presentation.home.fragments.SettingsFragment;
import com.developerdiindy.momopartner.presentation.home.fragments.TransferFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {

    TextView tvHome;
    private AppUser appUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Testing
        Bundle bundle = getIntent().getExtras();
        int id  = bundle.getInt("userId", 0);
        appUser = new AppUser(id);
        // ToDo getUser from DB -> use userName
        String text = "User ID: " + appUser.getId();
        tvHome = findViewById(R.id.tv_home);
        tvHome.setText(text);

        setupNavigationMenu();
    }


    public void setupNavigationMenu() {
        BottomNavigationView navigationView = findViewById(R.id.bottom_nav_home);
        navigationView.setOnItemSelectedListener(NavigationMenu());
        // home fragment on startup
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_cont_home, new HomeFragment()).commit();
    }

    public NavigationBarView.OnItemSelectedListener NavigationMenu(){
        return new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch(item.getItemId()){
                    case R.id.home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.requestToPay:
                        selectedFragment = new RequestPayFragment();
                        break;
                    case R.id.transfer:
                        selectedFragment = new TransferFragment();
                        break;
                    case R.id.settings:
                        selectedFragment = new SettingsFragment();
                        //goToSettings();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_cont_home, selectedFragment).commit();
                return true;
            }
        };
    }

    private void goToSettings() {
        Bundle bundle = new Bundle();
        bundle.putString("key1", "Settings Activity");
        startActivity(new Intent(HomeActivity.this, SettingsActivity.class).putExtras(bundle));
    }
}