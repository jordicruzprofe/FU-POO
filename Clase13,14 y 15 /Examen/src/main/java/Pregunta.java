
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
public class Pregunta {
    
    public String titulo;
    public ArrayList<Respuesta> respuestas;

    public Pregunta() {
    }

    public Pregunta(String pregunta, ArrayList<Respuesta> respuestas) {
        this.titulo = pregunta;
        this.respuestas = respuestas;
    }
    
    //CONSTRUCTOR SIN PREGUNTAS (POLIFORMISMO) 
    public Pregunta( String pregunta) {
        this.titulo = pregunta;
        respuestas=new ArrayList();
    }
    
    
    public void agregarRespuestas(){
        boolean bandera=true;
        do{ 
            
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese la respuesta");
            String titu=leer.nextLine();
            System.out.println("¿Es la respuesta correcta? \n 1-Si \n 2-No");
            int opcion=leer.nextInt();
            boolean correcta=opcion==1;

            Respuesta respuesta=new Respuesta(titu,correcta);

           respuestas.add(respuesta);
           
            System.out.println("¿Desea agregar otra respuesta?\n 1-Si \n 2-No ");
            opcion=leer.nextInt();
            bandera=opcion==1;
            
        }while(bandera);
    }
    
    public String imprimirRespuestas(){
        String pregunta = "";
        int contador=1;
        for(Respuesta respuesta:this.respuestas){
            pregunta+="\t"+contador+")"+respuesta.titulo+"\n";
            contador++;
        }
        return pregunta;
    }
    
    @Override
    public String toString() {
        return "Pregunta{" + "titulo=" + titulo + ", respuestas=" + respuestas + '}';
    }
    
    
  
}
