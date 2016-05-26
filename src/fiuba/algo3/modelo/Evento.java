/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author brahvic
 */
public class Evento {

    private Date fecha;
    private String nombreEvento;

    public Evento(int anio, int mes, int dia, int hora) {
        this.fecha = new Date(anio,mes,dia,hora,00);
    }

    public Evento(String nombreEvento, int anio, int mes, int dia, int hora) {
        this.fecha = new Date(anio,mes,dia,hora,00);
        this.nombreEvento = nombreEvento ;
    }

    Evento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
        this.fecha = null ;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Evento))
            return false;
        Evento evento = (Evento) obj ;
        if((evento.getDate() != null) && (this.getDate() != null)){
            return this.getDate().equals(evento.getDate());
        }
        if((evento.getName() != null ) & (this.getName()!= null)){
            return this.getName().equals(evento.getName());
        } 
        return false ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.fecha);
        return hash;
    }

    private Date getDate() {
        return  this.fecha;
    }

    private String getName() {
        return this.nombreEvento;
    }
    
}
