/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum2;

/**
 *
 * @author Yafig
 */
public class Praktikum2 {

    public static void main(String[] args) {
        
        double luas,l,p;
        l=34.87;
        p=7.97;
        luas=l*p;
        System.out.println("Hasilnya adalah : " + luas);
        
        //Luas segitiga 
        double luasSegitiga,a,t;
        
        a = 21.5;
        t = 8.0;
        luasSegitiga = a*t/2;
        System.out.println("Hasilnya adalah = " + luasSegitiga );
        
        //luas Trapesium
        double luasTrapesium,h,k,b;
        
        h = 15.0;
        k = 5.0;
        b = 18.5;
        luasTrapesium = (k+b)*h/2;
        System.out.println("Hasilnya adalah = " + luasTrapesium);
        
        //Luas Lingkaran
        double luasLingkaran,pi,r;
        
        pi = 3.14;
        r = 14;
        luasLingkaran = pi*r*r;
        System.out.println("Hasilnya adalah = " + luasLingkaran);
        
        
        
                
    }
}
