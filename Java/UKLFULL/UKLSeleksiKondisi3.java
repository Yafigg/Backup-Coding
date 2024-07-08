/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklseleksikondisi4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class UKLSeleksiKondisi4 {

    public static void main(String[] args) {
        
        int[] id = {1, 2, 3, 4};
        char[] kp = {'A', 'B', 'C'};
        int pil2;
        boolean lagi = true;
        String[] asalntujuan = {"Waru", "Sidoarjo", "Porong"};
        int[] golongan = {1, 2, 3};
        String[] kendaraan = {"Sedan", "Jip", "Pick Up", "Truk Dengan 2 Sumbu Roda", "Truk Dengan 3 Sumbu Roda"};

        Scanner iU = new Scanner(System.in);


        do {
            System.out.println(" -------------------------------------------------- ");
            System.out.println("|                    ASAL                          |");
            System.out.println(" ================================================== ");
            System.out.println("| 1  Waru                                          |");
            System.out.println("| 2  Sidoarjo                                      |");
            System.out.println("| 3  Porong                                        |");
            System.out.println("|==================================================|");
            System.out.print("Masukkan Asal Anda        : ");
        int asal = iU.nextInt();
        
            if (asal >= 1 && asal <= id.length) {
                System.out.println(" -------------------------------------------------- ");
                System.out.println("|                   TUJUAN                         |");
                System.out.println(" ================================================== ");
                System.out.println("| 1 Sidoarjo                                       |");
                System.out.println("| 2 Porong                                         |");
                System.out.println("|==================================================|");
                System.out.print("Masukkan Tujuan Anda                 : ");
                int tujuan = iU.nextInt();
                
                if (tujuan >= 1 && tujuan <= id.length) {
                    System.out.println(" -------------------------------------------------- ");
                    System.out.println("|               KATEGORI KENDARAAN                |");
                    System.out.println(" ================================================== ");
                    System.out.println("| KATEGORI         | KENDARAAN                    |");
                    System.out.println("|-------------------------------------------------- ");
                    System.out.println("| 1                | Sedan, Jip, Pick Up           |");
                    System.out.println("| 2                | Truk Dengan 2 Sumbu Roda      |");
                    System.out.println("| 3                | Truk Dengan 3 Sumbu Roda      |");
                    System.out.println("|==================================================|");
                    System.out.print("Masukkan Kategori Kendaraan Anda : ");
                    int KK = iU.nextInt();

                    String kategori1 = "";


                    switch (KK) {
                        case 1:
                            kategori1 = "Rp 6.000,00";      
                            break;
                        case 2:
                            kategori1 = "Rp 9.000,00";       
                            break;
                        case 3:
                            kategori1 = "Rp 9.000,00";       
                            break;
                        default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + kategori1);
                } else if (tujuan >= 2 && tujuan <= id.length) {
                    System.out.println(" -------------------------------------------------- ");
                    System.out.println("|               KATEGORI KENDARAAN                |");
                    System.out.println(" ================================================== ");
                    System.out.println("| KATEGORI         | KENDARAAN                    |");
                    System.out.println("|-------------------------------------------------- ");
                    System.out.println("| 1                | Sedan, Jip, Pick Up           |");
                    System.out.println("| 2                | Truk Dengan 2 Sumbu Roda      |");
                    System.out.println("| 3                | Truk Dengan 3 Sumbu Roda      |");
                    System.out.println("|==================================================|");
                    System.out.print("Masukkan Kategori Kendaraan Anda : ");
                    int KK = iU.nextInt();

                    String kategori2 = "";


                    switch (KK) {
                        case 1:
                            kategori2 = "Rp 9.000,00";      
                            break;
                        case 'B':
                            kategori2 = "Rp 14.000,00";       
                            break;
                        case 'C':
                            kategori2 = "Rp 14.000,00";       
                            break;
                        default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + kategori2);
                } else {
                    System.out.println("Masukkan Yang Benar YAAAAAA!!!!");
                }
                
                
            } else if (asal >= 2 && asal <= id.length) {
                System.out.println(" -------------------------------------------------- ");
                System.out.println("|                   TUJUAN                         |");
                System.out.println(" ================================================== ");
                System.out.println("| 1 Waru                                           |");
                System.out.println("| 2 Porong                                         |");
                System.out.println("|==================================================|");
                System.out.print("Masukkan Tujuan Anda                 : ");
                int tujuan2 = iU.nextInt();
                
                if (tujuan2 >= 1 && tujuan2 <= id.length) {
                    System.out.println(" -------------------------------------------------- ");
                    System.out.println("|               KATEGORI KENDARAAN                |");
                    System.out.println(" ================================================== ");
                    System.out.println("| KATEGORI         | KENDARAAN                    |");
                    System.out.println("|-------------------------------------------------- ");
                    System.out.println("| 1                | Sedan, Jip, Pick Up           |");
                    System.out.println("| 2                | Truk Dengan 2 Sumbu Roda      |");
                    System.out.println("| 3                | Truk Dengan 3 Sumbu Roda      |");
                    System.out.println("|==================================================|");
                    System.out.print("Masukkan Kategori Kendaraan Anda : ");
                    int KK = iU.nextInt();

                    String kategori3 = "";


                    switch (KK) {
                        case 1:
                            kategori3 = "Rp 6.000,00";      
                            break;
                        case 2:
                            kategori3 = "Rp 9.000,00";       
                            break;
                        case 3:
                            kategori3 = "Rp 9.000,00";       
                            break;
                        default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + kategori3);
                } else if (tujuan2 >= 2 && tujuan2 <= id.length) {
                    System.out.println(" -------------------------------------------------- ");
                    System.out.println("|               KATEGORI KENDARAAN                |");
                    System.out.println(" ================================================== ");
                    System.out.println("| KATEGORI         | KENDARAAN                    |");
                    System.out.println("|-------------------------------------------------- ");
                    System.out.println("| 1                | Sedan, Jip, Pick Up           |");
                    System.out.println("| 2                | Truk Dengan 2 Sumbu Roda      |");
                    System.out.println("| 3                | Truk Dengan 3 Sumbu Roda      |");
                    System.out.println("|==================================================|");
                    System.out.print("Masukkan Kategori Kendaraan Anda : ");
                    int KK = iU.nextInt();

                    String kategori4 = "";


                    switch (KK) {
                        case 1:
                            kategori4 = "Rp 5.500,00";      
                            break;
                        case 'B':
                            kategori4 = "Rp 8.500,00";       
                            break;
                        case 'C':
                            kategori4 = "Rp 8.500,00";       
                            break;
                        default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + kategori4);
                } else {
                    System.out.println("Masukkan Yang Benar YAAAAAA!!!!");
                }
                
            } else if (asal >= 3 && asal <= id.length) {
                System.out.println(" -------------------------------------------------- ");
                System.out.println("|                   TUJUAN                         |");
                System.out.println(" ================================================== ");
                System.out.println("| 1 Waru                                           |");
                System.out.println("| 2 Sidoarjo                                         |");
                System.out.println("|==================================================|");
                System.out.print("Masukkan Tujuan Anda                 : ");
                int tujuan3 = iU.nextInt();
                
                if (tujuan3 >= 1 && tujuan3 <= id.length) {
                    System.out.println(" -------------------------------------------------- ");
                    System.out.println("|               KATEGORI KENDARAAN                |");
                    System.out.println(" ================================================== ");
                    System.out.println("| KATEGORI         | KENDARAAN                    |");
                    System.out.println("|-------------------------------------------------- ");
                    System.out.println("| 1                | Sedan, Jip, Pick Up           |");
                    System.out.println("| 2                | Truk Dengan 2 Sumbu Roda      |");
                    System.out.println("| 3                | Truk Dengan 3 Sumbu Roda      |");
                    System.out.println("|==================================================|");
                    System.out.print("Masukkan Kategori Kendaraan Anda : ");
                    int KK = iU.nextInt();

                    String kategori5 = "";


                    switch (KK) {
                        case 1:
                            kategori5 = "Rp 9.000,00";      
                            break;
                        case 2:
                            kategori5 = "Rp 14.000,00";       
                            break;
                        case 3:
                            kategori5 = "Rp 14.000,00";       
                            break;
                        default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + kategori5);
                } else if (tujuan3 >= 2 && tujuan3 <= id.length) {
                    System.out.println(" -------------------------------------------------- ");
                    System.out.println("|               KATEGORI KENDARAAN                |");
                    System.out.println(" ================================================== ");
                    System.out.println("| KATEGORI         | KENDARAAN                    |");
                    System.out.println("|-------------------------------------------------- ");
                    System.out.println("| 1                | Sedan, Jip, Pick Up           |");
                    System.out.println("| 2                | Truk Dengan 2 Sumbu Roda      |");
                    System.out.println("| 3                | Truk Dengan 3 Sumbu Roda      |");
                    System.out.println("|==================================================|");
                    System.out.print("Masukkan Kategori Kendaraan Anda : ");
                    int KK = iU.nextInt();

                    String kategori6 = "";


                    switch (KK) {
                        case 1:
                            kategori6 = "Rp 5.500,00";      
                            break;
                        case 'B':
                            kategori6 = "Rp 8.500,00";       
                            break;
                        case 'C':
                            kategori6 = "Rp 8.500,00";       
                            break;
                        default:
                        
                }

                System.out.println("Jumlah Biaya Yang Harus Dikeluarkan Adalah : " + kategori6);
                } else {
                    System.out.println("Masukkan Yang Benar YAAAAAA!!!!");
                }
            } else {
                System.out.println("Masukkan Yang Benar Yaaaa!!!!!");
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