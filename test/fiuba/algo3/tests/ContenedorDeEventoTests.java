/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import fiuba.algo3.modelo.ContenedorDeEventos;
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
        Assert.assertFalse(cont.existeEvento(2016,5,5,5));
    }
    
    @Test
    public void test02ContenedorDeEventosTieneEvento(){
        ContenedorDeEventos cont = new ContenedorDeEventos();
        cont.agregarEvento("nombreEvento",2016,5,5,5);
        Assert.assertTrue(cont.existeEvento(2016,5,5,5));
    }

    @Test
    public void test03ContenedorDeEventoAgregaEventoSemanal(){
        ContenedorDeEventos cont = new ContenedorDeEventos();
        cont.agregarEvento(2,"nombreEvento",2016,5,5,5);
        Assert.assertTrue(cont.existeEvento(2016,5,12,5));
    }
}
