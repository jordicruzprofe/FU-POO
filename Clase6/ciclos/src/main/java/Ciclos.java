
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
public class Ciclos {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Deme un número");
        int valor=leer.nextInt();
        
        //CICLO FOR 
        for(int i=0;i<=valor;i++)
            System.out.println(i);
        
        //CICLO WHILE 
       int i=0;
       while(i<=valor){
            System.out.println(i);
            i++;
       }
       
       i=0;
       do{
           System.out.println(i);
           i++;
       }while(i<=valor);
       
       
        
    }
    
}
