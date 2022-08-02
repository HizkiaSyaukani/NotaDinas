package com.example.notadinas;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListMasukAdapter extends RecyclerView.Adapter<ListMasukAdapter.ListViewHolder>{
    private ArrayList<SuratMasuk> listMasuk;
    public ListMasukAdapter(ArrayList<SuratMasuk> list){
        this.listMasuk = list;
    }
    @NonNull
    @Override
    public ListMasukAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_masuk,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMasukAdapter.ListViewHolder holder, int position) {
        SuratMasuk suratMasuk = listMasuk.get(position);
        holder.tv_nama.setText(suratMasuk.getName());
        holder.tv_detail.setText(suratMasuk.getDetail());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_detail;
        public ListViewHolder(View itemview){
            super(itemview);
            tv_nama = itemview.findViewById(R.id.tv_nama_masuk);
            tv_detail = itemview.findViewById(R.id.tv_desc_masuk);
        }
    }
}
