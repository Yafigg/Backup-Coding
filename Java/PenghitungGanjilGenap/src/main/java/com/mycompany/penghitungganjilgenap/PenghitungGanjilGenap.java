/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.penghitungganjilgenap;
import java.util.Scanner;
/**i
 *
 * @author Yafig
 */
public class PenghitungGanjilGenap {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ganap = true;
        String again;
        boolean yesno = true;
        String hasil;
        boolean lagi = true;

        int pil2;
        int pilihan;
    do {    
        System.out.println(" ---------------------------------------------- ");
        System.out.println("|           Penghitung Ganjil Genap            |");
        System.out.println(" ---------------------------------------------- ");
        
            int number;
            System.out.print(" Masukkan Nilai : ");
            number = scan.nextInt();
            scan.nextLine();
            
            if (number % 2 == 0) {
                System.out.println(" Nilai Yang Anda Masukkan Adalah Nilai Genap");
            } else {
                System.out.println(" Nilai Yang Anda Masukkan Adalah Nilai Ganjil");
            }
            System.out.println(" Terima Kasih !!!");            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Ingin Mengulanginya Lagi ? \n1. Iya\n2. Tidak  : ");
            pil2 = scan.nextInt();
            
            if (pil2 == 1) {
                lagi = true;
            }else if (pil2 == 2) {
                lagi = false;
            }
            
        }while (lagi == true);
        }    
}
