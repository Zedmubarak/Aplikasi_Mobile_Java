package com.example.kalkulator_bangun_ruang;

public class LuasLimasSegiEmpat {
    double luas_alas;
    double luas_sisi_tegak;

    public LuasLimasSegiEmpat(double la, double ls) {
        luas_alas = la;
        luas_sisi_tegak = ls;
    }

    public double hitung_luas() {
        return luas_alas + (4 * luas_sisi_tegak);
    }
}
