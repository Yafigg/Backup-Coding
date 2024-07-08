package com.mycompany.bangunruang;

public class LimasSegitiga extends Bangunruang {
    double la;
    double t;
    double tLimas; 
    
    double volume() {
        double volume = 1/3 * la * tLimas;
        return volume;
    }
    
    double luasPermukaan() {
        double luasPermukaan = 1/2 * la * t;
        return luasPermukaan;
    }
}
