/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import fiuba.algo3.modelo.ContenedorDePersonas;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author brahvic
 */
public class ContenedorDePersonasTests {


    @Test
    public void test01agregarPersona(){
        ContenedorDePersonas cont = new ContenedorDePersonas() ;
        Assert.assertFalse(cont.existe("Juan")) ;
        cont.agregar("Juan");
        Assert.assertTrue(cont.existe("Juan")) ;
    }    
    
    @Test
    public void test02agregarEvento(){
        ContenedorDePersonas cont = new ContenedorDePersonas();
        cont.agregar("Juan");
        ArrayList inv = new ArrayList();
        inv.add("Juan");
        cont.agregarEvento("unEvento", inv, 2016, 5, 6, 15);
        Assert.assertTrue(cont.estaOcupado("Juan", 2016, 5, 6, 15));
    }
    
    @Test
    public void test03agregarEventoSemanal(){
        ContenedorDePersonas cont = new ContenedorDePersonas();
        cont.agregar("Juan");
        ArrayList inv = new ArrayList();
        inv.add("Juan");
        cont.agregarEvento(2,"unEvento", inv, 2016, 5, 6, 15);
        Assert.assertTrue(cont.estaOcupado("Juan", 2016, 5, 13, 15));
        Assert.assertTrue(cont.estaOcupado("Juan", 2016, 5, 6, 15));

    }
    
}
    
