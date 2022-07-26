package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HalamanAwalActivity extends AppCompatActivity {
    BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bottomnavlogin);
        bnv.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bnbuatnota:
                    Intent ibuatnota = new Intent(HalamanAwalActivity.this,BuatNotaActivity.class);
                    startActivity(ibuatnota);
                    break;
                case R.id.bnsuratmasuk:
                    Intent isurmas = new Intent(HalamanAwalActivity.this,SuratMasukActivity.class);
                    startActivity(isurmas);
                    break;
                case R.id.bnsuratkeluar:
                    Intent isurkel = new Intent(HalamanAwalActivity.this,PreviewSuratMasukActivity.class);
                    startActivity(isurkel);
                    break;
                case R.id.bnarsip:
                    Intent iarsip = new Intent(HalamanAwalActivity.this,ActivityTandaTangan.class);
                    startActivity(iarsip);
                    break;
            }
            return true;
        });

    }
}