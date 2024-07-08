package com.mycompany.bangunruang;

import com.mycompany.bangunruang.Balok;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iU = new Scanner(System.in);

        boolean lagi = true;

        int pil2;
        int pilihan;

        int pilihan1;

        do {
            System.out.println(" ======================================== ");
            System.out.println("|      MAU MENGHITUNG APA HARI INI ?     |");
            System.out.println(" ======================================== ");
            System.out.println("| 1. Luas Permukaan Bola                 |");
            System.out.println("| 2. Volume Bola                         |");
            System.out.println("| 3. Luas Permukaan Limas Segitiga       |");
            System.out.println("| 4. Volume Limas Segitiga               |");
            System.out.println("| 5. Luas Permukaan Tabung               |");
            System.out.println("| 6. Volume Tabung                       |");
            System.out.println("| 7. Luas Permukaan Balok                |");
            System.out.println("| 8. Volume Balok                        |");
            System.out.println(" ========================================");
            System.out.print("Jadi Mau Pilih No Berapa ?  : ");
            pilihan1 = iU.nextInt();
            System.out.println("==========================================");

            switch (pilihan1) {
                case 1:
                    Bola bola = new Bola();
                    bola.luasPermukaan();
                    break;

                case 2:
                    Bola bola2 = new Bola();
                    bola2.volume();
                    break;

                case 3:
                    LimasSegitiga limas = new LimasSegitiga();
                    limas.luasPermukaan();
                    break;

                case 4:
                    LimasSegitiga limas2 = new LimasSegitiga();
                    limas2.volume();
                    break;

                case 5:
                    Tabung tabung = new Tabung();
                    tabung.luasPermukaan();
                    break;

                case 6:
                    Tabung tabung2 = new Tabung();
                    tabung2.volume();
                    break;

                case 7:
                    Balok balok = new Balok();
                    balok.luasPermukaan();
                    break;

                case 8:
                    Balok balok2 = new Balok();
                    balok2.volume();
                    break;

                default:
                    System.out.println("\nMASUKKAN INPUT YANG BENAR YAA !!!!\n");
            }
            System.out.println("===============================================================");
            System.out.print("Lagi? \n1. Iya\n2. Tidak  : ");
            pil2 = iU.nextInt();

            if (pil2 == 1) {
                lagi = true;
            } else if (pil2 == 2) {
                lagi = false;
                System.out.println("|===========================================|");
                System.out.println("| Terima Kasih Telah Menggunakan Jasa Saya  |");
                System.out.println("|===========================================|");
            }

        } while (lagi == true);
    }
}