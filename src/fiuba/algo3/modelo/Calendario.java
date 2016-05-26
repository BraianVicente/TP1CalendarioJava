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
        this.agendaPersonas.agregarEvento(repeticion,nombre,invitados,anio,mes,dia,hora);
        this.agendaRecursos.agregarEvento(repeticion,nombre,invitados,anio,mes,dia,hora);
    }

    public boolean existePersona(String nombre) {
        return this.agendaPersonas.existe(nombre) ;
    }

    public boolean existeRecurso(String nombre) {
        return this.agendaRecursos.existe(nombre) ;
    }

    public boolean estaOcupado(String nombre, int anio, int mes, int dia, int hora) {
        if (this.existePersona(nombre)){
            return this.agendaPersonas.estaOcupado(nombre, anio, mes, dia, hora);
        }
        if (this.existeRecurso(nombre)){
            return this.agendaRecursos.estaOcupado(nombre, anio, mes, dia, hora);
        }
        return false ;
    }
}
