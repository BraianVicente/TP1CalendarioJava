package fiuba.algo3.modelo;

import java.util.List;

public class Calendario {

    private final ContenedorDePersonas agendaPersonas;
    private final ContenedorDeRecursos agendaRecursos;
    private final ContenedorDeEventos agendaEventos;

    public Calendario (){
        this.agendaPersonas = new ContenedorDePersonas() ;
        this.agendaRecursos = new ContenedorDeRecursos() ;
        this.agendaEventos = new ContenedorDeEventos() ;
    }

    public void agregarPersona(String nombre) {
       this.agendaPersonas.agregar(nombre);
    }

    public void agregarRecurso(String nombre) {
        this.agendaRecursos.agregar(nombre) ;
    }

    public void agregarEvento(String nombre, List<String> invitados, int i, int i0, int i1, int i2) {
        this.agendaEventos.agregar(nombre) ;
    }

    public void agregarEventoSemanal(String nombre, int i, List<String> invitados, int i0, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean existePersona(String nombre) {
        return this.agendaPersonas.existe(nombre) ;
    }

    public boolean existeRecurso(String nombre) {
        return this.agendaRecursos.existe(nombre) ;
    }

    public boolean estaOcupado(String nombre, int i, int i0, int i1, int i2) {
        return this.agendaRecursos.existe(nombre) ;
    }

}
