/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraymultidimensi;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class ArrayMultiDimensi {
public static void main(String[] args) {

        // Membuat Array dan Scanner
        String[][] nama = new String[3][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap posisi pemain
        for(int bar = 0; bar < nama.length; bar++){
            for(int kol = 0; kol < nama[bar].length; kol++){
                System.out.format("Masukkan Nama (%d,%d): ", bar, kol);
                nama[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < nama.length; bar++){
            for(int kol = 0; kol < nama[bar].length; kol++){
                System.out.format("| %s | \t", nama[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}
