/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl4;

/**
 *
 * @author Yafig
 */
public class UKL4 {

    public static void main(String[] args) {
        int AP = 5;

        // BINTANG ATAS
        for (int i = 1; i <= 3; i++) { // baris
            for (int I = 1; I <= i; I++) { // kolom
                System.out.print(AP + "\t ");
                AP += 3;
            }
            System.out.println();
        }

        // BINTANG BAWAH
        for (int i = 3 - 1; i >= 1; i--) {
            for (int I = 1; I <= i; I++) {
                System.out.print(AP + "\t ");
                AP += 3;
            }
            System.out.println();
        }
    }
}