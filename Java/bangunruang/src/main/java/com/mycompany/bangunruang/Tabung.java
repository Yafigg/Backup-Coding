package com.mycompany.bangunruang;

import java.util.Scanner;

public class Tabung extends Bangunruang {
    Scanner iU = new Scanner(System.in);

    double r;
    double t;

    double volume() {
        System.out.print("Masukkan Nilai Jari-Jari : ");
        r = iU.nextDouble();
        System.out.print("Masukkan Nilai Tinggi    :");
        t = iU.nextDouble();
        double volume = Math.PI * (r * r) * t;
        System.out.println("Hasil Nya Adalah         : " + volume);
        return volume;
    }

    double luasPermukaan() {
        System.out.print("Masukkan Nilai Jari-Jari : ");
        r = iU.nextDouble();
        System.out.print("Masukkan Nilai Tinggi    :");
        t = iU.nextDouble();
        double luasPermukaan = 2 * Math.PI * r * t + 2 * Math.PI;
        System.out.println("Hasil Nya Adalah         : " + luasPermukaan);
        return luasPermukaan;
    }
}
