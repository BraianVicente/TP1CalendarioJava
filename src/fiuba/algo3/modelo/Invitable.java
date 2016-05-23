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
public interface Invitable {

    public boolean existeEvento(int anio, int mes, int dia, int hora) ;
    
    public boolean agregarEvento(int anio, int mes, int dia, int hora) ;
    
    public boolean estaOcupado(int anio, int mes, int dia, int hora) ;
        
}
