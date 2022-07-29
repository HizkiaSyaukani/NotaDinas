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

public class ListKeluarAdapter extends RecyclerView.Adapter<ListKeluarAdapter.ListViewHolder>{
    private ArrayList<SuratKeluar> listKeluar;
    public ListKeluarAdapter(ArrayList<SuratKeluar> list){
        this.listKeluar = list;
    }
    @NonNull
    @Override
    public ListKeluarAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_keluar,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListKeluarAdapter.ListViewHolder holder, int position) {
        SuratKeluar suratkeluar = listKeluar.get(position);
        holder.tv_nama.setText(suratkeluar.getName());
        holder.tv_detail.setText(suratkeluar.getDetail());
        holder.tv_status.setText(suratkeluar.getStatus());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_detail, tv_status;
        public ListViewHolder(View itemview){
            super(itemview);
            tv_nama = itemview.findViewById(R.id.tv_nama_keluar);
            tv_detail = itemview.findViewById(R.id.tv_desc_keluar);
            tv_status = itemview.findViewById(R.id.tv_status_keluar);
        }
    }
}
