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

public class Buku {
    private String judul;
    private String kategori;
    private int tahunTerbit;
    private String penerbit;
    private int lamaPinjam;

    public Buku(String judul, String kategori, int tahunTerbit, String penerbit, int lamaPinjam) {
        this.judul = judul;
        this.kategori = kategori;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.lamaPinjam = lamaPinjam;
    }

    public String getJudul() {
        return judul;
    }

    public String getKategori() {
        return kategori;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public static ArrayList<Buku> daftarBuku() {
        ArrayList<Buku> books = new ArrayList<>();
        books.add(new Buku("Harry Potter", "Fantasi", 1997, "Bloomsbury", 14));
        books.add(new Buku("To Kill a Mockingbird", "Fiksi Klasik", 1960, "J. B. Lippincott & Co.", 7));
        books.add(new Buku("The Great Gatsby", "Fiksi", 1925, "Charles Scribner's Sons", 10));
        books.add(new Buku("1984", "Fiksi Ilmiah", 1949, "Secker & Warburg", 14));
        books.add(new Buku("The Catcher in the Rye", "Fiksi", 1951, "Little, Brown and Company", 7));
        books.add(new Buku("To Kill a Mockingbird", "Fiksi Klasik", 1960, "J. B. Lippincott & Co.", 7));
        books.add(new Buku("The Hobbit", "Fantasi", 1937, "Allen & Unwin", 14));
        books.add(new Buku("Pride and Prejudice", "Fiksi Klasik", 1813, "T. Egerton, Whitehall", 7));
        books.add(new Buku("Animal Farm", "Fiksi", 1945, "Secker & Warburg", 10));
        books.add(new Buku("The Alchemist", "Fiksi", 1988, "HarperCollins", 14));
        return books;
    }
}

