package com.bariekly.javadicoding.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("System penjumlahan Sederhana");
        System.out.println("Masukkan Angka Pertama :");
        int value = scanner.nextInt();
        System.out.println("Masukkan Angka Kedua ");
        int value2 = scanner.nextInt();

        int result = value + value2;
        System.out.println("Hasil Penjumlahan " + value + " + " + value2 + " adalah "+result);


    }

}
