package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreviewSuratActivity extends AppCompatActivity {
    Button buttonnextpreviewsurat;
    Button buttonbackpreviewsurat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_surat);

        Button buttonbackpreviewsurat = (Button) findViewById(R.id.buttonbackpreviewsurat);
        buttonbackpreviewsurat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonbackpreviewsurat = new Intent(PreviewSuratActivity.this,ActivityTandaTangan.class);
                startActivity(ibuttonbackpreviewsurat);
            }
        });

        Button buttonnextpreviewsurat = (Button) findViewById(R.id.buttonnextpreviewsurat);
        buttonnextpreviewsurat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonenextpreviewsurat = new Intent(PreviewSuratActivity.this,LampiranActivity.class);
                startActivity(ibuttonenextpreviewsurat);
            }
        });
    }
}