/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumarraylist2;
import java.util.ArrayList;
/**
 *
 * @author Yafig
 */
public class PraktikumArrayList2 {

    public static void main(String[] args) {
        
        ArrayList<Integer> deret = new ArrayList<Integer>();
        System.out.println("Panjang Deret Awal :");
        for (int i = 0; i < 10; i++) {
            deret.add(1*10);         
        }
        System.out.println("Panjang Deret = " + deret.size());
        System.out.println("Periksa Isi Deret = " + deret.isEmpty());
        System.out.println("Mencari Index Dari Suatu Nilai");
        System.out.println(deret.indexOf(60));
        System.out.println(deret.indexOf(70));
        System.out.println(deret.indexOf(80));
        System.out.println(deret.indexOf(90));
        System.out.println("Memerikas Keberadaan Suatu Nilai");
        System.out.println(deret.contains(60));
        System.out.println(deret.contains(70));
        System.out.println(deret.contains(80));
        System.out.println("Update Suatu Nilai DI Dalam ArrayList");
        deret.set(6, 600);
        deret.set(7, 700);
        deret.set(8, 800);
        System.out.println("Menghapus Nilai ArrayList");
        deret.remove(2);
        deret.remove(5);
        System.out.println("Menampilkan Nilai Setelah Di Hapus");
        for (int nilai : deret) {
            System.out.println(nilai);
        }
    }
}
