/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {

        Scanner iU = new Scanner(System.in);

        //daftar jenis bangun
        String daftarPenghitung = "1. Jarak" + "\n2. Kecepatan" + "\n3. Waktu";

        boolean lagi = true;

        int pil2;
        int pilihan;

        //deklarasi variabel
        double wak, ke, jarak;
        double jak, kep, waktu;
        double ja, wa, kecepatan;
        double hasil;

        do {
            System.out.println(" -------------------------------------------------- ");
            System.out.println("|      PENGHITUNG JARAK, KECEPATAN, DAN WAKTU      |");
            System.out.println(" -------------------------------------------------- ");
            System.out.println(daftarPenghitung);
            System.out.print("Pilih Dari Beberapa Penghitung Di Atas : ");
            pilihan = iU.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nilai Waktu     : ");
                    wak = iU.nextDouble();
                    System.out.print("Masukkan nilai Kecepatan :");
                    ke = iU.nextDouble();
                    jarak = wak*ke;
                    System.out.println("HASIL : " + jarak);
                    break;

                case 2:
                    System.out.print("Masukkan Nilai Jarak     : ");
                    jak = iU.nextDouble();
                    System.out.print("Masukkan Nilai Kecepatan :");
                    kep = iU.nextDouble();
                    waktu = jak / kep;
                    System.out.println("HASIL : " + waktu);
                    break;

                case 3:
                    System.out.print("Masukkan Nilai Jaraknya  : ");
                    ja = iU.nextDouble();
                    System.out.print("Masukkan Nilai Waktu     :");
                    wa = iU.nextDouble();
                    kecepatan = ja / wa;
                    System.out.println("HASIL : " + kecepatan);
                    break;

                    default:
          System.out.println("\nMASUKKAN INPUT YANG BENAR YAA !!!!\n");
                    
            }
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Ingin Mengulanginya Lagi ? \n1. Iya\n2. Tidak");
            pil2 = iU.nextInt();
            
            if (pil2 == 1) {
                lagi = true;
            }else if (pil2 == 2) {
                lagi = false;
            }
            
        }while (lagi == true);
        }    
}