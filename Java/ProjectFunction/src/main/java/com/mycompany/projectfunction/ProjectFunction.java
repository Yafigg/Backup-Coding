/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectfunction;

/**
 *
 * @author Yafig
 */
public class ProjectFunction {
    
    public static void nama(String namaValue) {
        System.out.println("Nama Saya          : " + namaValue);
    }
    
    public void belakang (String namaBel){
        System.out.println("Nama Belakang Saya : " + namaBel);
    }
    
    public static void sekolah(String namsek){
        System.out.println("Saya Bersekolah Di : " + namsek);
    }
    
    public static void main(String[] args) {
        ProjectFunction object = new ProjectFunction();
        
        String namaku  = "Cipto";
        String namabel = "Adiwongso";
        String namlah  = "SMK Telkom Malang";
                
        nama(namaku);
        object.belakang(namabel);
        sekolah(namlah);
    }
}
