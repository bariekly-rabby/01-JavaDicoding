package com.bariekly.javadicoding.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String []args){

        int nilaiUjian = 0;
        char indexPrestasi;

        if (nilaiUjian >= 80){
            indexPrestasi = 'A';
        }else if (nilaiUjian >=60){
            indexPrestasi = 'B';
        }else if (nilaiUjian >= 40){
            indexPrestasi = 'C';
        }else if (nilaiUjian > 0){
            indexPrestasi = 'D';
        }else {
            indexPrestasi = 'E';
        }

        System.out.println("Index Prestasi Anda adalah " + indexPrestasi);

    }
}
