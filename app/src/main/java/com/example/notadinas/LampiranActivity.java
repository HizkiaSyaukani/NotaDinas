package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LampiranActivity extends AppCompatActivity {
    Button buttonbacklampiran;
    Button buttonnextlampiran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lampiran);

        Button buttonbacklampiran = (Button) findViewById(R.id.buttonbacklampiran);
        buttonbacklampiran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonbacklampiran = new Intent(LampiranActivity.this,PreviewSuratActivity.class);
                startActivity(ibuttonbacklampiran);
            }
        });

        Button buttonnextlampiran = (Button) findViewById(R.id.buttonnextlampiran);
        buttonnextlampiran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonenextlampiran = new Intent(LampiranActivity.this,ProfileActivity.class);
                startActivity(ibuttonenextlampiran);
            }
        });
    }
}