/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Ejercicio2.calificacionPelicula;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author miguel.mezo
 */
public class calificacionPeliculaTest {
    
    public calificacionPeliculaTest() {
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

    /**
     * Test of mediaPelicula method, of class calificacionPelicula.
     */
    @Test
    public void testMediaPelicula() {
        assertEquals(3,calificacionPelicula.mediaPelicula("Drive"),0.01);
        assertEquals(3.2,calificacionPelicula.mediaPelicula("The Artist"),0.01);
        assertEquals(3.2,calificacionPelicula.mediaPelicula("Hugo"),0.01);
        assertEquals(3.2,calificacionPelicula.mediaPelicula("Torrente 4"),0.01);
        assertEquals(2,calificacionPelicula.mediaPelicula("X-men"),0.01);
        assertEquals(3,calificacionPelicula.mediaPelicula("Biutiful"),0.01);
        assertEquals(0,calificacionPelicula.mediaPelicula("Titanic"),0.01); /*Pelicula no válida*/
    }
}
