
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
public class Control {
    public static void main(String args[]){
        Scanner leer=new Scanner(System.in);
        System.out.println("Deme un número");
        int numero=leer.nextInt();
        if(numero==0)
            System.out.println("El número es 0 ni es positivo ni negativo");
        
        if(numero>0)
            System.out.println("El número es positivo");
        else 
            System.out.println("El número es negativo");
        
    }
    
}
