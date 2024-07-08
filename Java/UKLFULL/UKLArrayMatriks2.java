/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklarraymatriks2;

/**
 *
 * @author Yafig
 */
public class UKLArrayMatriks2 {

    public static void main(String[] args) {
        int[][] matrixA = { 
                {-7, 5}, 
                {4, 8}      
            };
        int[][] matrixB = { 
                {1, 1},
                {-4, 9}     
            };
       
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        
        System.out.println("Hasil Nya Adalah : ");
        printMatriks(sumMatrix);
    }
    
    public static void printMatriks(int[][] matrix) {
        for (int[] baris : matrix) {
            for (int value : baris) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int baris = matrixA.length;
        int kolom = matrixA[0].length;
        int[][] result = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }
}