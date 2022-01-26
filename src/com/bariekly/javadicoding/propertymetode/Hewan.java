package com.bariekly.javadicoding.propertymetode;

public class Hewan {

    // Properti atau fields
    // Inisiasi dengan nilai inisial

    double tinggi = 30;
    double berat = 3;


    // Inisiasi melalui konstruktor

    int umur;

    // Konstruktor dengan parameter

    Hewan(int umur) {
        this.umur = umur;
    }

    void berlari(){
        System.out.println("Berlari sangat cepat .....");

    }

    void berjalan(){
        System.out.println("Berjalan dengan pelan ....");

    }

    void makan(){
        System.out.println("Makan dengan mulut ....");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    int getUmur(){
        return umur;
    }
}
