package com.mycompany.bangunruang;

public class Balok extends Bangunruang {
    double p;
    double l;
    double t;
    
    double volume() {
        double volume = p * l * t;
        return volume;
    }
    
    double luasPermukaan() {
        double luasPermukaan = 2 * (p * l + p * t + l * t);
        return luasPermukaan;
    }
}
