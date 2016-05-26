package fiuba.algo3.modelo;

import java.util.List;

public class Calendario {

    private  ContenedorDePersonas agendaPersonas;
    private  ContenedorDeRecursos agendaRecursos;

    public Calendario (){
        this.agendaPersonas = new ContenedorDePersonas() ;
        this.agendaRecursos = new ContenedorDeRecursos() ;
    }

    public void agregarPersona(String nombre) {
       this.agendaPersonas.agregar(nombre);
    }

    public void agregarRecurso(String nombre) {
        this.agendaRecursos.agregar(nombre) ;
    }

    public void agregarEvento(String nombre, List<String> invitados, int anio, int mes, int dia, int hora) {
        this.agendaPersonas.agregarEvento(nombre,invitados,anio,mes,dia,hora);
        this.agendaRecursos.agregarEvento(nombre,invitados,anio,mes,dia,hora);
    }

    public void agregarEventoSemanal(String nombre, int repeticion, List<String> invitados, int anio, int mes, int dia, int hora) {
        while(repeticion > 0){
            this.agregarEvento(nombre,invitados,anio,mes,dia + (7*(repeticion-1)),hora);
            repeticion = repeticion - 1 ;
        }
    }

    public boolean existePersona(String nombre) {
        return this.agendaPersonas.existe(nombre) ;
    }

    public boolean existeRecurso(String nombre) {
        return this.agendaRecursos.existe(nombre) ;
    }

    public boolean estaOcupado(String nombre, int anio, int mes, int dia, int hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.    }
    }
}
