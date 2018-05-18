package com.example.odd.stampa;

import java.util.ArrayList;

public class DataProduk {

    public static String[][] data_produk = new String[][]{

            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"},
            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"},
            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"},
            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"},
            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"},
            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"},
            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"},
            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"},
            {"Pandawa", "https://id.pinterest.com/pin/528117493786947859/?lp=true", "Toko Printer"}

    };


    public static ArrayList<Toko> getListDataProduk()
    {
        Toko toko = null;

        ArrayList<Toko> list = new ArrayList<>();

        for (int i = 0; i < data_produk.length; i ++) {
            toko = new Toko();

            toko.setNamatoko(data_produk[i][0]);
            toko.setGambar(data_produk[i][1]);
            toko.setDeskripsi(data_produk[i][2]);

            list.add(toko);
        }

        return list;

    }
}
