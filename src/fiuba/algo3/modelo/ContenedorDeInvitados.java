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
public class ContenedorDeInvitados {

    private ArrayList<Invitado> miAgenda ;

    public ContenedorDeInvitados(){
        this.miAgenda = new ArrayList<Invitado>() {} ;
    }

    public boolean existe(String nombre) {
       return this.miAgenda.contains(new Invitado(nombre));
    }

    public void agregarEvento(String nombre, List<String> invitados, int anio, int mes, int dia, int hora) {
        for (String nombreInvitado : invitados) {
            if (this.miAgenda.contains(new Invitado(nombreInvitado))){
                Invitado invitado;
                invitado = this.miAgenda.get(this.miAgenda.indexOf(new Invitado(nombreInvitado)));
                invitado.agregarEvento(nombre, anio, mes, dia, hora);
            }
        }
    }

    public boolean estaOcupado(String nombre,int anio,int mes,int dia, int hora){
        if (this.existe(nombre)){
            Invitado invitado = this.miAgenda.get(this.miAgenda.indexOf(new Invitado(nombre)));
            return invitado.existeEvento(anio, mes, dia, hora);
        }
        return false;
    }

    public void agregarEvento(int repeticion, String nombre, List<String> invitados, int anio, int mes, int dia, int hora) {
        while (repeticion > 0){
            this.agregarEvento(nombre, invitados, anio, mes, dia + ((repeticion-1)*7), hora);
            repeticion--;
        }
    }

    public void agregarPersona(String nombre) {
       this.miAgenda.add(new Persona(nombre)) ;
    }

    public void agregarRecurso(String nombre) {
       this.miAgenda.add(new Recurso(nombre)) ;
    }
    
    public boolean existeRecurso(String nombre) {
        if (this.miAgenda.contains(new Recurso(nombre)) ){
            Invitado invitado = this.miAgenda.get(this.miAgenda.indexOf(new Invitado(nombre)));
            return (invitado instanceof Recurso) ;
        }
        return false ;
    }
    
    
    public boolean existePersona(String nombre) {
        if (this.miAgenda.contains(new Persona(nombre)) ){
            Invitado invitado = this.miAgenda.get(this.miAgenda.indexOf(new Invitado(nombre)));
            return (invitado instanceof Persona) ;
        }
        return false ;
    }
    
}
