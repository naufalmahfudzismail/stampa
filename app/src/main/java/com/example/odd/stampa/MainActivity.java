package com.example.odd.stampa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init()
    {
        Button _Menu = (Button) findViewById(R.id.MainMenu);
        Button _Keranjang = (Button) findViewById(R.id.card);

        _Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this,MainMenuActivity.class);
                startActivity(intent);
            }
        });

        _Keranjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this, KeranjangActivity.class);
                startActivity(intent);
            }
        });
    }


}
