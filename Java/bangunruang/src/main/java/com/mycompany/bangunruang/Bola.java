package com.mycompany.bangunruang;
import java.util.Scanner;

public class Bola extends Bangunruang {
    Scanner iU = new Scanner(System.in);
    double r;
    
    double volume() {
        System.out.print("Masukkan Nilai Jari-Jari : ");
        r = iU.nextDouble();
        double volume = 4/3 * Math.PI * r * r * r;
        System.out.print("Hasil Nya Adalah : "+ volume);
        return volume;
    }
    
    @Override
    double luasPermukaan(){
        System.out.print("Masukkan Nilai Jari-Jari : ");
        r = iU.nextDouble();
        double luas = 4 * Math.PI * r;
        System.out.print("Hasil Nya Adalah : " + luas);
        return luas;
    }
}
