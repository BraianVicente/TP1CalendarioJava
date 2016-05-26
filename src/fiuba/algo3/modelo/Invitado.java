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
public abstract class Invitado {

    public abstract boolean existeEvento(int anio, int mes, int dia, int hora) ;
    
    public abstract void agregarEvento(String nombreEvento, int anio, int mes, int dia, int hora) ;
    
    public abstract boolean estaOcupado(int anio, int mes, int dia, int hora) ;
        
}
