/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import fiuba.algo3.modelo.Recurso;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author brahvic
 */
public class RecursoTests {

    @Test
    public void test01RecursoIgualdadConNombre(){
        Recurso rec = new Recurso("proyector");
        Assert.assertTrue(rec.equals(new Recurso("proyector")));
    }

    @Test
    public void test02RecursoFallaIgualdadDistintoNombre(){
        Recurso rec = new Recurso("proyector");
        Assert.assertFalse(rec.equals(new Recurso("radio")));
    }

    @Test
    public void test03RecursoNoTieneEventosAlCrearse(){
        Recurso rec = new Recurso("proyector");
        Assert.assertFalse(rec.estaOcupado(2016, 1, 12, 18));
    }

    @Test
    public void test04RecursoAgregaEvento(){
        Recurso rec = new Recurso("proyector");
        rec.agregarEvento("unNombre", 2016, 1, 12, 18);
        Assert.assertTrue(rec.estaOcupado(2016, 1, 12, 18));
    }

}
