package com.example.odd.stampa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardTokoAdapter extends RecyclerView.Adapter<CardTokoAdapter.CardViewViewHolder> {

    private Context context;
    private ArrayList<Toko> _listToko;

    public CardTokoAdapter(Context context) {
        this.context = context;
    }

    public void set_listToko(ArrayList<Toko> _listToko) {
        this._listToko = _listToko;
    }

    public ArrayList<Toko> getListToko() {
        return _listToko;
    }



    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_toko_view, parent, false);
        return new CardViewViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {

        Toko toko = getListToko().get(position);

        Glide.with(context)
                .load(toko.getGambar())
                .override(350, 550)
                .into(holder.imgPhoto);

        holder.tvName.setText(toko.getNamatoko());
        holder.tvRemarks.setText(toko.getDeskripsi());

        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListToko().get(position).getNamatoko(), Toast.LENGTH_SHORT).show();
            }
        }));


    }

    @Override
    public int getItemCount() {
       return _listToko.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView) itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = (Button) itemView.findViewById(R.id.btn_set_favorite);
        }
    }
}
