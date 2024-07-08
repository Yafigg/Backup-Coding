/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_scanner_ltrapesium;
import java.util.Scanner; 

/**
 *
 * @author Yafig
 */
public class Praktikum_Scanner_LTrapesium {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int phi; 
        int r, hasil;
        phi = 3.14;
        
        System.out.print("MASUKAN Nilai R : ");
        r = input.nextInt();
        hasil = phi * r * r;
        System.out.println("HASIL : " + hasil);
    }
}
