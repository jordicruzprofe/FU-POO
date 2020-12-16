
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
public class Venta {
    public static void main(String args[]) {
        Scanner leer=new Scanner(System.in);
        Coche ferrari=new Coche("Ferrari","Rojo",999000000.59,1);
        Coche bmw=new Coche("bmw","Negro",899000000.58,2);
        Coche tesla=new Coche("tesla","Gris espacial",999999999.99,3);
        
        System.out.println("Ingrese la información del cliente:\n");
        System.out.println("Ingrese el nombre completo del cliente");
        String nombre=leer.nextLine();
        System.out.println("Deme el DNI del cliente");
        int dni=leer.nextInt();
        System.out.println("Deme el telefono del cliente");
        int telefono=leer.nextInt();
        Cliente cliente=new Cliente(dni, telefono, nombre);
        System.out.println("Qué auto va a comprar? \n 1-Ferrari \n 2-BMW \n 3-Tesla");
        switch(leer.nextInt()){
            case 1:
                cliente.coche=ferrari;
                break;
            case 2:
                cliente.coche=bmw;
                break;
            case 3:
                cliente.coche=tesla;
                
        }
        System.out.println(cliente);
    }
    
}
