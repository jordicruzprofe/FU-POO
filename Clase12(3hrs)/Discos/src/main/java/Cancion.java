/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
public class Cancion {
    
    public int orden;
    public String titulo;
    public double duración;
    

    public Cancion() {
    }
    
    

    public Cancion(int orden, String titulo, double duración) {
        this.orden = orden;
        this.titulo = titulo;
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Cancion{" + "orden=" + orden + ", titulo=" + titulo + ", duraci\u00f3n=" + duración + '}';
    }

    
}
