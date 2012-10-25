
package Ejercicio4;

/**
 *
 * @author l.f.llamas
 */
public class Barometro {
   private float presion;
    
    public Barometro(float presion,String unidad){
     if ("Pascal".equals(unidad)) {
            this.presion=presion;          
        }
       
        if("Milibar".equals(unidad)) {
            this.presion=100*presion;          
        }
        if ("Atmosfera".equals(unidad)){
            this.presion=101325*presion;
        }
        
        
    }//Metodos que devuelven la presion de un barometro en diferentes unidades
     public float getPascales(){
       
        return this.presion;
    }
   
    public float getMilibares(){
       
        return (this.presion/100);
    }
   
    public float getAtmosfera(){
        return (this.presion/101325);
    }
    //Metodos que fijan la presion de un barometro en diferentes unidades
    public void setPascales(float presion){
        this.presion=presion;
    }
   
    public void setMilibares(float presion){
        this.presion=presion*100;
    }
   
    public void setAtmosferas(float presion){
        this.presion=presion*101325;
    }
   @Override
   public String toString()
{
    return "La presion actual es de "+this.presion+" pascales"    ;
}
   @Override
   public boolean equals(Object barometro){ //Compara dos barometros por sus respectivas presiones
       
       if (barometro==null){return false;}
       if (barometro.getClass()==Barometro.class){
           
           Barometro comparacion=(Barometro)barometro;
           
           if ((Math.abs(this.presion-comparacion.presion))<0.0000000001)
           {return true;}
           else
           {return false;}
       
           
                   }
       else 
       {return false;}
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Float.floatToIntBits(this.presion);
        return hash;
    }
}

