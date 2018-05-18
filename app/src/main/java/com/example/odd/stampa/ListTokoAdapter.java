package com.example.odd.stampa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class ListTokoAdapter extends RecyclerView.Adapter<ListTokoAdapter.CategoryViewHolder> {


    private Context context;
    private ArrayList<Toko> _listToko;

    public ArrayList<Toko> getListToko()
    {
        return _listToko;
    }

    public void set_listToko(ArrayList<Toko> _listToko) {
        this._listToko = _listToko;
    }

    public ListTokoAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_toko_view, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.tvName.setText(getListToko().get(position).getNamatoko());
        holder.tvRemarks.setText(getListToko().get(position).getDeskripsi());

        Glide.with(context)
                .load(getListToko().get(position).getGambar())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListToko().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
        }
    }

}
