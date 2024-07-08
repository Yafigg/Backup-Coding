package com.mycompany.speedtest;
import java.util.Scanner;

public class SpeedTest {

    public static void main(String[] args) {
        Scanner iU = new Scanner(System.in);

        System.out.print(" Masukkan Nilai 1 : ");
        double nilai1 = iU.nextInt();
        System.out.print(" Masukkan Nilai 2 : ");
        double nilai2 = iU.nextInt();
        System.out.print(" Masukkan Nilai 3 : ");
        double nilai3 = iU.nextInt();
        System.out.print(" Masukkan Nilai 4 : ");
        double nilai4 = iU.nextInt();
        System.out.print(" Masukkan Nilai 5 : ");
        double nilai5 = iU.nextInt();
        System.out.print(" Masukkan Nilai 6 : ");
        double nilai6 = iU.nextInt();

        


        double hasilSemua = nilai1 + nilai2 + nilai3 + nilai4 + nilai5 + nilai6;
        System.out.println(" Hasilnya Adalah : " + hasilSemua );

    }
}
