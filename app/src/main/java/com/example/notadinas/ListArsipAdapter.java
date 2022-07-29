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

public class ListArsipAdapter extends RecyclerView.Adapter<ListArsipAdapter.ListViewHolder>{
    private ArrayList<Arsip> listArsip;
    public ListArsipAdapter(ArrayList<Arsip> list){
        this.listArsip = list;
    }
    @NonNull
    @Override
    public ListArsipAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_arsip,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListArsipAdapter.ListViewHolder holder, int position) {
        Arsip arsip = listArsip.get(position);
        holder.tv_nama.setText(arsip.getName());
        holder.tv_detail.setText(arsip.getDetail());
        holder.tv_status.setText(arsip.getStatus());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_detail, tv_status;
        public ListViewHolder(View itemview){
            super(itemview);
            tv_nama = itemview.findViewById(R.id.tv_nama_arsip);
            tv_detail = itemview.findViewById(R.id.tv_desc_arsip);
            tv_status = itemview.findViewById(R.id.tv_status_arsip);
        }
    }
}
