/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklarraymatriks3;

/**
 *
 * @author Yafig
 */
public class UKLArrayMatriks3 {

    public static void main(String[] args) {
        int[][] matriksA = { 
                { 6, 3, 2 },
                { 4, 2, 3 }
        };
        int[][] matriksB = { 
                { 1, 2 },
                { 2, 3 },
                { 3, 1 }
        };

        int barisA = matriksA.length;
        int kolomA = matriksA[0].length;
        int barisB = matriksB.length;
        int kolomB = matriksB[0].length;

        if (kolomA != barisB) {
            System.out.println("Jumlah kolom A tidak sama dengan baris B!!");
            return;
        }

        int[][] result = new int[barisA][kolomB];

        for (int i = 0; i < barisA; i++) {
            for (int f = 0; f < kolomB; f++) {
                int hasil = 0;
                for (int j = 0; j < kolomA; j++) {
                    hasil += matriksA[i][j] * matriksB[j][f];
                }
                result[i][f] = hasil;
            }
        }

        System.out.println("Hasil perkalian matriks A & B adalah : ");
        for (int i = 0; i < barisA; i++) {
            for (int l = 0; l < kolomB; l++) {
                System.out.print(result[i][l] + " ");
            }
            System.out.println();
        }
    }
}
