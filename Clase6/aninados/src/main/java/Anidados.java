
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
public class Anidados {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Deme su calificación");
        double calificacion=leer.nextDouble();
        
        if(calificacion==10)
            System.out.println("Excelente");
        else if(calificacion>9 && calificacion<10)
            System.out.println("Muy bien");
        else if(calificacion>8 && calificacion<9)
            System.out.println("Bien");
        else if(calificacion>7 && calificacion<8)
            System.out.println("Regular");
        else if(calificacion<=6)
            System.out.println("Reprobado");
        else 
            System.out.println("Es un valor invalido");
    }
    
}
