package com.mycompany.bangunruang;
import java.util.Scanner;

public class Balok extends Bangunruang {
    Scanner iU = new Scanner(System.in);

    double p, l, t;
    
    double volume() {
        System.out.print("Masukkan Nilai Panjang : ");
        p = iU.nextDouble();
        System.out.print("Masukkan Nilai Lebar   : ");
        l = iU.nextDouble();
        System.out.print("Masukkan Nilai Tinggi  : ");
        t = iU.nextDouble();
        double volume = p * l * t;
        System.out.println("Hasilnya Adalah        : " + volume);
        return volume;
    }
    
    double luasPermukaan() {
        System.out.print("Masukkan Nilai Panjang : ");
        p = iU.nextDouble();
        System.out.print("Masukkan Nilai Lebar   : ");
        l = iU.nextDouble();
        System.out.print("Masukkan Nilai Tinggi  : ");
        t = iU.nextDouble();
        double luasPermukaan = 2 * (p * l + p * t + l * t);
        System.out.println("Hasilnya Adalah        : " + luasPermukaan);
        return luasPermukaan;
    }
}
