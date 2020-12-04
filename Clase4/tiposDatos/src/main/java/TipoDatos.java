/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
//NOTA EL NOMBRE DEL ARCHIVO DEBE SER IGUAL QUE EL DE LA CLASE (tipoDatos.java-public class tipoDatos)
public class TipoDatos {
    public static void main(String args[]){
        
        int entero=10;
        float flotante=3.1416f;//SI SE QUIERE TRABAJAR CON FLOTANTES ES NECESARIO COLOCAR AL FINAL F 
        double flotante2=3.1416;//no es necesario la f como en el float 
        boolean booleano2=true;// NO se usa 0 y 1 
        char letra='a'; //DEBE DE IR ENTRE APOSTROFE 
        String palabra="Es un nuevo tipo de String"; //String es un nuevo tipo de "Dato"
        
        System.out.println(entero+flotante);
        System.out.println(palabra);
        
    }
    
}
