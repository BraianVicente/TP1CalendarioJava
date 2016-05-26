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
public class Recurso extends Invitado {
    
    private String nombre ;
    private ContenedorDeEventos misEventos;
    
    public Recurso(String nombre){
        this.nombre = nombre ;
        this.misEventos = new ContenedorDeEventos();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Recurso))
            return false;
        Recurso recurso = (Recurso) obj ;
        return this.getNombre().equals(recurso.getNombre());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    
    @Override
    public boolean existeEvento(int anio, int mes, int dia, int hora) {
        return this.misEventos.existeEventoEnFecha(anio,mes,dia,hora);
    }

    @Override
    public void agregarEvento(String nombreEvento, int anio, int mes, int dia, int hora) {
        try {
            this.misEventos.agregarEvento(nombreEvento, anio, mes, dia, hora);
        } catch (SuperposicionEventoException e) {
            throw new RecursoOcupadoException() ;
        }
    }

    @Override
    public boolean estaOcupado(int anio, int mes, int dia, int hora) {
        return this.misEventos.existeEventoEnFecha(anio,mes,dia,hora);
    }

    private Object getNombre() {
        return this.nombre;
    }

}
