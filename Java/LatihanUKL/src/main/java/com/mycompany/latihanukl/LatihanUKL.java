/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Yafig
 */
public class LatihanUKL {
    static Scanner scan = new Scanner (System.in);
    ArrayList friendlist = new ArrayList();
        Scanner iU = new Scanner(System.in);
        
        //daftar friendlist
        String daftarteman = "\n1. Akmal" + "\n2. Reymas" + "\n3. Davin" + "\n4. Davito" + "\n5. Haidar";
        
        boolean lagi = true;

        int pil2;
        int pilihan;

        //deklarasi variabel
        String a;
        String r;
        String d;
        String da;
        String h;
        double hasil;

        do {
            System.out.println("========== List Of Friends Traits ==========");
            System.out.println(daftarteman);
            System.out.println("=============================");
            System.out.print("Pilih Dari Beberapa List Teman Yang Sudah Saya Berikan : ");
            pilihan = iU.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("HASIL : " + "Sifat Akmal Kayak Thomas Shelbyy, Cuekk Banget Chuakzzzz");
                    break;

                case 2:
                    System.out.println("HASIL : " + "Sifat Reymas Tidak Bisa dideskripsikan Dengan Kata-Kata");
                    break;

                case 3:
                    System.out.println("HASIL : " + "Sifat Davin Kayak Anjing Mesohan Tai");
                    break;

                case 4:
                    System.out.println("HASIL : " + "Sifat Davito Kayak Gimana Ya");
                    break;

                case 5:
                    System.out.println("HASIL : " + "Sifat Haidar Gatau ");
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