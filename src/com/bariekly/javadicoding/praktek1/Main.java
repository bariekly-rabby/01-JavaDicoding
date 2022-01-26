package com.bariekly.javadicoding.praktek1;

public class Main {
    public static void main(String[] args){
        char [] dicodingChar = {'d','i', 'c', 'o','d','i','n','g'};
        String dicodingString = new String(dicodingChar);
        System.out.println(dicodingString);
        String ucapan = "Alhamdulillah";
        System.out.println(ucapan);
        ucapan = "Bismillah";
        System.out.println(ucapan);

        int lenght = ucapan.length();
        System.out.println("Jumlah character dalam variable Ucapan adalah " + lenght);
    }
}
