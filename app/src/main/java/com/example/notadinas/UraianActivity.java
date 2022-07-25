package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UraianActivity extends AppCompatActivity {

    Button buttonnexturaian;
    Button buttonbackuraian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uraian);

        Button buttonbackuraian = (Button) findViewById(R.id.buttonbackuraian);
        buttonbackuraian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonbackuraian = new Intent(UraianActivity.this,BuatNotaActivity.class);
                startActivity(ibuttonbackuraian);
            }
        });

        Button buttonnexturaian = (Button) findViewById(R.id.buttonnexturaian);
        buttonnexturaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonenexturaian = new Intent(UraianActivity.this,PreviewSuratActivity.class);
                startActivity(ibuttonenexturaian);
            }
        });

    }



}