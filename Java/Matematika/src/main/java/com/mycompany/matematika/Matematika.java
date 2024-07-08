/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matematika;

/**
 *
 * @author Yafig
 */
import java.util.Scanner;

public class Matematika {

    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        // Input angka pertama dan kedua
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // Penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil Penjumlahan = " + hasil);

        // Pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil Pengurangan = " + hasil);

        // Perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil Perkalian = " + hasil);

        // Pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil Pembagian = " + hasil);

        // Sisa Bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil Sisa Bagi = " + hasil);

        // Menutup Scanner
        keyboard.close();
    }
}

