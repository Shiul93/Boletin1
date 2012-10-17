/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.*;


/**
 *
 * @author l.f.llamas
 */
public class Mazo {
    List<Carta> mazo=new ArrayList<Carta>(); 
    
    public Mazo(Baraja baraja){
       Collections.shuffle(baraja.baraja);
        this.mazo=baraja.baraja;
    }
    public void añadirCarta(Mazo mazo,Carta carta){
        
        this.mazo.add(carta);
   
    }

}
