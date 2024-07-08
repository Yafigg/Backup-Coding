/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author Yafig
 */
import java.util.ArrayList;

public class Transaksi {
    private ArrayList<String> daftarTransaksi = new ArrayList<>();

    public void tambahTransaksi(String transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public void tampilkanTransaksi() {
        System.out.println("Daftar Transaksi:");
        for (String transaksi : daftarTransaksi) {
            System.out.println(transaksi);
        }
    }
}
