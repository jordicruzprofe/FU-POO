/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author desarrollo2dpw
 */
public class Respuesta {
    
    public String titulo;
    public boolean correcta;

    public Respuesta() {
    }
    
    public Respuesta(String respuesta, boolean correcta) {
        this.titulo = respuesta;
        this.correcta = correcta;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "respuesta=" + titulo + ", correcta=" + correcta + '}';
    }
    
    
    
}
