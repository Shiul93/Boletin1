
package Ejercicio6;

/**
 *
 * @author Luis
 */
public class Posicion {
  public enum coorX{a,b,c,d,e,f,g,h}
 
  private coorX coordenadaX;
  private int coordenadaY;
  
  
  public Posicion(coorX X, int Y){
      coordenadaX = X;
      coordenadaY = Y;
  }
}
