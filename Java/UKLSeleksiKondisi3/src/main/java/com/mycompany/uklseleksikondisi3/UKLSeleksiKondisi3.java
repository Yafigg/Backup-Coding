/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklseleksikondisi3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class UKLSeleksiKondisi3 {

    public static void main(String[] args) {
        
        int[] id = {1, 2, 3, 4};
        char[] kp = {'A', 'B', 'C'};
        int pil2;
        boolean lagi = true;
        String[] nama = {"Mira", "Nina", "Oemar", "Pena"};
        String[] jalurmasuk = {"SBMPTN", "SNMPTN", "MANDIRI", "SBMPTN"};

        Scanner iU = new Scanner(System.in);


        do {
            System.out.println(" -------------------------------------------------- ");
            System.out.println("|               DATA MAHASISWA                     |");
            System.out.println(" ================================================== ");
            System.out.println("| ID | Nama      | Jalur Masuk   | Alamat          |");
            System.out.println("|-------------------------------------------------- ");
            System.out.println("| 1  | Mira      | SBMPTN        | Sawojajar       |");
            System.out.println("| 2  | Nina      | SNMPTN        | Kedung Kandang  |");
            System.out.println("| 3  | Oemar     | MANDIRI       | Ijen            |");
            System.out.println("| 4  | Pena      | SBMPTN        | Dinoyo          |");
            System.out.println("|==================================================|");
            System.out.print("Masukkan ID Mahasiswa Anda        : ");
        int ID = iU.nextInt();
        
            if (ID >= 1 && ID <= id.length) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("ID                                : " + id[ID - 1]);
                System.out.println("Nama                              : " + nama[ID - 1]);
                System.out.println("Jalur Masuk                       : " + jalurmasuk[ID -1]);
                System.out.println(" -------------------------------------------------- ");
                System.out.println("|               KATEGORI PENDAPATAN                |");
                System.out.println(" ================================================== ");
                System.out.println("| KATEGORI         | PENDAPATAN                    |");
                System.out.println("|-------------------------------------------------- ");
                System.out.println("| A                | <2 JUTA                       |");
                System.out.println("| B                | 2 JUTA S.D 10 JUTA            |");
                System.out.println("| C                | >10 JUTA                      |");
                System.out.println("|==================================================|");
                System.out.print("Kategori Pendapatan                 : ");
                char KP = iU.next().charAt(0);

                String jumlahBiayaDSP1 = "";
                String jumlahBiayaSPP1 = "";


                switch (KP) {
                    case 'A','a':
                        jumlahBiayaDSP1 = "Rp 5 Juta";
                        jumlahBiayaSPP1 = "Rp 500 Ribu";       
                        break;
                    case 'B':
                        jumlahBiayaDSP1 = "Rp 15 Juta";
                        jumlahBiayaSPP1 = "Rp 1 Juta";       
                        break;
                    case 'C':
                        jumlahBiayaDSP1 = "Rp 30 Juta";
                        jumlahBiayaSPP1 = "Rp 2 Juta";       
                        break;
                    default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + jumlahBiayaDSP1);
                System.out.println("Jumlah Biaya SPP Yang Harus Di Bayar Adalah : " + jumlahBiayaSPP1);
            } else if (ID >= 2 && ID <= id.length){
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("ID                                : " + id[ID - 2]);
                System.out.println("Nama                              : " + nama[ID - 2]);
                System.out.println("Jalur Masuk                       : " + jalurmasuk[ID -2]);
                System.out.println(" -------------------------------------------------- ");
                System.out.println("|               KATEGORI PENDAPATAN                |");
                System.out.println(" ================================================== ");
                System.out.println("| KATEGORI         | PENDAPATAN                    |");
                System.out.println("|-------------------------------------------------- ");
                System.out.println("| A                | <2 JUTA                       |");
                System.out.println("| B                | 2 JUTA S.D 10 JUTA            |");
                System.out.println("| C                | >10 JUTA                      |");
                System.out.println("|==================================================|");
                System.out.println("Kategori Pendapatan                 : ");
                char KP = iU.next().charAt(0);

                String jumlahBiayaDSP2 = "";
                String jumlahBiayaSPP2 = "";

                // Calculate expenses based on income category
                switch (KP) {
                    case 'A':
                        jumlahBiayaDSP2 = "Rp 7 Juta";
                        jumlahBiayaSPP2 = "Rp 500 Ribu";       
                        break;
                    case 'B':
                        jumlahBiayaDSP2 = "Rp 17 Juta";
                        jumlahBiayaSPP2 = "Rp 1 Juta";       
                        break;
                    case 'C':
                        jumlahBiayaDSP2 = "Rp 35 Juta";
                        jumlahBiayaSPP2 = "Rp 2 Juta";       
                        break;
                    default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + jumlahBiayaDSP2);
                System.out.println("Jumlah Biaya SPP Yang Harus Di Bayar Adalah : " + jumlahBiayaSPP2);
            } else if (ID >= 3 && ID <= id.length){
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("ID                                : " + id[ID - 3]);
                System.out.println("Nama                              : " + nama[ID - 3]);
                System.out.println("Jalur Masuk                       : " + jalurmasuk[ID -3]);
                System.out.println(" -------------------------------------------------- ");
                System.out.println("|               KATEGORI PENDAPATAN                |");
                System.out.println(" ================================================== ");
                System.out.println("| KATEGORI         | PENDAPATAN                    |");
                System.out.println("|-------------------------------------------------- ");
                System.out.println("| A                | <2 JUTA                       |");
                System.out.println("| B                | 2 JUTA S.D 10 JUTA            |");
                System.out.println("| C                | >10 JUTA                      |");
                System.out.println("|==================================================|");
                System.out.println("Kategori Pendapatan                 : ");
                char KP = iU.next().charAt(0);

                String jumlahBiayaDSP3 = "";
                String jumlahBiayaSPP3 = "";

                // Calculate expenses based on income category
                switch (KP) {
                    case 'A':
                        jumlahBiayaDSP3 = "Rp 10 Juta";
                        jumlahBiayaSPP3 = "Rp 1 Juta";       
                        break;
                    case 'B':
                        jumlahBiayaDSP3 = "Rp 35 Juta";
                        jumlahBiayaSPP3 = "Rp 2 Juta";       
                        break;
                    case 'C':
                        jumlahBiayaDSP3 = "Rp 50 Juta";
                        jumlahBiayaSPP3 = "Rp 3 Juta";       
                        break;
                    default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + jumlahBiayaDSP3);
                System.out.println("Jumlah Biaya SPP Yang Harus Di Bayar Adalah : " + jumlahBiayaSPP3);
            } else if (ID >= 1 && ID <= id.length) {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("ID                                : " + id[ID - 4]);
                System.out.println("Nama                              : " + nama[ID - 4]);
                System.out.println("Jalur Masuk                       : " + jalurmasuk[ID -4]);
                System.out.println(" -------------------------------------------------- ");
                System.out.println("|               KATEGORI PENDAPATAN                |");
                System.out.println(" ================================================== ");
                System.out.println("| KATEGORI         | PENDAPATAN                    |");
                System.out.println("|-------------------------------------------------- ");
                System.out.println("| A                | <2 JUTA                       |");
                System.out.println("| B                | 2 JUTA S.D 10 JUTA            |");
                System.out.println("| C                | >10 JUTA                      |");
                System.out.println("|==================================================|");
                System.out.println("Kategori Pendapatan                 : ");
                char KP = iU.next().charAt(0);

                String jumlahBiayaDSP4 = "";
                String jumlahBiayaSPP4 = "";

                // Calculate expenses based on income category
                switch (KP) {
                    case 'A':
                        jumlahBiayaDSP4 = "Rp 5 Juta";
                        jumlahBiayaSPP4 = "Rp 500 Ribu";       
                        break;
                    case 'B':
                        jumlahBiayaDSP4 = "Rp 15 Juta";
                        jumlahBiayaSPP4 = "Rp 1 Juta";       
                        break;
                    case 'C':
                        jumlahBiayaDSP4 = "Rp 30 Juta";
                        jumlahBiayaSPP4 = "Rp 2 Juta";       
                        break;
                    default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + jumlahBiayaDSP4);
                System.out.println("Jumlah Biaya SPP Yang Harus Di Bayar Adalah : " + jumlahBiayaSPP4);
            } else {
                System.out.println("MASUKKAN YANG BENAR YAAAA!!!!");
            }
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Ingin Melihat ingin Mengulanginya Lagi ? \nMohon Masukkan Angka 1 Atau 2 \n1. Iya\n2. Tidak  : ");
        pil2 = iU.nextInt();
            
        if (pil2 == 1) {
            lagi = true;
        }else if (pil2 == 2) {
            lagi = false;
        }
            
        }while (lagi == true);
        }    
    }