package com.example.odd.stampa;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.odd.stampa.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ProdukPagerAdapter extends PagerAdapter{


    private Activity activity;

    private List<String> Images = new ArrayList<>();

    @Override
    public int getCount() {
        return Images.size();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public ProdukPagerAdapter(Activity activity, List<String> images) {
        this.activity = activity;
        Images = images;
    }



    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        View itemview = inflater.inflate(R.layout.produk_pager, container, false);

        ImageView image;
        image = (ImageView) itemview.findViewById(R.id.background_produk);

        DisplayMetrics dis = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dis);
        int height = dis.heightPixels;
        int width = dis.widthPixels;

        image.setMinimumHeight(height);
        image.setMinimumWidth(width);

        try{

            Glide.with(activity.getApplicationContext())
                    .load(Images.get(position))
                    .placeholder(R.mipmap.ic_launcher_round)
                    .error(R.mipmap.ic_launcher)
                    .into(image);
        }

        catch (Exception e){
            System.out.println(e);
        }
        container.addView(itemview);
        return itemview;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((View)object);
    }



}
