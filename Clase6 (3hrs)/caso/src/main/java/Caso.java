
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
public class Caso {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Deme el primer número");
        int num1=leer.nextInt();
        System.out.println("Deme el segundo número");
        int num2=leer.nextInt();
        System.out.println("Deme una opción \n 1-Suma \n 2-Resta \n 3-Multiplicación \n 4-División");
        int opcion=leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("La suma es "+(num1+num2));
                break;
            case 2:
                System.out.println("La resta es "+(num1-num2));
                break;
            case 3:
                System.out.println("La multipliación es "+(num1*num2));
                break;
            case 4:
                System.out.println("La división es "+(num1/num2));
                break;
            default:
                System.out.println("No es una opción valida");
                break;
        }
        
    }
    
}
