/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumarraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class PraktikumArrayList {

    public static void main(String[] args) {
        
        ArrayList friendlist = new ArrayList();
        Scanner iU = new Scanner(System.in);
        boolean lagi = true;

        int pil2;
        int pilihan1;
        int pilihan2;


        do {
            System.out.println(" -------------------------------------------------- ");
            System.out.println("|               DATA TAGIHAN LISTRIK               |");
            System.out.println(" ================================================== ");
            System.out.println("| ID | Nama         | Golongan   | Alamat          |");
            System.out.println("|-------------------------------------------------- ");
            System.out.println("| 1  | Galuh        | 1          | Sawojajar       |");
            System.out.println("| 2  | Indro        | 3          | Kedung Kandang  |");
            System.out.println("| 3  | Jedi         | 2          | Ijen            |");
            System.out.println("| 4  | Kanu         | 3          | Dinoyo          |");
            System.out.println("|==================================================|");
            System.out.print("Masukkan ID Pelanggan Anda        : ");
            pilihan2 = iU.nextInt();

            
            
            switch (pilihan2) {
                case 1:
                    System.out.print("Masukkan Pemakaian (/kwh) : ");
                    int kwh = iU.nextInt();
                    System.out.println("-------------------------------------");
                    System.out.println("ID Pelanggan            : 1");
                    System.out.println("Nama                    : Galuh");
                    System.out.println("Golongan                : 1");
                    System.out.println("Alamat                  : Sawojajar");                    
                    int hasil = 1000*kwh+13000;
                    if (hasil<=50000) {
                        System.out.println("Tagihan Anda            : 50000");
                    }
                    else if (hasil>50000) {
                        System.out.println("Tagihan Anda            : " + hasil);
                    
                    }
                    
                            
                    break;

                case 2:
                    System.out.print("Masukkan Pemakaian (/kwh) : ");
                    int kwh1 = iU.nextInt();
                    System.out.println("-------------------------------------");
                    System.out.println("ID Pelanggan            : 2");
                    System.out.println("Nama                    : Indro");
                    System.out.println("Golongan                : 3");
                    System.out.println("Alamat                  : Kedung Kandang");
                    int hasil1 = 1500*kwh1+13000;
                    if (hasil1<=50000) {
                        System.out.println("Tagihan Anda            : 50000");
                    }
                    else if (hasil1>50000) {
                        System.out.println("Tagihan Anda            : " + hasil1);
                    
                    }
                    
                            
                    break;

                case 3:
                    System.out.print("Masukkan Pemakaian (/kwh) : ");
                    int kwh3 = iU.nextInt();
                    System.out.println("-------------------------------------");
                    System.out.println("ID Pelanggan            : 3");
                    System.out.println("Nama                    : Jedi");
                    System.out.println("Golongan                : 2");
                    System.out.println("Alamat                  : Ijen");
                    int hasil3 = 1300*kwh3+13000;
                    if (hasil3<=50000) {
                        System.out.println("Tagihan Anda            : 50000");
                    }
                    else if (hasil3>50000) {
                        System.out.println("Tagihan Anda            : " + hasil3);
                    
                    }
                    
                            
                    break;

                case 4:
                    System.out.print("Masukkan Pemakaian (/kwh) : ");
                    int kwh4 = iU.nextInt();
                    System.out.println("-------------------------------------");
                    System.out.println("ID Pelanggan            : 4");
                    System.out.println("Nama                    : Kanu");
                    System.out.println("Golongan                : 3");
                    System.out.println("Alamat                  : Dinoyo");
                    int hasil4 = 1500*kwh4+1300;
                    if (hasil4<=50000) {
                        System.out.println("Tagihan Anda            : 50000");
                    }
                    else if (hasil4>50000) {
                        System.out.println("Tagihan Anda            : " + hasil4);
                    
                    }
                    
                    
                            
                    break;

                    default:
          System.out.println("\nMASUKKAN INPUT YANG BENAR YAA !!!!\n");                       

            }
            System.out.println("Jika Ada Kesalahan Saat Mendapatkan Informasi, Mohon Maaf. Terima Kasih !!!!");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Ingin Melihat Informasi Lainnya ? \n1. Iya\n2. Tidak  : ");
            pil2 = iU.nextInt();
            
            if (pil2 == 1) {
                lagi = true;
            }else if (pil2 == 2) {
                lagi = false;
            }
            
        }while (lagi == true);
        }    
    }