package com.bariekly.javadicoding.inputoutput;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[]args){

        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program Penjumlahan Sederhana");

        int value1 = 0;
        int value2 = 0;

        try {
            System.out.println("Masukkan Angka Pertama :");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukkan Angka Kedua :");
            value2 = Integer.parseInt(bufferedReader.readLine());

        }catch (IOException e){
            e.printStackTrace();
        }
        int result = value1 + value2;
        System.out.println("Hasil Penjumlahan antara " + value1 + " + " +value2+" adalah "+result);



    }
}
