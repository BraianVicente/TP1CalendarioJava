/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import fiuba.algo3.modelo.ContenedorDePersonas;
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
    
}
