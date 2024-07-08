/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testai;
import java.util.Scanner;

public class Testai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Silakan pilih salah satu opsi:");
        System.out.println("1. Mengisi Kecepatan dan Waktu");
        System.out.println("2. Mengisi Jarak dan Kecepatan");
        System.out.println("3. Mengisi Jarak dan Waktu");
        int pilihan = input.nextInt();

        int jarak, kecepatan, waktu;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Kecepatan (km/jam): ");
                kecepatan = input.nextInt();
                System.out.print("Masukkan Waktu (jam): ");
                waktu = input.nextInt();
                jarak = waktu * kecepatan;
                System.out.println("Jarak yang ditempuh adalah " + jarak + " kilometer.");
                break;
            case 2:
                System.out.print("Masukkan Jarak (kilometer): ");
                jarak = input.nextInt();
                System.out.print("Masukkan Kecepatan (km/jam): ");
                kecepatan = input.nextInt();
                waktu = jarak / kecepatan;
                System.out.println("Waktu yang dibutuhkan adalah " + waktu + " jam.");
                break;
            case 3:
                System.out.print("Masukkan Jarak (kilometer): ");
                jarak = input.nextInt();
                System.out.print("Masukkan Waktu (jam): ");
                waktu = input.nextInt();
                kecepatan = jarak / waktu;
                System.out.println("Kecepatan yang diperlukan adalah " + kecepatan + " km/jam.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}