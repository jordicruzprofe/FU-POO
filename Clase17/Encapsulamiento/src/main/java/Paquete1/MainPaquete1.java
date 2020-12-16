/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author desarrollo2dpw
 */
public class MainPaquete1 {
    public static void main(String arg[]){
        Publica publico=new Publica();
        publico.publico="Soy un atributo publico";
        System.out.println(publico.publico);
        publico.metodoPublico();
        
        Default defaultobj=new Default();
        defaultobj.atributoDefault="Soy un atributo default";
        defaultobj.metodoDeafult();
        
        Protected protegido=new Protected();
        protegido.protegido="Soy un atributo protegido";
        System.out.println(protegido.protegido);
        protegido.metodoProtegido();
        
        Privado privado=new Privado();
        //privado.privado="Soy un atributo privado";
        //System.out.println(privado.privado);
        //privado.metodoPrivado();
        
        
        privado.imprimePrivado();
    }
    
}
