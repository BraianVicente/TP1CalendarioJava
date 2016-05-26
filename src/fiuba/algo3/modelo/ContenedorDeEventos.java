/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.ArrayList ;
import fiuba.algo3.modelo.SuperposicionEventoException ;
/**
 *
 * @author brahvic
 */
public class ContenedorDeEventos {

    private ArrayList<Evento> misEventos ;

    public ContenedorDeEventos(){
        this.misEventos = new ArrayList();
    }

    public boolean existeEventoEnFecha(int anio, int mes, int dia, int hora) {
        return this.misEventos.contains(new Evento(anio,mes,dia,hora));
    }

    public void agregarEvento(String nombreEvento, int anio, int mes, int dia, int hora) throws SuperposicionEventoException {
        if (existeEventoEnFecha(anio,mes,dia,hora)){
            throw new SuperposicionEventoException() ;
        }else{
            this.misEventos.add(new Evento(nombreEvento,anio,mes,dia,hora));
        }
    }

    public void agregarEvento(int semanasRepeticion, String nombreEvento, int anio, int mes, int dia, int hora) throws SuperposicionEventoException {
        while (semanasRepeticion>0){

            this.agregarEvento(nombreEvento, anio, mes, dia+(7*(semanasRepeticion-1)), hora);
            semanasRepeticion = semanasRepeticion-1;
        }

    }


}
