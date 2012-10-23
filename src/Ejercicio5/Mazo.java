
package Ejercicio5;
import java.util.*;

/**
 *
 * @author l.f.llamas
 */
public class Mazo {
    List<Carta> mazo=new ArrayList<Carta>(); 
    
    public Mazo(Baraja baraja ){
       
        for (int i=0;i==47;i++){
            
            this.mazo.add(baraja.getCarta(i));
        }
    Collections.shuffle(mazo);
    
    }
 
}
