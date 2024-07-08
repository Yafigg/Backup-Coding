/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yafig
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data user
        System.out.print("Masukkan nama lengkap: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        String noTelp = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        // Membuat objek user
        User user = new User(nama, noTelp, alamat);

        // Menampilkan daftar buku
        System.out.println("Daftar Buku yang Tersedia:");
        ArrayList<Buku> daftarBuku = Buku.daftarBuku();
        for (int i = 0; i < daftarBuku.size(); i++) {
            Buku buku = daftarBuku.get(i);
            System.out.println((i + 1) + ". " + buku.getJudul() + " - " + buku.getKategori() + " (" + buku.getTahunTerbit() + ") - " + buku.getPenerbit() + " - Lama Pinjam: " + buku.getLamaPinjam() + " hari");
        }

        // Proses transaksi
        Transaksi transaksi = new Transaksi();
        System.out.print("Apakah Anda ingin melakukan transaksi? (ya/tidak): ");
        String jawaban = scanner.nextLine();
        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.print("Pilih nomor buku yang ingin Anda pinjam: ");
            int nomorBuku = scanner.nextInt();
            Buku bukuDipinjam = daftarBuku.get(nomorBuku - 1);
            transaksi.tambahTransaksi("Buku yang dipinjam: " + bukuDipinjam.getJudul() + " - Lama Pinjam: " + bukuDipinjam.getLamaPinjam() + " hari");
            System.out.println("Terima kasih, transaksi berhasil!");
        } else {
            System.out.println("Terima kasih telah mengunjungi perpustakaan kami.");
        }

        // Menampilkan daftar transaksi
        transaksi.tampilkanTransaksi();

        scanner.close();
    }
}


