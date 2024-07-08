/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class PraktikumArrayList {

    public static void main(String[] args) {
        
        ArrayList friendlist = new ArrayList();
        Scanner iU = new Scanner(System.in);
        boolean lagi = true;

        int nilai1,nilai2,nilai3,pil2,pilihan1,pilihan2;
        int rata;
                

        do {
            System.out.println(" -------------------------------------------------- ");
            System.out.println("|              MENENTUKAN NILAI                    |");
            System.out.println(" -------------------------------------------------- ");
            System.out.print("Masukkan Nilai 1    : ");
            nilai1 = iU.nextInt();
            System.out.print("Masukkan Nilai 2    : ");
            nilai2 = iU.nextInt();
            System.out.print("Masukkan Nilai 3    : ");
            nilai3 = iU.nextInt();

            if (nilai1 >=10 && nilai1 <= 99) {
                System.out.println("Nilai 1 Yang Kamu Masukkan Adalah : Nilai Puluhan");
            } else if (nilai1 >= 100 && nilai1 <= 999) {
                System.out.println("Nilai 1 Yang Kamu Masukkan Adalah : Nilai Ratusan");
            } else if (nilai1 >= 1000 && nilai1 <= 9999) {
                System.out.println("Nilai 1 Yang Kamu Masukkan Adalah : Nilai Ribuan");
            }
            
            if (nilai2 >=10 && nilai2 <= 99) {
                System.out.println("Nilai 2 Yang Kamu Masukkan Adalah : Nilai Puluhan");
            } else if (nilai2 >= 100 && nilai2 <= 999) {
                System.out.println("Nilai 2 Yang Kamu Masukkan Adalah : Nilai Ratusan");
            } else if (nilai2 >= 1000 && nilai2 <= 9999) {
                System.out.println("Nilai 2 Yang Kamu Masukkan Adalah : Nilai Ribuan");
            }
            
            if (nilai3 >=10 && nilai3 <= 99) {
                System.out.println("Nilai 3 Yang Kamu Masukkan Adalah : Nilai Puluhan");
            } else if (nilai3 >= 100 && nilai3 <= 999) {
                System.out.println("Nilai 3 Yang Kamu Masukkan Adalah : Nilai Ratusan");
            } else if (nilai3 >= 1000 && nilai3 <= 9999) {
                System.out.println("Nilai 3 Yang Kamu Masukkan Adalah : Nilai Ribuan");
            } 
            
            rata = (nilai1+nilai2+nilai3) / 3;
                System.out.println("Dirata-Rata Akan Menjadi Nilai    : " + rata);
            
            if (rata >= 10 && rata <= 99) {
                System.out.println("Rata-Ratanya Menjadi              : Nilai Puluhan");
            } else if (rata >= 100 && rata <= 999) {
                System.out.println("Rata-Ratanya Menjadi              : Nilai Ratusan");
            } else if (rata >= 1000 && rata <= 9999) {
                System.out.println("Rata-Ratanya Menjadi              : Nilai Ribuan");
            }
            
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Ingin Melihat ingin Mengulanginya Lagi ? \nMohon Masukkan Angka 1 Atau 2 \n1. Iya\n2. Tidak  : ");
        pil2 = iU.nextInt();
            
        if (pil2 == 1) {
            lagi = true;
        }else if (pil2 == 2) {
            lagi = false;
        }
            
        }while (lagi == true);
        }    
    }
