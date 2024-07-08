package com.mycompany.bangunruang;

public class Tabung extends Bangunruang {
    double r;
    double t;
    
    double volume() {
        double volume = Math.PI * (r*r) * t;
        return volume;
    }
    
    double luasPermukaan() {
        double luasPermukaan = 2 * Math.PI * r * t + 2 * Math.PI;
        return luasPermukaan;
    }
}
