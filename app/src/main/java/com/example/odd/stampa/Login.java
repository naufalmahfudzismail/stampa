package com.example.odd.stampa;

public class Login {

    private String ussername;
    private String password;

    public Login(String ussername, String password) {
        this.ussername = ussername;
        this.password = password;
    }

    public String getUssername() {
        return ussername;
    }

    public void setUssername(String ussername) {
        this.ussername = ussername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
