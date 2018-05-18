package com.example.odd.stampa;

public class Produk {

    private String  nama_produk;
    private int harga;
    private String deskripsi;
    private float berat;
    private Toko toko;
    String [] gambar =  new String [3];

    public Produk(String nama_produk, int harga, String deskripsi, float berat, Toko toko, String[] gambar) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.berat = berat;
        this.toko = toko;
        this.gambar = gambar;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public Toko getToko() {
        return toko;
    }

    public void setToko(Toko toko) {
        this.toko = toko;
    }

    public String[] getGambar() {
        return gambar;
    }

    public void setGambar(String[] gambar) {
        this.gambar = gambar;
    }
}
