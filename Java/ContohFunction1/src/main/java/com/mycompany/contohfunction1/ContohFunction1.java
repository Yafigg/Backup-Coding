/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contohfunction1;
import java.util.Scanner;

/**
 *
 * @author Yafig
 */


public class ContohFunction1 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        String daftarOperator = "1. Mengoperasikan Modulus"
                + "\n2. Luas Persegi"
                + "\n3. Volume Kubus"
                + "\n4. Luas Lingkaran"
                + "\n5. Volume Tabung";
        
        System.out.println(daftarOperator);
        System.out.print("Pilih Daftar Operasi Yang Sudah Diberikan Di Atas : ");
        daftarOperasi(scan.nextInt());
    }
    
    public static void daftarOperasi(int pilih) {
        switch (pilih) {
            case 1:
                modulus();
                break;
            case 2:
                System.out.print("Masukkan Nilai Sisi : ");
                luasPersegi(scan.nextDouble());
                break;
            case 3:
                System.out.print("Masukkan Nilai Rusuk : ");
                volumeKubus(scan.nextDouble());
                break;
            case 4:
                System.out.print("Masukkan Nilai Jari-Jari : ");
                luasLingkaran(scan.nextDouble());
                break;
            case 5:
                System.out.print("Masukkan Nilai Jari-Jari : ");
                double jari = scan.nextDouble();
                System.out.print("Masukkan Nilai Tinggi : ");
                double tinggi = scan.nextDouble();
                volumeTabung(jari, tinggi);
                break;
            default:
                System.out.println("TELAH TERJADI KESALAHAN MEMILIH, MOHON MASUKKAN PILIHAN DENGAN BENAR !!!");
        }
    } 
    
    public static void salam() {
        System.out.println("Selamat Pagi, Assalamualaikum Wr. Wb, Om Swastiastu Namo Buddhaya"
                + ", salam kebajikan");
    }
    
    public static void hitung() {
        double hasil = 11.0/2.0;
        System.out.println("Hasilnya Adalah = " + hasil);
    }
    
    public static double Luas_Segitiga(double alas, double tinggi) {
        double hasil = alas / 2 * tinggi;
        
        return hasil;
    }
    
    public static void modulus() {
        System.out.print("Masukkan Nilai Operand 1 : ");
        int operand1 = scan.nextInt();
        System.out.print("Masukkan Nilai Operand 2 : ");
        int operand2 = scan.nextInt();
        int hasil = operand1 % operand2;
        
        System.out.println("Hasil Dari Modulus Adalah = " + hasil + ", Cara Menghitungnya Adalah Sebagai Berikut = " + operand1 + " % " + operand2 +" = " + hasil);
    }
    
    public static void luasPersegi(double sisi){
        double hasil = sisi*sisi;
        System.out.println("Hasil Dari Luas Persegi = " + hasil + "Cara Menghitungnya Adalah Sebagai Berikut = " + sisi + " * " + sisi + " = " + hasil);
        
        
    }
    public static void volumeKubus(double rusuk) {
        double hasil = rusuk * rusuk * rusuk;
        
        System.out.println("Hasil Dari Volume Kubus Adalah = " + hasil + "Cara Menghitungnya Adalah Sebagai Berikut = " + rusuk + " * " + rusuk + " * " + rusuk + " = " + hasil);
    }
    
    public static void luasLingkaran(double jari) {
        double pi = Math.PI;
        double hasil = pi * jari * jari;
        
        System.out.println("Hasil Dari Luas Lingkaran Adalah = " + hasil + "Cara Menghitungnya Adalah Sebagai Berikut" + pi + " * " + jari + " * " + jari + " = " + hasil);
    }
    
    public static void volumeTabung(double jari, double tinggi) {
        double pi = Math.PI;
        double hasil = pi * jari * jari * tinggi;
        
        System.out.print("Hasil Dari Volume Tabung Adalah = " + hasil + ", Cara Menghitungnya Adalah Sebagai Berikut " + pi + " * " + jari + " * " + jari + " * " + tinggi + " = " + hasil);
    }
    
}


