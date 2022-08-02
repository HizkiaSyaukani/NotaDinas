package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BuatNotaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button buttonnextbuatnota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_buat_nota);

        Button buttonnextbuatnota = (Button) findViewById(R.id.buttonnextbuatnota);
        buttonnextbuatnota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonenextbuatnota = new Intent(BuatNotaActivity.this,UraianActivity.class);
                startActivity(ibuttonenextbuatnota);
            }
        });

        Spinner Pengirim = findViewById(R.id.dari );
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Departemen_Pengirim, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Pengirim.setAdapter(adapter);
        Pengirim.setOnItemSelectedListener(this);

        Spinner Tujuan = findViewById(R.id.untuk );
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Departemen_Tujuan, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Tujuan.setAdapter(adapter1);
        Tujuan.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    }