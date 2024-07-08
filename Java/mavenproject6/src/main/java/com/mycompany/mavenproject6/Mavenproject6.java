/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;
import java.util.Scanner;

/**
 *
 * @author Yafig
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        Scanner Rapot = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai : ");
        int nilai = Rapot.nextInt();
        
        if(nilai>100) {
            System.out.print("NILAI TIDAK BOLEH LEBIH BESAR DARI 100!!!");
        }
        if (nilai<0) {
            System.out.print("NILAI TIDAK BOLEH LEBIH KECIL DARI 0!!!");
        }
        else if(nilai>73){
            System.out.print("SESUAI HARAPAN!!!");
        }
        else{
            System.out.print("TIDAK SESUAI HARAPAN!!!");
        }
    }
}
