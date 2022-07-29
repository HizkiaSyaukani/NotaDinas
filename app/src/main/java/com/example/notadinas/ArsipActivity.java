package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ArsipActivity extends AppCompatActivity {
    private RecyclerView rvArsip;
    private ArrayList<Arsip> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsip);

        rvArsip = findViewById(R.id.rvArsip);
        rvArsip.setHasFixedSize(true);
        list.addAll(ArsipData.getListData());
    }
    private void showRecyclerList(){
        rvArsip.setLayoutManager(new LinearLayoutManager(this));
        ListArsipAdapter listArsipAdapter = new ListArsipAdapter(list);
        rvArsip.setAdapter(listArsipAdapter);
    }
}