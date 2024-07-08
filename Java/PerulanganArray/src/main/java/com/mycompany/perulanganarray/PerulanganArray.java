/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulanganarray;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Yafig
 */
public class PerulanganArray {

    public static void main(String[] args) {
        // membuat array daftar Negara
         ArrayList<String> friendlist = new ArrayList<String>();
        // membuat scanner
        Scanner scan = new Scanner(System.in);

        String nama;
        
        System.out.print("Masukkan nama yang ingin disimpan : ");
        int jumlahNama = scan.nextInt();
        scan.nextLine();
        // mengisi data ke array
        for( int i = 0; i < jumlahNama; i++ ){
            System.out.print("Masukkan Index Teman ke-" + (i+1) + ": ");
            nama = scan.nextLine();
            friendlist.add(nama);
        }

        System.out.println("-- Hasil Index Teman Yang Didapat --");

        // menampilkan semua isi array
        for (int i = 0; i < jumlahNama; i++) {
            System.out.println("Nama Index Ke-" + (i+1) + " : " + friendlist.get(i));
        }
    }
}
