/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

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
        return this.misRecursos.contains(new Recurso(nombre));
    }

    public void agregarEvento(String nombre, List<String> invitados, int anio, int mes, int dia, int hora) {
        for (String nombreRecurso : invitados) {
            if (this.misRecursos.contains(new Recurso(nombreRecurso))){
                Recurso recurso;
                recurso = this.misRecursos.get(this.misRecursos.indexOf(new Recurso(nombreRecurso)));
                recurso.agregarEvento(nombre, anio, mes, dia, hora);
            }
        }
    }

    boolean estaOcupado(String nombre, int anio, int mes, int dia, int hora) {
        if (this.existe(nombre)){
            Recurso recurso = this.misRecursos.get(this.misRecursos.indexOf(new Recurso(nombre)));
            return recurso.estaOcupado(anio, mes, dia, hora);
        }
        return false;
     }

    void agregarEvento(int repeticion, String nombre, List<String> invitados, int anio, int mes, int dia, int hora) {
        while (repeticion > 0){
            this.agregarEvento(nombre, invitados, anio, mes, dia + ((repeticion-1)*7), hora);
            repeticion--;
        }
    }


}
