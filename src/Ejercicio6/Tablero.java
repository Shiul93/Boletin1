/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;
import java.util.*;
import Ejercicio6.Pieza.ColorPieza;
import Ejercicio6.Pieza.TipoPieza;
/**
 *
 * @author Luis
 */
public class Tablero {
     
     Pieza tablero[][]= new Pieza[8][8];
     
     public Tablero(){
         
         for (int i = 0; i == 7; i++) {
             for (int j = 0; j ==7; j++) {
                 this.tablero[i][j]=null;
                 
             }
             
         }
         
     }
     
     
     
     
     
     public void iniciarPartida()
     {
     this.tablero[0][0]= new Pieza (TipoPieza.torre,ColorPieza.blanco);
     this.tablero[1][0]= new Pieza (TipoPieza.caballo,ColorPieza.blanco);
     this.tablero[2][0]= new Pieza (TipoPieza.alfil,ColorPieza.blanco);
     this.tablero[3][0]= new Pieza (TipoPieza.dama,ColorPieza.blanco);
     this.tablero[4][0]= new Pieza (TipoPieza.rey,ColorPieza.blanco);
     this.tablero[5][0]= new Pieza (TipoPieza.alfil,ColorPieza.blanco);
     this.tablero[6][0]= new Pieza (TipoPieza.caballo,ColorPieza.blanco);
     this.tablero[7][0]= new Pieza (TipoPieza.torre,ColorPieza.blanco);
     
     for (int i = 0; i <= 7; i++) {
         
        this.tablero[i][1]= new Pieza (TipoPieza.peon,ColorPieza.blanco);
             
     }
     for (int i = 2; i == 5; i++) {
         
             for (int j = 0; j == 7; j++) {
                 
                 this.tablero[i][j]=null;
                 
             }
             
         }
     
     for (int i = 0; i <= 7; i++) {
         
        this.tablero[i][6]= new Pieza (TipoPieza.peon,ColorPieza.negro);
             
     }
     this.tablero[0][7]= new Pieza (TipoPieza.torre,ColorPieza.negro);
     this.tablero[1][7]= new Pieza (TipoPieza.caballo,ColorPieza.negro);
     this.tablero[2][7]= new Pieza (TipoPieza.alfil,ColorPieza.negro);
     this.tablero[3][7]= new Pieza (TipoPieza.rey,ColorPieza.negro);
     this.tablero[4][7]= new Pieza (TipoPieza.dama,ColorPieza.negro);
     this.tablero[5][7]= new Pieza (TipoPieza.alfil,ColorPieza.negro);
     this.tablero[6][7]= new Pieza (TipoPieza.caballo,ColorPieza.negro);
     this.tablero[7][7]= new Pieza (TipoPieza.torre,ColorPieza.negro);
     }
     
  public void mover(Posicion posOr,Posicion posDes)   {
      
     
     
     
     
     if (this.tablero[posOr.getCoordenadaX()][posOr.getCoordenadaY()]==null){
         
          throw new IllegalArgumentException();
     }
     else{
      this.tablero[posDes.getCoordenadaX()] [posDes.getCoordenadaY()]=this.tablero[posOr.getCoordenadaX()][posOr.getCoordenadaY()];
      this.tablero[posOr.getCoordenadaX()][posOr.getCoordenadaY()]=null;
         System.out.println("");         
     }
              
      
  }

  

  
  
 @Override
 public String toString(){
     
 String datos="";
 
    int contador=0;
    
     for (int y = 7; y >= 0; y--)
     {
                 
         for (int x = 0; x <=7; x++) 
         
         {
             if ((tablero[x][y]==null)&&(x==7))
             {contador++;}
             if ((tablero[x][y]==null)&&(x<7))
            {
             contador++ ;   
             
            }
             else{
                 
                 if (contador !=0){
                     
                     datos=datos+contador;
                     contador=0;
                     if (x<7){
                      datos=datos+tipoPieza(tablero[x][y]);}
                     
                 }
                 else{
                     datos=datos+tipoPieza(tablero[x][y]);
                 }
                 
             }
                        
         }
         if (y==0){}
         else{
       datos=datos+"/";   }    
     }
 
 return datos;
 }
 

 public String tipoPieza(Pieza pieza){
     
     
     TipoPieza tipo=pieza.tipo;
     
     ColorPieza color=pieza.color;
     
     String output="RELLENO";
     
     
     switch (tipo){
         
     case peon:
     
        output="p";
     
     break;
         
     case torre:
     
         output="t";
     
     break;
     
     case caballo:
     
        output="c";
     
     break;    
     
     case alfil:
     
        output="a";
     
     break;
         
     case dama:
     
        output="d";
     
     break;
         
     case rey:
     
        output="r";
     
     break;    
     }
     
     
     if (color==ColorPieza.blanco)
             {
             output=output.toUpperCase();    
             }
         
         return output;
             
     
 }
public List<Posicion> buscaPiezas(Pieza.TipoPieza tipo) {
    
    List<Posicion> lista=new ArrayList<Posicion>();
    for (int y = 7; y >=0; y--) {
        for (int x = 0; x <=7; x++) {
            if (this.tablero[x][y]!=null){
            if (this.tablero[x][y].tipo==tipo){
                
                lista.add(new Posicion(x,y));
            }
        } 
        }
        
    }
    
    
  return lista;  
}
 
}