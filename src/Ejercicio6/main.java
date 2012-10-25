/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;
import Ejercicio6.Tablero.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luis
 */
public class main {
  public static void main  (String[] args){
      String cosicas;
      Tablero tablero=new Tablero();
      List<Posicion> listaPosPiezas=new ArrayList<Posicion>();
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
              
  }   
}
