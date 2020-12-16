/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celular;

import bateria.Bateria;

/**
 *
 * @author desarrollo2dpw
 */
public class Celular {
    
    public static void main(String args[]) {
        
        Bateria bateria=new Bateria();
        System.out.println(bateria.getPorcentaje());
        
    }
    
}
