package com.example.odd.stampa;

public class Toko {

    private String idsesi;
    private String namatoko;
    private String deskripsi;
    private String gambar;

    public Toko(String idsesi, String namatoko, String deskripsi, String gambar) {
        this.idsesi = idsesi;
        this.namatoko = namatoko;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public Toko() {
    }

    public String getIdsesi() {
        return idsesi;
    }

    public void setIdsesi(String idsesi) {
        this.idsesi = idsesi;
    }

    public String getNamatoko() {
        return namatoko;
    }

    public void setNamatoko(String namatoko) {
        this.namatoko = namatoko;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
