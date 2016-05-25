/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.ArrayList;

/**
 *
 * @author brahvic
 */
public class ContenedorDeRecursos {

    private ArrayList<Recurso> misRecursos ;

    public ContenedorDeRecursos(){
        this.misRecursos = new ArrayList<Recurso>();
    }

    public void agregar(String nombre) {
        this.misRecursos.add(new Recurso(nombre));
    }

    public boolean existe(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
