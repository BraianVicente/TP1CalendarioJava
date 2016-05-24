/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

import fiuba.algo3.modelo.ContenedorDePersonas;

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
    public void test02agregarEventoVariasPersonas(){
        ContenedorDePersonas cont = new ContenedorDePersonas() ;
        cont.agregar("Juan");
        cont.agregar(("Pablo"));

        ArrayList<String> invitados = new ArrayList();
        invitados.add("Juan");
        invitados.add("Pablo");
        cont.agregarEvento("Parcial Datos",invitados,2016,5,23,20);
        Assert.assertTrue(cont.get("Juan").estaOcupado(2016,5,23,20)) ;
    }
}
