/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kontol;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class UKLKondisi5 {

    public static void main(String[] args) {
        int[][] tarifCottage = {
            // Weekday, Weekend, Holiday
                {915000, 1025000, 1225000},  // Duku
                {915000, 1025000, 1225000},  // Jeruk
                {575000, 595000, 895000},    // Alpukat
                {575000, 595000, 895000},    // Jambu Air
                {595000, 715000, 915000},    // Durian
                {595000, 715000, 915000},    // Melon
                {495000, 575000, 755000},    // Belimbing
                {495000, 575000, 755000},    // Mangga
                {495000, 575000, 755000},    // Kedondong
                {25000, 25000, 35000}        // Barrack
        };

        String[] dataPelanggan = {"Ali", "Budi", "Dani", "Edi", "Umar"};

        Scanner iU = new Scanner(System.in);
        System.out.println(" -------------------------------------------------- ");
            System.out.println("|                    DATA                          |");
            System.out.println(" ================================================== ");
            System.out.println("| ID |             Nama Pelanggan                  |");
            System.out.println("|-------------------------------------------------- ");
            System.out.println("| 1  | Ali                                         |");
            System.out.println("| 2  | Budi                                        |");
            System.out.println("| 3  | Dani                                        |");
            System.out.println("| 4  | Edi                                         |");
            System.out.println("| 5  | Umar                                        |");
            System.out.println("|==================================================|");
        System.out.print("Masukkan ID Pelanggan Anda : ");
        int idPelanggan = iU.nextInt();

        if (idPelanggan < 1 || idPelanggan > dataPelanggan.length) {
            System.out.println("ID Pelanggan tidak valid.");
            return;
        }
        

        String namaPelanggan = dataPelanggan[idPelanggan - 1];

        System.out.println(" ===================================================== ");
            System.out.println("| NO |             List Cottage                    |");
            System.out.println("|-------------------------------------------------- ");
            System.out.println("| 1  | Duku                                         |");
            System.out.println("| 2  | Jeruk                                        |");
            System.out.println("| 3  | Alpukat                                      |");
            System.out.println("| 4  | Jambu Air                                    |");
            System.out.println("| 5  | Durian                                       |");
            System.out.println("| 6  | Melon                                        |");
            System.out.println("| 7  | Belimbing                                    |");
            System.out.println("| 8  | Mangga                                       |");
            System.out.println("| 9  | Kedondong                                    |");
            System.out.println("| 10 | Barrack                                      |");
            System.out.println("|==================================================|");
            System.out.print("Pilih Cottage Yang Anda Inginkan : ");
            int ct = iU.nextInt();

        int indeksTipeCottage = ct;
        if (indeksTipeCottage == -1) {
            System.out.println("Tipe Cottage tidak valid.");
            return;
        }

        System.out.println(" ====================================================== ");
        System.out.println("|  WeekDay    |  WeekEnd    | Holiday                  |");
        System.out.println("|------------------------------------------------------|");
        System.out.print("Masukkan Golongan Hari Yang Anda Inginkan : ");
        String golonganHari = iU.next();

        int indeksGolonganHari = getIndeksGolonganHari(golonganHari);
        if (indeksGolonganHari == -1) {
            System.out.println("Golongan Hari tidak valid.");
            return;
        }

        System.out.print("Masukkan Lama Menginap (dalam hari ? : ");
        int lamaMenginap = iU.nextInt();

        int biayaPenginapan = tarifCottage[indeksTipeCottage][indeksGolonganHari] * lamaMenginap;

        System.out.println(" ================================================== ");
                System.out.println("| NO |         DATA YANG ANDA MASUKKAN             |");
                System.out.println("|-------------------------------------------------- ");
                System.out.println(  "| 1  | ID Pelanggan             : " + idPelanggan);
                System.out.println(  "| 2  | Nama Pelanggan           : " + namaPelanggan);
                System.out.println(  "| 3  | Cottage Yang Diinginkan  : " + ct);
                System.out.println(  "| 4  | Hari Untuk Menginap      : " + golonganHari);
                System.out.println(  "| 5  | Berapa Malam Menginap    : " + lamaMenginap + " hari");
                System.out.println(  "| 7  | Total Harga              : Rp. " + biayaPenginapan);
                System.out.println("|==================================================|"); 
    }

    private static int getIndeksTipeCottage(String tipeCottage) {
        String[] tipeCottages = {"Duku", "Jeruk", "Alpukat", "Jambu Air", "Durian", "Melon", "Belimbing", "Mangga", "Kedondong", "Barrack"};
        for (int i = 0; i < tipeCottages.length; i++) {
            if (tipeCottages[i].equalsIgnoreCase(tipeCottage)) {
                return i;
            }
        }
        return -1;
    }

    private static int getIndeksGolonganHari(String golonganHari) {
        String[] golonganHariArr = {"Weekday", "Weekend", "Holiday"};
        for (int i = 0; i < golonganHariArr.length; i++) {
            if (golonganHariArr[i].equalsIgnoreCase(golonganHari)) {
                return i;
            }
        }
        return -1;
    }
}