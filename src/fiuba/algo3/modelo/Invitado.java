/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.Objects;

/**
 *
 * @author brahvic
 */
public abstract class Invitado {

    protected String nombre ;
    protected ContenedorDeEventos misEventos;

    public abstract void agregarEvento(String nombreEvento, int anio, int mes, int dia, int hora) ;

    public  boolean existeEvento(int anio, int mes, int dia, int hora) {
        return this.misEventos.existeEventoEnFecha(anio,mes,dia,hora);
    }
    
    public  boolean estaOcupado(int anio, int mes, int dia, int hora) {
        return this.existeEvento(anio, mes, dia, hora);
    }
    
    protected String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Invitado))
            return false;
        Invitado invitado = (Invitado) obj ;
        return this.getNombre().equals(invitado.getNombre());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    
}
