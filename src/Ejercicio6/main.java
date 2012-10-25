/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;
import Ejercicio6.Tablero.*;
/**
 *
 * @author Luis
 */
public class main {
  public static void main  (String[] args){
      String cosicas;
      Tablero tablero=new Tablero();
      
      cosicas=tablero.toString();
      System.out.println(cosicas);
      
      tablero.iniciarPartida();
    
      cosicas=tablero.toString();
      System.out.println(cosicas);
  }   
}
