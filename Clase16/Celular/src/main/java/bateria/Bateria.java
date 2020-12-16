/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bateria;

/**
 *
 * @author desarrollo2dpw
 */
public class Bateria {
    private int porcentaje;
    
   
    public Bateria() {
        this.porcentaje = 100;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    private void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    public String toString() {
        return "Bateria{" + "porcentaje=" + porcentaje + '}';
    }
}
