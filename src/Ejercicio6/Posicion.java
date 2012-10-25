
package Ejercicio6;

/**
 *
 * @author Luis
 */
public class Posicion {

 
  private int coordenadaX;
  private int coordenadaY;

    public Posicion(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    public void setCoordenadas(int x, int y){
        this.coordenadaX=x;
        this.coordenadaY=y;
    }
    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
  @Override
   public String toString(){
      
      
      return "Esta posicion es "+this.coordenadaX+" X "+this.coordenadaY+" Y ";
  }
  
  

}
