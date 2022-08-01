package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.notadinas.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HalamanAwalActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
        replaceFragment(new ProfileFragment());
        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bottomnav);
        bnv.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bnprofil:
                    replaceFragment(new ProfileFragment());
                    break;
                case R.id.bnbuatnota:
                    replaceFragment(new BuatNotaFragment());
                    break;
                case R.id.bnarsip:
                    replaceFragment(new ArsipFragment());
                    break;
                case R.id.bnsuratkeluar:
                    replaceFragment(new SuratKeluarFragment());
                    break;
                case R.id.bnsuratmasuk:
                    replaceFragment(new SuratMasukFragment());
                    break;
            }
            return true;
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}