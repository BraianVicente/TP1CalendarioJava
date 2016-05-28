/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import fiuba.algo3.modelo.ContenedorDeInvitados;
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
        ContenedorDeInvitados cont = new ContenedorDeInvitados() ;
        Assert.assertFalse(cont.existe("Juan")) ;
        cont.agregarPersona("Juan");
        Assert.assertTrue(cont.existe("Juan")) ;
    }

    @Test
    public void test02agregarEvento(){
        ContenedorDeInvitados cont = new ContenedorDeInvitados();
        cont.agregarPersona("Juan");
        ArrayList inv = new ArrayList();
        inv.add("Juan");
        cont.agregarEvento("unEvento", inv, 2016, 5, 6, 15);
        Assert.assertTrue(cont.estaOcupado("Juan", 2016, 5, 6, 15));
    }

    @Test
    public void test03agregarEventoSemanal(){
        ContenedorDeInvitados cont = new ContenedorDeInvitados();
        cont.agregarPersona("Juan");
        ArrayList inv = new ArrayList();
        inv.add("Juan");
        cont.agregarEvento(2,"unEvento", inv, 2016, 5, 6, 15);
        Assert.assertTrue(cont.estaOcupado("Juan", 2016, 5, 13, 15));
        Assert.assertTrue(cont.estaOcupado("Juan", 2016, 5, 6, 15));
    }
    
    @Test
    public void test04agregarRecurso(){
        ContenedorDeInvitados cont = new ContenedorDeInvitados() ;
        Assert.assertFalse(cont.existeRecurso("proyector")) ;
        cont.agregarRecurso("proyector");
        Assert.assertTrue(cont.existeRecurso("proyector")) ;
    }


    
}

