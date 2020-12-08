
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
public class Disco {
    static int  numeroCancion;
    public String nombre, artista;
    public int anio;
    public ArrayList<Cancion> canciones;

    public Disco() {
    }

    public Disco(String nombre, String artista, int anio, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.artista = artista;
        this.anio = anio;
        this.canciones = canciones;
    }
    
    public String menu(){
        String menu="";
    
        for(Cancion cancion:canciones){
            menu+=""+cancion.orden+" - "+cancion.titulo+"\n";
        }
        return menu;
    }
    
    public String reproducirCancion(int numeroCancion){
        Disco.numeroCancion=numeroCancion;
        String respuesta="";
        for(Cancion cancion:canciones){
            if(cancion.orden==numeroCancion){
                respuesta= "Se esta reproduciendo la cancion: "+cancion.titulo+" con una duración de "+cancion.duración;
            }
        }
        return respuesta;
        
    }
    
    public int totalCanciones(){
        return canciones.size();
    }
    
    public String siguiente(){
        Disco.numeroCancion++;
        if(Disco.numeroCancion<=this.totalCanciones())
            return this.reproducirCancion(numeroCancion);  
        else{ 
            Disco.numeroCancion=1;
            return this.reproducirCancion(1);
        }
    }
    
    public String anterior(){
        Disco.numeroCancion--;
        if(Disco.numeroCancion>1)
            return this.reproducirCancion(numeroCancion);  
        else{ 
            Disco.numeroCancion=this.totalCanciones();
            return this.reproducirCancion(Disco.numeroCancion);
        }
    }

    @Override
    public String toString() {
        return "Disco{" + "nombre=" + nombre + ", artista=" + artista + ", anio=" + anio + ", canciones=" + canciones + '}';
    }

    
    
    
    
    
    
    
    
    
}
