/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author Luis
 */
public class Pieza {
  public enum TipoPieza{peon,torre,caballo,alfil,dama,rey}; 
  public enum ColorPieza{blanco, negro};
  TipoPieza tipo;
  ColorPieza color;
  public Pieza(TipoPieza tipo,ColorPieza color){
   this.color=color;
   this.tipo=tipo;
  }
}
