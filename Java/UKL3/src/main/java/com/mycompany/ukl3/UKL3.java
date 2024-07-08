/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3;

/**
 *
 * @author Yafig
 */
public class UKL3 {

    public static void main(String[] args) {
        int AP = 5;
        
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(AP + "\t");
                AP += 3;
                
            }
            System.out.println();
        }
        
        
    }
}
