/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author brahvic
 */
public class ContenedorDePersonas {
    
    private ArrayList<Persona> misPersonas ;
    
    public ContenedorDePersonas(){
        this.misPersonas = new ArrayList<Persona>() {} ;
    }
    
    public void agregar(String nombre) {
       this.misPersonas.add(new Persona(nombre)) ;
    }

    public boolean existe(String nombre) {
       return this.misPersonas.contains(new Persona(nombre));
    }

    public void agregarEvento(String nombreEvento, ArrayList<String> invitados, int anio, int mes, int dia, int hora) {
        invitados.forEach(invitado -> {
            Persona persona;
            persona = this.get(invitado);
            persona.agregarEvento(nombreEvento,anio,mes,dia,hora) ;
        });
    }
    
    public Persona get(String nombre){
        return (Persona) this.misPersonas.get(this.misPersonas.indexOf(new Persona(nombre)));
    }
    
}
