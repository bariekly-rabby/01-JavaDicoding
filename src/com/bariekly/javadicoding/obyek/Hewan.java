package com.bariekly.javadicoding.obyek;

public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;


    public Hewan(String namaHewan){
        nama = namaHewan;

    }

    public void beratHewan (int beratHewan){
        berat = beratHewan;

    }

    public void jumlahKakiHewan (int jumlahKakiHewan){

        jumlahKaki = jumlahKakiHewan;

    }

    public void cetakHewan (){

        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat Hewan : " + berat +" kg");
        System.out.println("Jumlah Kaki Hewan : " + jumlahKaki);
    }


}