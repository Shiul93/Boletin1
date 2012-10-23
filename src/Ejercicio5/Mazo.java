
package Ejercicio5;
import java.util.*;


/**
 *
 * @author l.f.llamas
 */
public class Mazo {
    List<Carta> mazo=new ArrayList<Carta>(); 
    
    public Mazo(Baraja baraja){
       this.mazo=baraja.barajar().mazo;
    
    
    }
 
}
