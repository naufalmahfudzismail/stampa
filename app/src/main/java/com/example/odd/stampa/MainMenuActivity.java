package com.example.odd.stampa;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;



public class MainMenuActivity extends AppCompatActivity {


    List<String> _imageUrl = new ArrayList<>();
    Button search;

    private ActionBarDrawerToggle _toggle;
    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);
        init_navigation();
        SwipeImage();
        RecyclerListToko();

        search = (Button) findViewById(R.id.ic_magnify);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MainMenuActivity.this,SearchActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (_toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void init_navigation()
    {
        DrawerLayout _draw = (DrawerLayout) findViewById(R.id.drawer);
        _toggle = new ActionBarDrawerToggle(this, _draw,R.string.open, R.string.close);
        _draw.addDrawerListener(_toggle);
        _toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EditText edit_txt = (EditText) findViewById(R.id.input_search);

        edit_txt.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    Intent intent  = new Intent(MainMenuActivity.this, SearchActivity.class);
                    startActivity(intent);
                    // Perform action on key press

                    return true;
                }
                return false;
            }
        });

    }

    private void SwipeImage()
    {

        _imageUrl.add("https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg");
        _imageUrl.add("http://griyamarket.com/wp-content/uploads/2015/10/wpid-108-cahaya-33.jpg.jpeg");


          final ViewPager _viewPager = findViewById(R.id.toko_pager);
        PromosiPagerAdapter adapter = new PromosiPagerAdapter(this, _imageUrl );
        _viewPager.setAdapter(adapter);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == _imageUrl.size()-1) {
                    currentPage = 0;
                }
                _viewPager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer .schedule(new TimerTask() { // task to be scheduled

            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);
    }

    private void RecyclerListToko()
    {
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv_category);
        rv.setHasFixedSize(true);

        ArrayList<Toko> _list = new ArrayList<Toko>(DataToko.getListData());

        rv.setLayoutManager(new LinearLayoutManager(this));
        ListTokoAdapter listToko = new ListTokoAdapter(this);
        listToko.set_listToko(_list);
        rv.setAdapter(listToko);
    }




}
