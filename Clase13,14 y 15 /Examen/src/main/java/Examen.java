
import java.util.ArrayList;
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
public class Examen {
    
    public String nombre, materia;
    public ArrayList<Pregunta> preguntas;

    public Examen() {
    }

    public Examen(String nombre, String materia, ArrayList<Pregunta> preguntas) {
        this.nombre = nombre;
        this.materia = materia;
        this.preguntas = preguntas;
    }

    public Examen(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
        preguntas=new ArrayList();
    }
    
    public void agregarPreguntas(){
        boolean bandera=true;
        do{
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese la pregunta");
            Pregunta pregunta=new Pregunta(leer.nextLine());
            pregunta.agregarRespuestas();
            preguntas.add(pregunta);
            System.out.println("¿Desea agregar otra pregunta?\n 1-Si \n 2-No ");
            int opcion=leer.nextInt();
            bandera=opcion==1;
        }while(bandera);
        
    }
    
    public String imprimirExamen(){
        
        String examen="EXAMEN \n";
        int numero=1;
        examen+="Titulo: "+this.nombre+"\n";
        examen+="Materia: "+this.materia+"\n";
        
        for(Pregunta pregunta:this.preguntas){
            examen+=numero+"-"+pregunta.titulo+"\n";
            examen+=pregunta.imprimirRespuestas();
            
            numero++;
        }
        
        return examen;
    }

    @Override
    public String toString() {
        return "Examen{" + "nombre=" + nombre + ", materia=" + materia + ", preguntas=" + preguntas + '}';
    }
    
    
    
}
