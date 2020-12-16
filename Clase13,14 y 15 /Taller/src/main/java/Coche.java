/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
public class Coche {
    public String marca, color;
    public double precio;
    public int matricula;

    public Coche() {
    }

    public Coche(String marca, String color, double precio, int matricula) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", precio=" + precio + ", matricula=" + matricula + '}';
    }

    
    
    
   
}
