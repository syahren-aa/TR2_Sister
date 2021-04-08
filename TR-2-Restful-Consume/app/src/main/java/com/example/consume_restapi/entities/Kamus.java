package com.example.consume_restapi.entities;

public class Kamus {
    private int id;
    private String indonesia;
    private String inggris;
    private String jawa;

    public Kamus(int id, String indonesia, String inggris, String jawa) {
        this.id = id;
        this.indonesia = indonesia;
        this.inggris = inggris;
        this.jawa = jawa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndonesia() {
        return indonesia;
    }

    public void setIndonesia(String indonesia) {
        this.indonesia = indonesia;
    }

    public String getInggris() {
        return inggris;
    }

    public void setInggris(String inggris) {
        this.inggris = inggris;
    }

    public String getJawa() {
        return jawa;
    }

    public void setJawa(String jawa) {
        this.jawa = jawa;
    }
}
