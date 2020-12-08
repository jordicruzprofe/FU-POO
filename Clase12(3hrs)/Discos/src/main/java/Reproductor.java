
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
public class Reproductor {
    public static void main(String args[]) {
        Scanner leer=new Scanner(System.in);
        ArrayList<Cancion> canciones = new ArrayList();
        Cancion cancion1=new Cancion(1,"Malamente",2.30);
        canciones.add(cancion1);
        Cancion cancion2=new Cancion(2,"Qué no salga la luna",4.30);
        canciones.add(cancion2);
        Cancion cancion3=new Cancion(3,"Pienso en tu mirá",3.14);
        canciones.add(cancion3);
        Cancion cancion4=new Cancion(4,"De aquí no sales",2.25);
        canciones.add(cancion4);
        Cancion cancion5=new Cancion(5,"Reniego",3.28);
        canciones.add(cancion5);
        Cancion cancion6=new Cancion(6,"Preso",0.41);
        canciones.add(cancion6);
        Cancion cancion7=new Cancion(7,"Bagdad",3.03);
        canciones.add(cancion7);
        Cancion cancion8=new Cancion(8,"Di mi nombre",2.42);
        canciones.add(cancion8);
        Cancion cancion9=new Cancion(9,"Nana",3.17);
        canciones.add(cancion9);
        Cancion cancion10=new Cancion(10,"Maldición",2.55);
        canciones.add(cancion10);
        Cancion cancion11=new Cancion(11,"A ningún hombre",1.34);
        canciones.add(cancion11);
        
        
       
        Disco malquerer=new Disco("El mal querer", "Rosalia",2018,canciones);
        System.out.println("El disco que tenemos es el:"+malquerer.nombre);
        
        System.out.println(malquerer.menu());
        System.out.println("Elija la canción que quiere reproducir ");
        int numeroCancion=leer.nextInt();
        
        System.out.println(malquerer.reproducirCancion(numeroCancion));
        int opcion=1;
        do{
            System.out.println("Desea:\n  1-Pasar a la siguiente\n 2-Regresar a la anterior\n 3-Elegir canción \n 4-Salir");
            opcion=leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println(malquerer.siguiente());
                    break;
                case 2:
                    System.out.println(malquerer.anterior());
                    break;
                case 3:
                    System.out.println(malquerer.menu());
                    System.out.println("Elija la canción que quiere reproducir ");
                    numeroCancion=leer.nextInt();
                    System.out.println(malquerer.reproducirCancion(numeroCancion));
                    break;
            }
        }while(opcion<4);
        
        
        
       
    }
}
