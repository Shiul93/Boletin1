
package Ejercicio5;

/**
 *
 * @author Luis
 */
public class Carta {
   public enum Palo{copas, espadas, bastos, oros}; 
   private int numero;
   private Palo palo;
   
   public Carta(int numero,Palo palo){
       
       this.numero=numero;
       this.palo=palo;
   }
   public Palo getPalo(Carta carta){
       return carta.palo;
   }
   public int getNumero(Carta carta){
       return carta.numero;
   }

   
 @Override
     public String toString(){
       return "Esta carta es un "+this.numero+" de "+this.palo.toString();
   }
}
