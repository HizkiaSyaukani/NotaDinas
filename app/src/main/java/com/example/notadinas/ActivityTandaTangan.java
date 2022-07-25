package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTandaTangan extends AppCompatActivity {
    Button buttonnexttandatangan;
    Button buttonbacktandatangan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanda_tangan);

        Button buttonbacktandatangan = (Button) findViewById(R.id.buttonbacktandatangan);
        buttonbacktandatangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonbacktandatangan = new Intent(ActivityTandaTangan.this,UraianActivity.class);
                startActivity(ibuttonbacktandatangan);
            }
        });

        Button buttonnexttandatangan = (Button) findViewById(R.id.buttonnexttandatangan);
        buttonnexttandatangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ibuttonenexttandatangan = new Intent(ActivityTandaTangan.this,PreviewSuratActivity.class);
                startActivity(ibuttonenexttandatangan);
            }
        });
    }
}