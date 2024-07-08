/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklseleksikondisi;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class UKLSeleksiKondisi {

    public static void main(String[] args) {
        String namaPelanggan = "";
        double biayaAir, Administrasi, totalTagihan;

        int[] id = {1, 2, 3, 4, 5};
        int pil2;
        boolean lagi = true;
        String[] nama = {"Ali", "Budi", "Dani", "Edi", "Umar"};

        Scanner iU = new Scanner(System.in);
        
    do {
        
        System.out.println(" -------------------------------------------------- ");
        System.out.println("|            DATA TAGIHAN PDAM                     |");
        System.out.println(" ================================================== ");
        System.out.println("| ID |             Nama Pelanggan                  |");
        System.out.println("|-------------------------------------------------- ");
        System.out.println("| 1  | Ali                                         |");
        System.out.println("| 2  | Budi                                        |");
        System.out.println("| 3  | Dani                                        |");
        System.out.println("| 4  | Edi                                         |");
        System.out.println("| 4  | Umar                                        |");
        System.out.println("|==================================================|");
        System.out.print("Masukkan ID Pelanggan Anda        : ");
        int ID = iU.nextInt();
        System.out.print("Masukkan Pemakaian Air Anda (/M3) : ");
        int pemakaian = iU.nextInt();

        for (int i = 0; i < id.length; i++) {
            if (id[i] == ID) {
                namaPelanggan = nama[i];
                
                break;
            }
        }

        if (pemakaian < 10) {
            biayaAir = pemakaian * 2000;
        } else if (pemakaian <= 20) {
            biayaAir = 10 * 2000 + (pemakaian - 10) * 3000;
        } else if (pemakaian <= 30) {
            biayaAir = 10 * 2000 + 10 * 3000 + (pemakaian - 20) * 4000;
        } else {
            biayaAir = 10 * 2000 + 10 * 3000 + 10 * 4000 + (pemakaian - 30) * 5000;
        }
        Administrasi = 10000;
        totalTagihan = biayaAir + Administrasi;

        System.out.println("ID pelanggan                     : " + ID);
        System.out.println("Nama pelanggan                   : " + namaPelanggan);
        System.out.println("Jumlah pemakaian air             : " + pemakaian + " m3");   
        System.out.println("Total tagihan                    : Rp" + totalTagihan);
        
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

  