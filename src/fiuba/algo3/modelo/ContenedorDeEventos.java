/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.ArrayList ;
/**
 *
 * @author brahvic
 */
public class ContenedorDeEventos {

    private ArrayList<Evento> misEventos ;

    public ContenedorDeEventos(){
        this.misEventos = new ArrayList();
    }
    
    public boolean existeEvento(int anio, int mes, int dia, int hora) {
        return this.misEventos.contains(new Evento(anio,mes,dia,hora));
    }

    public void agregarEvento(String nombreEvento, int anio, int mes, int dia, int hora) {
        if (existeEvento(anio,mes,dia,hora)){
            
        }else{
            this.misEventos.add(new Evento(nombreEvento,anio,mes,dia,hora));
        }
    }

    public void agregarEvento(int semanasRepeticion, String nombreEvento, int i0, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
