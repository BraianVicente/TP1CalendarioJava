/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.Date;

/**
 *
 * @author brahvic
 */
class Evento {

    private Date fecha;

    public Evento(int anio, int mes, int dia, int hora) {
        this.fecha = new Date(anio,mes,dia,hora,00);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Evento))
            return false;
        Evento evento = (Evento) obj ;
        return this.getDate().equals(evento.getDate());
    }

    private Object getDate() {
        return  this.fecha;
    }
    
}
