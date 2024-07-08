/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist;
import java.util.ArrayList;

/**
 *
 * @author Yafig
 */
public class TestArrayList {

    public static void main(String[] args) {

        // membuat objek array list
        ArrayList SkillPemain = new ArrayList();

        // Mengisi Pemain Dengan Skill
        SkillPemain.add("Skill Drible");
        SkillPemain.add("Speed");
        SkillPemain.add("Power Shooting");
        SkillPemain.add("Aselerasi");
        SkillPemain.add(true);

        // menghapus power shooting dari skill pemain
        SkillPemain.remove("Power Shooting");

        // Menampilkan isi kantong ajaib
        System.out.println(SkillPemain);

        // menampilkan banyak isi kantong ajaib
        System.out.println("Neymar Mempunyai SKil Yaitu "+ SkillPemain.size() +" item");
    }
}
