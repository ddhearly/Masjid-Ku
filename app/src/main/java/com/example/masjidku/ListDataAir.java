package com.example.masjidku;

public class ListDataAir {
    private String debit;
    private String volume;

    public ListDataAir() {
    }

    public ListDataAir(String debit, String volume) {
        this.debit = debit;
        this.volume = volume;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}