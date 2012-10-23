package ejercicio1;

/**
 *
 * @author Luis
 */
 public  class UtilidadesString {
    
    static public int  longitud(String cadena){ //Devuelve la longitud de una cadena
        
        int longitud = cadena.length();
        return longitud;
        
    }
    
    static public int  contar(String cadena , char caracter){//Devuelve el numero de caracteres de una cadena
        
        int encontrados = 0;
        
        int longitud = cadena.length();
        
        int contador = 0;
        
        char[] stringArray;
        
        stringArray = cadena.toCharArray();
        
        while  (contador<=longitud-1)
        {
          int caracter2 = stringArray[contador];  
            
            
            if (caracter2==caracter) 
            {
            encontrados=encontrados+1;
            }
            contador++;
        }
               
        
        return(encontrados);
    }
    
    static public int  contarVocales(String cadena)//Cuenta las vocales de una cadena
    {
    int contador=0;
    int contadorVocales=0;
    char[] stringArray;
    int longitud=cadena.length();    
    stringArray = cadena.toCharArray();
    while (contador<longitud)
    {
        if ((stringArray[contador]=='a')||(stringArray[contador]=='e')||(stringArray[contador]=='i')||(stringArray[contador]=='o')||(stringArray[contador]=='u')||(stringArray[contador]=='A')||(stringArray[contador]=='E')||(stringArray[contador]=='I')||(stringArray[contador]=='O')||(stringArray[contador]=='U'))
        {
            contadorVocales=contadorVocales+1;
        }
     contador=contador+1;   
    }
    return contadorVocales;
    }
    
    
    }
    
