/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */


public class OperatorAritmatika {

    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        // Input angka pertama dan kedua
        try (Scanner keyboard = new Scanner(System.in)) {
            // Input angka pertama dan kedua
            System.out.print("Input angka-1: ");
            angka1 = keyboard.nextInt(4);
            System.out.print("Input angka-2: ");
            angka2 = keyboard.nextInt(2);
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
        }
    }
}

