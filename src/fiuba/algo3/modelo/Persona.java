/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brahvic
 */
public class Persona implements Invitable {

    private String nombre ;
    private ContenedorDeEventos misEventos;
            
    public Persona(String nombre) {
        this.nombre = nombre ;
        this.misEventos = new ContenedorDeEventos();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Persona))
            return false;
        Persona persona = (Persona) obj ;
        return this.getNombre().equals(persona.getNombre());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean existeEvento(int anio, int mes, int dia, int hora) {
        return this.misEventos.existeEvento(anio,mes,dia,hora);
    }

    @Override
    public void agregarEvento(String nombreEvento, int anio, int mes, int dia, int hora)  {
        if (this.estaOcupado(anio,mes,dia,hora)){          
        } else {
            this.misEventos.agregarEvento(anio,mes,dia,hora);
        }
    }

    @Override
    public boolean estaOcupado(int anio, int mes, int dia, int hora) {
        return this.existeEvento(anio, mes, dia, hora);
    }

    private String getNombre() {
        return this.nombre;
    }

}
