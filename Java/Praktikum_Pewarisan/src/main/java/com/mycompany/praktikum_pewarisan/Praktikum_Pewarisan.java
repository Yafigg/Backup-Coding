/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_pewarisan;

/**
 *
 * @author Yafig
 */
public class Praktikum_Pewarisan {

    public static void main(String[] args) {
       kedua D2 = new kedua ();
       D2.BacaSuper();
       D2.info();
       
       pablo S1 = new pablo();
       S1.terproteksi();
       S1.info();
    }
   
    }

class pablo {
    private int a = 10;
    protected void terproteksi(){
        System.out.println("Method Ini Diwariskan Pada Anak");
    } 
    public void info(){
        System.out.println("A = " + a);
        System.out.println("Dipanggil Pada = " + this.getClass().getName());
    }
}

class kedua extends pablo {
    private int b = 10;
    protected void BacaSuper() {
        System.out.println("B = " +b);
        terproteksi();
        info();
    }
}