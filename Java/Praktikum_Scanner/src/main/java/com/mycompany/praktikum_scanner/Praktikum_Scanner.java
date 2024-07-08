/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum_scanner;
import java.util.Scanner; 

/**
 *
 * @author Yafig
 */
public class Praktikum_Scanner {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName, lastName;
        int bill,bill2;
        
        System.out.print("Enter userName : ");
        userName = myObj.nextLine();
        lastName = myObj.nextLine();
        
        System.out.print("My userName : " + userName);
        System.out.print("My lastName " + lastName);System.out.print("Masukkan bilangan 1 : ");
        bill=myObj.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        bill2=myObj.nextInt();
        
    }
}
