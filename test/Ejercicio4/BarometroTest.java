/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

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
public class BarometroTest {
    
    public BarometroTest() {
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
public void BarometroTest(){
    
    Barometro baro=new Barometro(1,"Pascal");
    
    assertEquals(1,baro.getPascales(),0.01);
    assertEquals(0.01,baro.getMilibares(),0.01);
    assertEquals(0.00000987,baro.getAtmosfera(),0.01);
    
    baro.setAtmosferas(1);
    
    assertEquals(101325,baro.getPascales(),0.01);
    assertEquals(1013.25,baro.getMilibares(),0.01);
    assertEquals(1,baro.getAtmosfera(),0.01);
    
    baro.setMilibares(1);
    
    assertEquals(100,baro.getPascales(),0.01);
    assertEquals(1,baro.getMilibares(),0.01);
    assertEquals(0.000987,baro.getAtmosfera(),0.01);
    
    baro.setPascales(1);
    
    assertEquals(1,baro.getPascales(),0.01);
    assertEquals(0.01,baro.getMilibares(),0.01);
    assertEquals(0.00000987,baro.getAtmosfera(),0.01);
    
    baro.setAtmosferas(3);
    
    Barometro baro2=new Barometro((float)1013.25 ,"Milibar");
    Barometro baro3=new Barometro(1,"Atmosfera");
    
    assertTrue(baro2.equals(baro3));
    Barometro baro4=null;
    assertFalse(baro2.equals(baro));
    assertFalse(baro2.equals("ESTO NO ES UN BAROMETRO"));
    assertFalse(baro2.equals(baro4));
}

}
