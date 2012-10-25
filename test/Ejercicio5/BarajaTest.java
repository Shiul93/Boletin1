/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class BarajaTest {
    
    public BarajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
@Test 
public void BarajaTest(){
    Baraja baraja = new Baraja();
    Carta cartacomp=new Carta(1,Carta.Palo.copas);
    assertEquals(cartacomp.toString(),baraja.getCarta(0).toString());
    Mazo mazo=baraja.barajar();
}
}
