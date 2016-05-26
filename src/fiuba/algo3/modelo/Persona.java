/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

/**
 *
 * @author brahvic
 */
public class Persona extends Invitado {

    public Persona(String nombre) {
        super(nombre) ;
    }

    @Override
    public void agregarEvento(String nombreEvento, int anio, int mes, int dia, int hora)  {
        if (!this.estaOcupado(anio, mes, dia, hora)){
            this.misEventos.agregarEvento(nombreEvento,anio,mes,dia,hora);
        }
    }

}
