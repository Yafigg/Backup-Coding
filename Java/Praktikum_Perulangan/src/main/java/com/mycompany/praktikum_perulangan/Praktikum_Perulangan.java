/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_perulangan;

/**
 *
 * @author Yafig
 */
public class Praktikum_Perulangan {

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 32");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak wikusama");
            } else {
                System.out.println(i + ". saya anak moklet");
            }
        }
    }
}