package com.example.odd.stampa;

import java.util.ArrayList;

public class DataToko {

   public static String[][] data = new String[][]{

           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"},
           {"Pandawa", "https://s.kaskus.id/images/2018/04/25/10186265_20180425035112.jpg", "Toko Printer"}

   };


    public static ArrayList<Toko> getListData()
    {
        Toko toko = null;

        ArrayList<Toko> list = new ArrayList<>();

        for (int i = 0; i < data.length; i ++) {
            toko = new Toko();

            toko.setNamatoko(data[i][0]);
            toko.setGambar(data[i][1]);
            toko.setDeskripsi(data[i][2]);

            list.add(toko);
        }

        return list;

    }
}
