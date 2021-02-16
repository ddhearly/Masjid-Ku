package com.example.masjidku;

public class ListDataListrik {
    private String arus;
    private String daya;
    private String energi;
    private String nama;
    private String tegangan;

    public ListDataListrik() {
    }

    public ListDataListrik(String arus, String daya, String energi, String nama, String tegangan) {
        this.arus = arus;
        this.daya = daya;
        this.energi = energi;
        this.nama = nama;
        this.tegangan = tegangan;
    }

    public String getArus() {
        return arus;
    }

    public void setArus(String arus) {
        this.arus = arus;
    }

    public String getDaya() {
        return daya;
    }

    public void setDaya(String daya) {
        this.daya = daya;
    }

    public String getEnergi() {
        return energi;
    }

    public void setEnergi(String energi) {
        this.energi = energi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTegangan() {
        return tegangan;
    }

    public void setTegangan(String tegangan) {
        this.tegangan = tegangan;
    }
}