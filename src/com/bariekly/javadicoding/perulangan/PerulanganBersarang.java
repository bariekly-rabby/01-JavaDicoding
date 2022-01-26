package com.bariekly.javadicoding.perulangan;

public class PerulanganBersarang {
    public static void main(String[]args){

        int a = 1;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }


    }

}
