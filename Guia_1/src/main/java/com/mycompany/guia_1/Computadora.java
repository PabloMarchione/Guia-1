
package com.mycompany.guia_1;


public class Computadora {
    
    private int ram;
    private double herz;
    private String marca;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getHerz() {
        return herz;
    }

    public void setHerz(double herz) {
        this.herz = herz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Computadora(int ram, double herz, String marca) {
        this.ram = ram;
        this.herz = herz;
        this.marca = marca;
    }
    
    
    
}
