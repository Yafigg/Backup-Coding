/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hitungratarata;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
public class StrukturKontrolPercabangan {

    public static void main(String[] args) {
        Scanner iU = new Scanner(System.in);
        boolean lagi = true;
        
        int pil2;
        int pilihan1;
        int pilihan2;
        
        
        System.out.println("----- Rata-Rata Nilai -----");

        // Input nilai dari pengguna
        System.out.print("Masukkan nilai : ");
        int lok = iU.nextInt();
        
        if (lok>=10 || lok <= 99) {
            System.out.println("Nilai Puluhan");
        } else {
            System.out.println("Hai");
        }
        
        System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Ingin Melihat Informasi Lainnya ? \n1. Iya\n2. Tidak  : ");
            pil2 = iU.nextInt();
            
            if (pil2 == 1) {
                lagi = true;
            }else if (pil2 == 2) {
                lagi = false;
            }while (lagi == true);
            
        }
        }    