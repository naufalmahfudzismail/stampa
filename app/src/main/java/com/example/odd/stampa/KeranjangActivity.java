package com.example.odd.stampa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.odd.stampa.R;

import java.util.ArrayList;

public class KeranjangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);

        showRecyclerCardView();
    }

    private void showRecyclerCardView(){

        ArrayList<Toko> _list = new ArrayList<Toko>(DataToko.getListData());


        RecyclerView rvCategory = (RecyclerView) findViewById(R.id.rv_category_card);

        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardTokoAdapter cardViewTokoAdapter = new CardTokoAdapter(this);

        cardViewTokoAdapter.set_listToko(_list);

        rvCategory.setAdapter(cardViewTokoAdapter);
    }


}
