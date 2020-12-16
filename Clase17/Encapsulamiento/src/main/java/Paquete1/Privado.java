/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author desarrollo2dpw
 */
public class Privado {
    private String privado;
    
    private void metodoPrivado(){
        System.out.println("Soy un metodo privado");
    }
    
    public void imprimePrivado(){
        this.privado="Soy un atributo privado no puedes acceder a mi solo con este metodo";
        System.out.println(this.privado);
        this.metodoPrivado();
    }
}
