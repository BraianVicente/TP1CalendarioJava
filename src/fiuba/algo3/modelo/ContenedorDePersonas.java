/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    void agregarEvento(String nombre, List<String> invitados, int anio, int mes, int dia, int hora) {
        for (String nombrePersona : invitados) {
            if (this.misPersonas.contains(new Persona(nombrePersona))){
                Persona persona;
                persona =(Persona) this.misPersonas.get(this.misPersonas.indexOf(new Persona(nombrePersona)));
                persona.agregarEvento(nombre, anio, mes, dia, hora);
            }
        }
    }
    
}
