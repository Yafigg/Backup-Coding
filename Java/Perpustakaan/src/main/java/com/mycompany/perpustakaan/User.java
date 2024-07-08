/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author Yafig
 */
public class User {
    private String namaLengkap;
    private String noTelp;
    private String alamat;

    public User(String namaLengkap, String noTelp, String alamat) {
        this.namaLengkap = namaLengkap;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getAlamat() {
        return alamat;
    }
}

