package com.example.odd.stampa;

public class Registrasi {

        private String idesi;
        private String username;
        private String password;
        private String namapel;
        private String email;
        private String alamatpel;
        private String telponpel;

    public Registrasi(String idesi, String username, String password, String namapel, String email, String alamatpel, String telponpel) {
        this.idesi = idesi;
        this.username = username;
        this.password = password;
        this.namapel = namapel;
        this.email = email;
        this.alamatpel = alamatpel;
        this.telponpel = telponpel;
    }

    public String getIdesi() {
        return idesi;
    }

    public void setIdesi(String idesi) {
        this.idesi = idesi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamapel() {
        return namapel;
    }

    public void setNamapel(String namapel) {
        this.namapel = namapel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamatpel() {
        return alamatpel;
    }

    public void setAlamatpel(String alamatpel) {
        this.alamatpel = alamatpel;
    }

    public String getTelponpel() {
        return telponpel;
    }

    public void setTelponpel(String telponpel) {
        this.telponpel = telponpel;
    }
}
