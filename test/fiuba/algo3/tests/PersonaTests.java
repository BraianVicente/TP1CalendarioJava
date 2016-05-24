/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import fiuba.algo3.modelo.Persona;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author brahvic
 */
public class PersonaTests {
    
    @Test
    public void test01PersonaIgualdadConMismoNombre(){
        Persona per = new Persona("Braian");
        Assert.assertTrue(per.equals(new Persona("Braian")));
    }
    
    @Test
    public void test02PersonaFallaIgualdadNombreDistinto(){
        Persona per = new Persona("Braian");
        Assert.assertFalse(per.equals(new Persona("Hernan")));
    }
    
    @Test
    public void test03PersonaAgregaEvento(){
        Persona per = new Persona("Braian");
        per.agregarEvento("miEvento", 2016, 6, 15, 2);
        Assert.assertTrue(per.estaOcupado(2016, 6, 15, 2));
    }
    
    @Test
    public void test04PersonaNoTieneEvento(){
        Persona per = new Persona("Braian");
        Assert.assertFalse(per.estaOcupado(2016, 6, 15, 2));     
    }
    
    
}
