/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {

        Scanner iU = new Scanner(System.in);

        // daftar jenis bangun
        String daftarPilihan1 = "1. Penghitung Kecepatan Dan Waktu" + "\n2. Penghitung Jarak Dan Kecepatan"
                + "\n3. Penghitung Jarak Dan Waktu";

        boolean lagi = true;

        int pil2;
        int pilihan1;
        int pilihan2;

        // deklarasi variabel
        double wak, ke, kewa;
        double jak, kep, jatan;
        double ja, wa, jawa;
        double hasil;

        do {
            System.out.println(" -------------------------------------------------- ");
            System.out.println("|      PENGHITUNG JARAK, KECEPATAN, DAN WAKTU      |");
            System.out.println(" -------------------------------------------------- ");
            System.out.println("APA YANG INGIN KAMU KETAHUI ???");
            System.out.println(daftarPilihan1);
            System.out.print("Pilih Dari Beberapa Penghitung Di Atas : ");
            pilihan1 = iU.nextInt();
            System.out.println(" -------------------------------------------------- ");
            switch (pilihan1) {
                case 1:
                    System.out.print("Masukkan Nilai Waktu     : ");
                    wak = iU.nextDouble();
                    System.out.print("Masukkan nilai Kecepatan : ");
                    ke = iU.nextDouble();
                    kewa = wak * ke;
                    System.out.println("HASIL : " + kewa);
                    break;

                case 2:
                    System.out.print("Masukkan Nilai Jarak     : ");
                    jak = iU.nextDouble();
                    System.out.print("Masukkan Nilai Kecepatan : ");
                    kep = iU.nextDouble();
                    jatan = jak / kep;
                    System.out.println("HASIL : " + jatan);
                    break;

                case 3:
                    System.out.print("Masukkan Nilai Jaraknya  : ");
                    ja = iU.nextDouble();
                    System.out.print("Masukkan Nilai Waktu     : ");
                    wa = iU.nextDouble();
                    jawa = ja / wa;
                    System.out.println("HASIL NYA ADALAH: " + jawa);
                    break;

                default:
                    System.out.println("\nMASUKKAN INPUT YANG BENAR YAA !!!!\n");

            }
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Ingin Mengulanginya Lagi ? \n1. Iya\n2. Tidak  : ");
            pil2 = iU.nextInt();

            if (pil2 == 1) {
                lagi = true;
            } else if (pil2 == 2) {
                lagi = false;
            }

        } while (lagi == true);
    }
}
