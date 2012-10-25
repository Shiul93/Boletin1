/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio5;
import Ejercicio5.Carta.Palo;
import java.util.*;
import static java.lang.System.*;    
/**
 *
 * @author Luis
 */
public class Baraja {


   private final List<Carta> baraja=new ArrayList<Carta>(); 
   public Baraja(){
     
 
       
   for( Palo p:Palo.values()){   
      for (int i = 1; i <= 12; i++) {
       
        baraja.add(new Carta(i,p));
           
        }  
      }
   }
   public Carta getCarta(int i){ //Devuelve una carta de la baraja
   return this.baraja.get(i)   ;
   }
   public Mazo barajar(){//Copia la baraja en un mazo, lo mezcla y devuelve el mismo
      Mazo mazo;
        
        mazo = new Mazo(this);
        
        return mazo;
                  }
}

