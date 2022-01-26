package com.bariekly.javadicoding.function;

public class ReturnFunction {

    public static void main(String[]args){


        double p = 7;
        double l = 5.2;

        double hasil = hitungLuas(p,l);

        System.out.println("Hasil perhitungan luas dari panjang: "+p+" dan lebar : "+ l+ " adalah: "+hasil);


    }

    public static double hitungLuas (double panjang, double lebar){

        double luas = panjang * lebar;
        return luas;
    }

}
