/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulanganbintang_ciptoyafigadiwongso;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
import java.util.Scanner;

public class PerulanganBintang_CiptoYafigAdiwongso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris dan kolom: ");
        
        int rows = input.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        input.close();
    }
}
