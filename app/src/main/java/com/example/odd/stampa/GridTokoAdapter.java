package com.example.odd.stampa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.*;

public class GridTokoAdapter extends RecyclerView.Adapter<GridTokoAdapter.GridViewHolder> {

    private Context context;
    private ArrayList <Toko> _listToko;



    public void set_listToko(ArrayList<Toko> _listToko) {
        this._listToko = _listToko;
    }

    public ArrayList<Toko> getListToko() {

        return _listToko;
    }


    public GridTokoAdapter(Context context) {

        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_toko_view, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListToko().get(position).getGambar())
                .override(350, 550)
                .into(holder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return getListToko().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        public GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.grid_photo);
        }
    }


}
