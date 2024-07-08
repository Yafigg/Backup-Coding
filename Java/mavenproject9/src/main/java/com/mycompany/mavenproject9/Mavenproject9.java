/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class Mavenproject9 {

    public static void main(String[] args) {
        Scanner iV = new Scanner(System.in);
        
        System.out.print("Masukkan Baris : ");
        int baris = iV.nextInt();
        System.out.print("Masukkan Kolom : ");
        int kolom = iV.nextInt();
        
        for (int bilangan =1; bilangan <= baris; bilangan++) {
            for (int j =1; j <= kolom; j ++){
               System.out.print("*");
            }System.out.println("");
        }
    }
}
