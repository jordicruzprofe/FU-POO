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
public class testEmpleados {
    
    public static void main(String args[]) {
        Programador jordi=new Programador(12000, 1, "Jordi", "Cruz", "Medrano", "yarito", "123");
        System.out.println(jordi);
        Pasante pasante=new Pasante(300, 5, 2, "Kevin", "Meza", "Gonzalez", "kev", "8855");
        System.out.println(pasante);
        
        if(pasante.isVigente())
            pasante.disminuirHrs();
        
        System.out.println(pasante);
            
    }
    
}
