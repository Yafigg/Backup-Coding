/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pertemuan2;

/**
 *
 * @author Yafig
 */

import java.util.Scanner;

public class Luassegitiga {

    public static void main(String[] args) {
        // deklarasi
        Double luas;
        int alas, tinggi;

        // mebuat scanner baru
        Scanner baca = new Scanner(System.in);

        // Input
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = baca.nextInt();

        // proses
        luas = Double.valueOf((alas * tinggi) / 2);

        // output
        System.out.println("Luas = " + luas);
    }

}
