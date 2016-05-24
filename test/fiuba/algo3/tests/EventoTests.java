/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuba.algo3.tests;

import org.junit.Test;
import fiuba.algo3.modelo.Evento ;
import org.junit.Assert;
/**
 *
 * @author brahvic
 */
public class EventoTests {

    @Test
    public void test01EventoIgualFecha(){
        Evento evt = new Evento("Partido de Truco",2016,06,15,23);
        
        Assert.assertTrue(evt.equals(new Evento(2016,06,15,23))) ;
    }
    
    @Test
    public void test02EventoDistinto(){
        Evento evt = new Evento("estudiar algo3",2016,06,13,20);
        
        Assert.assertFalse(evt.equals(new Evento(2016,06,15,24)));
    }
    
}
