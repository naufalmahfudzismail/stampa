package com.example.odd.stampa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    List<String> _imageUrl = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        showRecyclerGrid();
    }

    private void showRecyclerGrid(){

        _imageUrl.add("https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg");
        _imageUrl.add("http://griyamarket.com/wp-content/uploads/2015/10/wpid-108-cahaya-33.jpg.jpeg");
        _imageUrl.add("https://aws-dist.brta.in/brtgr-2013-02/22_google_office-manhattan.jpg");
        _imageUrl.add("https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg");
        _imageUrl.add("http://griyamarket.com/wp-content/uploads/2015/10/wpid-108-cahaya-33.jpg.jpeg");
        _imageUrl.add("https://aws-dist.brta.in/brtgr-2013-02/22_google_office-manhattan.jpg");
        _imageUrl.add("https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg");
        _imageUrl.add("http://griyamarket.com/wp-content/uploads/2015/10/wpid-108-cahaya-33.jpg.jpeg");
        _imageUrl.add("https://aws-dist.brta.in/brtgr-2013-02/22_google_office-manhattan.jpg");
        _imageUrl.add("https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg");
        _imageUrl.add("http://griyamarket.com/wp-content/uploads/2015/10/wpid-108-cahaya-33.jpg.jpeg");
        _imageUrl.add("https://aws-dist.brta.in/brtgr-2013-02/22_google_office-manhattan.jpg");



        ArrayList<Toko> _list = new ArrayList<Toko>((DataToko.getListData()));

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv_categorys);
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        GridTokoAdapter  gridTokoAdapter = new GridTokoAdapter(this);
        gridTokoAdapter.set_listToko(_list);

        rv.setAdapter(gridTokoAdapter);
    }
}
