package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {
    BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bottomnavlogin);
        bnv.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bnbuatnota:
                    Intent ibuatnota = new Intent(ProfileActivity.this,BuatNotaActivity.class);
                    startActivity(ibuatnota);
                    break;
                case R.id.bnsuratmasuk:
                    Intent isurmas = new Intent(ProfileActivity.this,SuratMasukActivity.class);
                    startActivity(isurmas);
                    break;
                case R.id.bnsuratkeluar:
                    Intent isurkel = new Intent(ProfileActivity.this,SuratKeluarActivity.class);
                    startActivity(isurkel);
                    break;
                case R.id.bnarsip:
                    Intent iarsip = new Intent(ProfileActivity.this,ArsipActivity.class);
                    startActivity(iarsip);
                    break;
            }
            return true;
        });

    }
    }