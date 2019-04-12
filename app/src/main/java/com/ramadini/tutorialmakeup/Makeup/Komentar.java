package com.ramadini.tutorialmakeup.Makeup;

public class Komentar {
    private String nama;
    private String komentar;


    public Komentar(String nama, String komentar ) {
        this.nama = nama;
        this.komentar = komentar;

    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getKomentar() {

        return komentar;
    }


}
