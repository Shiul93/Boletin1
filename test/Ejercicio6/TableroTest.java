/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import Ejercicio6.Pieza.TipoPieza;
import java.util.List;
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
public class TableroTest {
    
    public TableroTest() {
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
public void TableroTest(){
    String cosicas;
      Tablero tablero=new Tablero();
      List<Posicion> listaPosPiezas;
      cosicas=tablero.toString();
      System.out.println(cosicas);
      
      tablero.iniciarPartida();
    
      cosicas=tablero.toString();
      System.out.println(cosicas);
      Posicion posiOri=new Posicion(0,0);
      Posicion posiDest=new Posicion(0,6);
      tablero.mover(posiOri,posiDest);
      cosicas=tablero.toString();
       System.out.println(cosicas);
      listaPosPiezas=tablero.buscaPiezas(Pieza.TipoPieza.dama);
      System.out.println(listaPosPiezas);
      posiOri.setCoordenadas(1, 7);
      posiDest.setCoordenadas(0, 6);
      tablero.mover(posiOri,posiDest);
      System.out.println(tablero);
      posiOri.setCoordenadaX(2);
      posiOri.setCoordenadaY(2);
}
}
