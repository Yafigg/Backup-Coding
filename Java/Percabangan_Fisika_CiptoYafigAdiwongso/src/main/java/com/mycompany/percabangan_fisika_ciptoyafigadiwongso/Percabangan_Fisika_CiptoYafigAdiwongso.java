package com.mycompany.percabangan_fisika_ciptoyafigadiwongso;

import java.util.Scanner;

public class Percabangan_Fisika_CiptoYafigAdiwongso {

    public static void main(String[] args) {

        Scanner iU = new Scanner(System.in);

        //daftar jenis bangun
        String daftarBangun = "\n1. Massa Jenis" + "\n2. Rumus Gaya" + "\n3. Energi Potensial" + "\n4. Energi Kinetik" + "\n5. Cepat Rambat Gelombang";

        boolean lagi = true;

        int pil2;
        int pilihan;

        //deklarasi variabel
        double MJ, v, m;
        double RG, ma, a;
        double ep, mb, g, h;
        double ek, vo, ms;
        double crg1, crg2, crg3, v1, t, s, pg, p, fr;
        double hasil;

        do {
            System.out.println("==========  Fisika ==========");
            System.out.println(daftarBangun);
            System.out.println("=============================");
            System.out.print("Pilih Dari Beberapa Rumus Di Atas : ");
            pilihan = iU.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Masa : ");
                    m = iU.nextDouble();
                    System.out.print("Masukkan Volumenya :");
                    v = iU.nextDouble();
                    MJ = m/v;
                    System.out.println("HASIL : " + MJ);
                    break;

                case 2:
                    System.out.print("Masukkan Massa Bendanya : ");
                    ma = iU.nextDouble();
                    System.out.print("Masukkan Percepatannya :");
                    a = iU.nextDouble();
                    RG = ma*a;
                    System.out.println("HASIL : " + RG);
                    break;

                case 3:
                    System.out.print("Masukkan Masa Bendanya : ");
                    mb = iU.nextDouble();
                    System.out.print("Masukkan Volumenya :");
                    g = iU.nextDouble();
                    System.out.print("Masukkan Ketinggiannya :");
                    h = iU.nextDouble();
                    ep = mb*g*h;
                    System.out.println("HASIL : " + ep);
                    break;

                case 4:
                    System.out.print("Masukkan Volumenya : ");
                    vo = iU.nextDouble();
                    System.out.print("Masukkan Massanya :");
                    ms = iU.nextDouble();
                    ep = 1/2*ms*vo*vo;
                    System.out.println("HASIL : " + ep);
                    break;

                case 5:
                    System.out.print("Masukkan Jarak : ");
                    s = iU.nextDouble();
                    System.out.print("Masukkan Periodenya :");
                    p = iU.nextDouble();
                    crg1 = s/p;
                    System.out.println("Hasil Untuk Volume Cepat Rambat Gelombang 1 : " + crg1);
                    System.out.print("Masukkan Panjang Gelombang : ");
                    pg = iU.nextDouble();
                    System.out.print("Masukkan Frekuensinya :");
                    fr = iU.nextDouble();
                    crg2 = pg*fr;
                    System.out.println("Hasil Untuk Volume Cepat Rambat Gelombang 2: " + crg2);
                    System.out.print("Masukkan Periode Gelombangnya : ");
                    pg  = iU.nextDouble();
                    System.out.print("Masukkan Periodenya :");
                    p = iU.nextDouble();
                    crg3 = pg/p;
                    System.out.println("Hasil Untuk Volume Cepat Rambat Gelombang 3 : " + crg3);
                    break;

                    default:
          System.out.println("\nMASUKKAN INPUT YANG BENAR YAA !!!!\n");
                    
            }
            System.out.println("Lagi? \n1. Iya\n2. Tidak");
            pil2 = iU.nextInt();
            
            if (pil2 == 1) {
                lagi = true;
            }else if (pil2 == 2) {
                lagi = false;
            }
            
        }while (lagi == true);
        }    
}