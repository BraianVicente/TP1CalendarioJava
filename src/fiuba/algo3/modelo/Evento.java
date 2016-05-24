/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.Calendar;
import java.util.Date;

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
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Evento))
            return false;
        Evento evento = (Evento) obj ;
        return this.getDate().equals(evento.getDate());
    }

    private Date getDate() {
        return  this.fecha;
    }
    
    private Evento sumarDias(int dias){
        Calendar cal = Calendar.getInstance();
        cal.set(fecha.getYear(), fecha.getMonth(), fecha.getDay(), fecha.getHours(), 00);
        
        cal.add(Calendar.DAY_OF_MONTH, fecha.getDay()+dias );
        Date newTime = cal.getTime();
        return new Evento(newTime.getYear(),newTime.getMonth(),newTime.getDay(),newTime.getHours());
        
    
    }
    
}
