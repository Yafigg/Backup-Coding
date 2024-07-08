package com.mycompany.speedtest;

import java.util.Scanner;

public class SpeedTest2 {
    public static void main(String[] args) {
        int[] id = { 1, 2, 3, 4 };
        int pil2;
        boolean lagi = true;

        Scanner iU = new Scanner(System.in);
        do {
            System.out.print("Masukkan Nilai 1 : ");
            double nilai = iU.nextInt();
            if (nilai < 4) {
                System.out.println("You Failed! Try again");
            }
            System.out.print("Masukkan Nilai 2 : ");
            double nilai2 = iU.nextInt();
            if (nilai2 < 4) {
                System.out.println("You Failed! Try again");
            }
            System.out.print("Masukkan Nilai 3 : ");
            double nilai3 = iU.nextInt();
            if (nilai3 < 4) {
                System.out.println("You Failed! Try again");
            }
            System.out.print("Masukkan Nilai 4 : ");
            double nilai4 = iU.nextInt();
            if (nilai4 < 4) {
                System.out.println("You Failed! Try again");
            }
            System.out.print("Masukkan Nilai 5 : ");
            double nilai5 = iU.nextInt();
            if (nilai5 < 4) {
                System.out.println("You Failed! Try again");
            }

            System.out.println("-----------------------------------------------------------------------------");
            double hasilSemua = nilai + nilai2 + nilai3 + nilai4 + nilai5;
            System.out.println("Hasilnya Adalah : " + hasilSemua);

            if (hasilSemua < 50) {
                System.out.println("Anda Dinyatakan Tidak Lulus \nNilai Anda : " + hasilSemua);
            } else if (hasilSemua >= 50) {
                System.out.println("Anda Dinyatakan Lulus \nNilai Anda : " + hasilSemua);
            }

            System.out.println("-----------------------------------------------------------------------------");
            System.out.print(
                    "Ingin Melihat ingin Mengulanginya Lagi ? \nMohon Masukkan Angka 1 Atau 2 \n1. Iya\n2. Tidak  : ");
            pil2 = iU.nextInt();

            if (pil2 == 1) {
                lagi = true;
            } else if (pil2 == 2) {
                lagi = false;
            }

        } while (lagi == true);

    }
}
