/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author desarrollo2dpw
 */
public class Programador extends Empleado {
    
    private double sueldo;

    public Programador(double sueldo, int id, String nombre, String paterno, String materno, String usuario, String contra) {
        super(id, nombre, paterno, materno, usuario, contra);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Programador{" + "sueldo=" + sueldo +" "+super.toString()+ '}';
    }
    
    
    
    
}
