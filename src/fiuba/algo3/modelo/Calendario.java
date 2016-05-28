package fiuba.algo3.modelo;

import java.util.List;

public class Calendario {

    private  ContenedorDeInvitados agendaInvitados;

    public Calendario (){
        this.agendaInvitados = new ContenedorDeInvitados() ;
    }

    public void agregarPersona(String nombre) {
       this.agendaInvitados.agregarPersona(nombre);
    }

    public void agregarRecurso(String nombre) {
        this.agendaInvitados.agregarRecurso(nombre) ;
    }

    public void agregarEvento(String nombre, List<String> invitados, int anio, int mes, int dia, int hora) {
        this.agendaInvitados.agregarEvento(nombre,invitados,anio,mes,dia,hora);
    }

    public void agregarEventoSemanal(String nombre, int repeticion, List<String> invitados, int anio, int mes, int dia, int hora) {
        this.agendaInvitados.agregarEvento(repeticion,nombre,invitados,anio,mes,dia,hora);
    }

    public boolean existePersona(String nombre) {
        return this.agendaInvitados.existePersona(nombre) ;
    }

    public boolean existeRecurso(String nombre) {
        return this.agendaInvitados.existeRecurso(nombre) ;
    }

    public boolean estaOcupado(String nombre, int anio, int mes, int dia, int hora) {
        return this.agendaInvitados.estaOcupado(nombre, anio, mes, dia, hora) ;
    }
}
