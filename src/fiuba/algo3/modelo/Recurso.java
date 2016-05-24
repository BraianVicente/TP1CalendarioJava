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
public class Recurso implements Invitable {
    
    private String nombre ;
    
    public Recurso(String nombre){
            this.nombre = nombre ;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Recurso))
            return false;
        Recurso recurso = (Recurso) obj ;
        return this.getNombre().equals(recurso.getNombre());
    }

    
    @Override
    public boolean existeEvento(int anio, int mes, int dia, int hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarEvento(String nombreEvento, int anio, int mes, int dia, int hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estaOcupado(int anio, int mes, int dia, int hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getNombre() {
        return this.nombre;
    }

}
