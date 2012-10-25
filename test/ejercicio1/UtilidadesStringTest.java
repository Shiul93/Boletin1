/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Ejercicio1.UtilidadesString;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author l.f.llamas
 */
public class UtilidadesStringTest {
	/**
	 * Test of longitud method, of class UtilidadesString.
	 */
	@Test
	public void testLongitud() 
	{
		assertEquals(4, UtilidadesString.longitud("Hola"));
		assertEquals(5, UtilidadesString.longitud("Mundo"));
		assertEquals(1, UtilidadesString.longitud("A"));
		assertEquals(0, UtilidadesString.longitud(""));
	}

	/**
	 * Test of contar method, of class UtilidadesString.
	 */
	@Test
	public void testContar() 
	{
		assertEquals(1, UtilidadesString.contar("Hola Mundo", 'M'));
		assertEquals(1, UtilidadesString.contar("Java Virtual Machine", 'v'));	
		assertEquals(2, UtilidadesString.contar("El Odren No Ipmotra", 'o'));	
		assertEquals(0, UtilidadesString.contar("JUST DO IT tomorrow", 'b'));	
	}

		
	/**
	 * Test of contarVocales method, of class UtilidadesString.
	 */
	@Test
	public void testContarVocales() 
	{
		assertEquals(4, UtilidadesString.contarVocales("Hola Mundo"));
		assertEquals(8, UtilidadesString.contarVocales("Java Virtual Machine"));	
		assertEquals(7, UtilidadesString.contarVocales("El Odren No Ipmotra"));	
		assertEquals(6, UtilidadesString.contarVocales("JUST DO IT tomorrow"));	
		assertEquals(0, UtilidadesString.contarVocales("BSD gpl"));	
	}
}
