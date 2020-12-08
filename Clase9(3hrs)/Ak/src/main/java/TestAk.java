/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
public class TestAk {
    public static void main(String args[]) {
        Ak cobre=new Ak(); // AL CREAR UN OBJETO SE LE LLAMA INSTANCIAR
        cobre.material="Cobre"; //Asignando valores a los atributos
        cobre.precio=200;
        System.out.println("El tipo de arma es de "+cobre.material);
        System.out.println("El arma tiene un precio de $"+cobre.precio);
        
    }
    
}
