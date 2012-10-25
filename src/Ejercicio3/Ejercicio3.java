/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author l.f.llamas
 */
public class Ejercicio3 {
   public static void main  (String[] args){
  String dni="506035Q"  ;
  String nombre="Miguel";  
         
    
  Persona miguel=new Persona(dni,nombre);
  
       System.out.println(miguel);
       
       System.out.println(Persona.dni(miguel));
   }
   
}
