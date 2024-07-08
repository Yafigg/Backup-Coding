package com.mycompany.bangunruang;

public class Bola extends Bangunruang {
    int r;
    
    double volume() {
        double volume = 4/3 * Math.PI * r * r * r;
        return volume;
    }
    
    @Override
    double luasPermukaan(){
        double luas = 4 * Math.PI * r;
        return luas;
    }
}
