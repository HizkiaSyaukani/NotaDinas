package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class SuratKeluarActivity extends AppCompatActivity {
    private RecyclerView rvKeluar;
    private ArrayList<SuratKeluar> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surat_keluar);

        rvKeluar = findViewById(R.id.rvKeluar);
        rvKeluar.setHasFixedSize(true);
        list.addAll(SuratKeluarData.getListData());
    }
    private void showRecyclerList(){
        rvKeluar.setLayoutManager(new LinearLayoutManager(this));
        ListKeluarAdapter listkeluarAdapter = new ListKeluarAdapter(list);
        rvKeluar.setAdapter(listkeluarAdapter);
    }
}