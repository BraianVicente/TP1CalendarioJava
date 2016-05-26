/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import fiuba.algo3.modelo.ContenedorDeEventos;
import fiuba.algo3.modelo.SuperposicionEventoException ;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author brahvic
 */
public class ContenedorDeEventoTests {

    @Test
    public void test01ContenedorDeEventosNoTieneEvento(){
        ContenedorDeEventos cont = new ContenedorDeEventos();
        Assert.assertFalse(cont.existeEventoEnFecha(2016,5,5,5));
    }

    @Test
    public void test02ContenedorDeEventosTieneEvento(){
        ContenedorDeEventos cont = new ContenedorDeEventos();
        cont.agregarEvento("nombreEvento",2016,5,5,5);
        Assert.assertTrue(cont.existeEventoEnFecha(2016,5,5,5));
    }

    @Test
    public void test03ContenedorDeEventoAgregaEventoSemanal(){
        ContenedorDeEventos cont = new ContenedorDeEventos();
        cont.agregarEvento(2,"nombreEvento",2016,5,5,5);
        Assert.assertTrue(cont.existeEventoEnFecha(2016,5,12,5));
    }
    
    @Test(expected=SuperposicionEventoException.class)
    public void test04EventoNoAgregadoPorSuperposicion(){
        ContenedorDeEventos cont = new ContenedorDeEventos();
        cont.agregarEvento("Hacer TP2", 2016, 5, 12, 5);
        Assert.assertTrue(cont.existeEventoConNombre("Hacer TP2"));
        cont.agregarEvento("Hacer TPDatos", 2016, 5, 12, 5);
    }
    
    @Test
    public void test05EventoSemanalFinalizaCorrectamente(){
        ContenedorDeEventos cont = new ContenedorDeEventos();
        cont.agregarEvento(2,"nombreEvento",2016,5,5,5);
        Assert.assertFalse(cont.existeEventoEnFecha(2016,5,17,5));
       
    }
}
