/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import fiuba.algo3.modelo.ContenedorDeRecursos;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author brahvic
 */
public class ContenedorDeRecursosTests {
    
    @Test
    public void test01agregarRecurso(){
        ContenedorDeRecursos cont = new ContenedorDeRecursos() ;
        Assert.assertFalse(cont.existe("proyector")) ;
        cont.agregar("proyector");
        Assert.assertTrue(cont.existe("proyector")) ;
    }
    
}
