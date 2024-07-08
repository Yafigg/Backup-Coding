package com.mycompany.bangunruang;
import java.util.Scanner;

public class LimasSegitiga extends Bangunruang {
    Scanner iU = new Scanner(System.in);

    double la;
    double t;
    double tLimas; 
    
    double volume() {
        System.out.print("Masukkan Nilai Luas Alas         : ");
        la = iU.nextDouble();
        System.out.print("Masukkan Nilai Tinggi Dari Limas : ");
        tLimas = iU.nextDouble();
        double volume =  la * tLimas / 3;
        System.out.println("Hasil Nya Adalah                 : " + volume);
        return volume;
    }
    
    double luasPermukaan() {
        System.out.print("Masukkan Nilai Luas Alas       : ");
        la = iU.nextDouble();
        System.out.print("Masukkan Tinggi Limas          : ");
        t = iU.nextDouble();
        double luasPermukaan =  la * t / 2;
        System.out.println("Hasil Nya Adalah               : " + luasPermukaan);
        return luasPermukaan;
    }
}
