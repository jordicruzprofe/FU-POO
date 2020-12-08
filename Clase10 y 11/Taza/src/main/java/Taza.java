/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
public class Taza {
    public String color, modelo,material;
    public double precio;
    public char tamanio;

    public Taza() {
    }

    public Taza(String color, String modelo, String material, double precio, char tamanio) {
        this.color = color;
        this.modelo = modelo;
        this.material = material;
        this.precio = precio;
        this.tamanio = tamanio;
    }
    
    

    @Override
    public String toString() {
        return "Taza{" + "color=" + color + ", modelo=" + modelo + ", material=" + material + ", precio=" + precio + ", tamanio=" + tamanio + '}';
    }
    
}
