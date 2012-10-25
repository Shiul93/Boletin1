/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;
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
      
      
      
      
      
  }
  
  public int xToInt(Posicion.coorX coor){
      int entero=0;
      switch (coor){
       
          case a:
              
              entero=0;
              break;    
          case b:
              
              entero=1;
              break;
          case c:
              
              entero=2;
              break;
          case d:
              
              entero=3;
              break;
          case e:
              
              entero=4;
              break;
              
          case f:
              
              entero=5;
              break;

          case g:
              
              entero=6; 
              break;
          case h:
              
              entero=7;
              break;
              
      }
      return entero;
  }
  
  public Posicion.coorX intToX(int coor){
      Posicion.coorX pos=Posicion.coorX.a;
      
      switch (coor){
       
          case 0:
              
              pos=Posicion.coorX.a;
              break;    
          case 1:
              
              pos=Posicion.coorX.b;
              break;
          case 2:
              
              pos=Posicion.coorX.c;
              break;
          case 3:
              
              pos=Posicion.coorX.d;
              break;
          case 4:
              
              pos=Posicion.coorX.e;
              break;
              
          case 5:
              
              pos=Posicion.coorX.f;
              break;

          case 6:
              
              pos=Posicion.coorX.g; 
              break;
          case 7:
              
              pos=Posicion.coorX.h;
              break;
      }
    return pos;  
  } 
  
  
 @Override
 public String toString(){
     
 String datos="";
 
    int contador=1;
    
     for (int y = 7; y >= 0; y--)
     {
                 
         for (int x = 0; x <=7; x++) 
         
         {
         
             if ((tablero[x][y]==null)&&(x<7))
            {
             contador++ ;   
                 
            }
             else{
                 
                 if (contador !=1){
                     
                     datos=datos+contador;
                     contador=1;
                 }
                 else{
                     datos=datos+tipoPieza(tablero[x][y]);
                 }
                 
             }
                        
         }
       datos=datos+"/";       
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
 
}