/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author miguel.mezo
 */
public class calificacionPelicula {
    
    static public float mediaPelicula(String nombre){
        
    
        float[] pArtist= {5,1,3,2,5};
        float[] pHugo={4,2,4,2,4};
        float[] pBiutiful={3,2,3,5,2};
        float[] pDrive={3,3,1,3,5};
        float[] pXmen={1,4,2,2,1};
        float[] pTorrente4={2,5,3,4,2};
        String[] peliculas={"The Artist","Hugo","Biutiful","Drive","X-men","Torrente 4"};
        float media=0;
        float sumatorio=0;
        boolean encontrado=false;
        int longitud=peliculas.length;
        int i;
        
        int contador=0;
        
        while((encontrado==false)&&(contador<longitud)){
            
            if (peliculas[contador].equals(nombre)) {encontrado=true;}
            else {
                contador=contador+1;}       
        } /* fin while*/ 

        
        switch (contador){
        case 0: { 
                System.out.println(peliculas[contador]);
                for(i=0; i<5; i++){
                sumatorio=sumatorio+pArtist[i];
                media=sumatorio/5; 
                }  
                break;
            }
        case 1: { 
                System.out.println(peliculas[contador]);
                for(i=0; i<5; i++){
                sumatorio=sumatorio+pHugo[i];
                media=sumatorio/5; 
                }  
                break;
            } 
        case 2: { 
                System.out.println(peliculas[contador]);
                for(i=0; i<5; i++){
                sumatorio=sumatorio+pBiutiful[i];
                media=sumatorio/5;
                }     
                break;
             }
        case 3: { 
                System.out.println(peliculas[contador]);
                for(i=0; i<5; i++){
                sumatorio=sumatorio+pDrive[i];
                media=sumatorio/5; 
                }                  
                break;
             }
        case 4: { 
                System.out.println(peliculas[contador]);
                for(i=0; i<5; i++){
                sumatorio=sumatorio+pXmen[i];
                media=sumatorio/5; 
                }        
                break;
             }
        case 5: { 
                System.out.println(peliculas[contador]);
                for(i=0; i<5; i++){
                sumatorio=sumatorio+pTorrente4[i];
                media=sumatorio/5; 
                }  
                break;
             }
        default:{
            System.out.println("No es una película válida");
            }
    } /* Fin switch */
        return(media);
    }   
}
