/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
public class Cliente {
    public int dni,telefono;
    public String  nombre;
    public Coche coche;

    public Cliente() {
    }

    public Cliente(int dni, int telefono, String nombre, Coche coche) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
        this.coche = coche;
    }

    public Cliente(int dni, int telefono, String nombre) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", telefono=" + telefono + ", nombre=" + nombre + ", coche=" + coche + '}';
    }

}
