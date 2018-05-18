package com.example.odd.stampa;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DetailProdukActivity extends AppCompatActivity {

    List<String> _imageUrl = new ArrayList<>();
    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);
    }

    private void SwipeImage()
    {

        _imageUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwidhvTWo47bAhVSeysKHeGpDq4QjRx6BAgBEAU&url=http%3A%2F%2Finimu.com%2Fbebas%2F2012%2F03%2F19%2Fpic-google-buka-toko-baju%2F&psig=AOvVaw07Gx4byfqacH_RCEb48zXL&ust=1526699150244381");
        _imageUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjgyKfho47bAhWLe30KHWNJDiQQjRx6BAgBEAU&url=https%3A%2F%2Ftechno.okezone.com%2Fread%2F2017%2F10%2F05%2F207%2F1789527%2Fsaingi-mi-store-google-ekspansi-toko-ke-indonesia&psig=AOvVaw07Gx4byfqacH_RCEb48zXL&ust=1526699150244381");
        _imageUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwj85Ifro47bAhVPfysKHTM5DOYQjRx6BAgBEAU&url=http%3A%2F%2Finfoinfodahsyat.blogspot.com%2F2011%2F10%2Fchromezone-toko-gadget-pertama-google.html&psig=AOvVaw07Gx4byfqacH_RCEb48zXL&ust=1526699150244381");

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


}
