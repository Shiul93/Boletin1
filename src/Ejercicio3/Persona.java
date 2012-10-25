

package Ejercicio3;

/**
 *
 * @author l.f.llamas
 */
public class Persona {
    
    
    
 private String DNI;
 private String nombre;
 
 public static final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";
 
 public static char letraDNI(int dni) //Devuelve la Letra de un DNI (integer) dado
  {
     char letra =(String.valueOf(dni) + NIF_STRING_ASOCIATION.charAt(dni % 23)).charAt(8);
      
    return (letra);
  }
 
 
public Persona(String dni,String nombre) //Metodo Constructor
{
    int contador=0;
    int numerodni=0;   
    char arraydni[]=dni.toCharArray();
    if (dni.length()!=9){
        
    throw new IllegalArgumentException();    
    }
    char letradni=arraydni[8];
    int exponente=7;
    
    while (contador<8)
    {
       
        numerodni=(int) (numerodni+((arraydni[contador]-48)*(Math.pow(10,exponente))));//Extrae el numero del dni del array
        exponente--;
       contador++;
    }
    
    if ((letradni != letraDNI(numerodni)) )
    {
        throw new IllegalArgumentException();
    }
    
    else
        
    {
        this.DNI=dni;
        this.nombre=nombre;
    }
}
@Override
public String toString() 
{
    return "A la persona de nombre "+nombre+" le corresponde el DNI: "+DNI    ;
}
public static String dni(Persona pers)//Devuelve el dni de una persona con letra.
{
    return (pers.DNI);
}

}
