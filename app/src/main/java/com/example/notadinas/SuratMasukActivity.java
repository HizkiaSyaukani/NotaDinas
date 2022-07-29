package com.example.notadinas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class SuratMasukActivity extends AppCompatActivity {
    private RecyclerView rvMasuk;
    private ArrayList<SuratMasuk> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surat_masuk);

        rvMasuk = findViewById(R.id.rvMasuk);
        rvMasuk.setHasFixedSize(true);
        list.addAll(SuratMasukData.getListData());
    }
    private void showRecyclerList(){
        rvMasuk.setLayoutManager(new LinearLayoutManager(this));
        ListMasukAdapter listMasukAdapter = new ListMasukAdapter(list);
        rvMasuk.setAdapter(listMasukAdapter);
    }
}