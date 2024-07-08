/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testai1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class TESTAI1 {

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==============================");
        System.out.print("Masukkan ID Pelanggan (1-5): ");
        int idPelanggan = scanner.nextInt();

        if (idPelanggan < 1 || idPelanggan > dataPelanggan.length) {
            System.out.println("ID Pelanggan tidak valid.");
            return;
        }

        String namaPelanggan = dataPelanggan[idPelanggan - 1];

        System.out.print("Pilih Tipe Cottage (Duku/Jeruk/Alpukat/Jambu Air/Durian/Melon/Belimbing/Mangga/Kedondong/Barrack): ");
        String tipeCottage = scanner.next();

        int indeksTipeCottage = getIndeksTipeCottage(tipeCottage);
        if (indeksTipeCottage == -1) {
            System.out.println("Tipe Cottage tidak valid.");
            return;
        }

        System.out.print("Pilih Golongan Hari (Weekday/Weekend/Holiday): ");
        String golonganHari = scanner.next();

        int indeksGolonganHari = getIndeksGolonganHari(golonganHari);
        if (indeksGolonganHari == -1) {
            System.out.println("Golongan Hari tidak valid.");
            return;
        }

        System.out.print("Masukkan Lama Menginap (dalam hari): ");
        int lamaMenginap = scanner.nextInt();

        int biayaPenginapan = tarifCottage[indeksTipeCottage][indeksGolonganHari] * lamaMenginap;

        System.out.println("\nInformasi Pelanggan");
        System.out.println("ID Pelanggan: " + idPelanggan);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Tipe Cottage: " + tipeCottage);
        System.out.println("Golongan Hari: " + golonganHari);
        System.out.println("Lama Menginap: " + lamaMenginap + " hari");
        System.out.println("Biaya Penginapan: Rp. " + biayaPenginapan);
        System.out.println("===========================================\n");
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