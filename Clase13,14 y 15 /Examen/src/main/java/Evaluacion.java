
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
public class Evaluacion {
    public static void main(String args[]) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Deme el titulo del examen");
        String titulo=leer.nextLine();
        System.out.println("Deme el nombre de la materia");
        Examen examen=new Examen(titulo,leer.nextLine());
        examen.agregarPreguntas();
        System.out.println("------------------------------------------------");
        System.out.println(examen.imprimirExamen());
    }
    
}
