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
public class Pasante extends Empleado {
    private int totalHrs,hrsxDia;

    public Pasante(int totalHrs, int hrsxDia, int id, String nombre, String paterno, String materno, String usuario, String contra) {
        super(id, nombre, paterno, materno, usuario, contra);
        this.totalHrs = totalHrs;
        this.hrsxDia = hrsxDia;
    }

    public int getTotalHrs() {
        return totalHrs;
    }

    public void setTotalHrs(int totalHrs) {
        this.totalHrs = totalHrs;
    }

    public int getHrsxDia() {
        return hrsxDia;
    }

    public void setHrsxDia(int hrsxDia) {
        this.hrsxDia = hrsxDia;
    }
    
    public boolean isVigente(){
        return totalHrs>0;
    }
    
    public void disminuirHrs(){
        this.totalHrs-=this.hrsxDia;   
    }
    
    @Override
    public String toString() {
        return "Pasante{" + "totalHrs=" + totalHrs + ", hrsxDia=" + hrsxDia +" "+super.toString()+ '}';
    }
    
}
