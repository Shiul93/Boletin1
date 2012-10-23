
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
        if ("Atmósfera".equals(unidad)){
            this.presion=101325*presion;
        }
        
        
    }
     private float getPascales(){
       
        return this.presion;
    }
   
    private float getMilibares(){
       
        return (this.presion/100);
    }
   
    private float getAtmosfera(){
        return (this.presion/101325);
    }
   
    private void setPascales(float presion){
        this.presion=presion;
    }
   
    private void setMilibares(float presion){
        this.presion=presion*100;
    }
   
    private void setAtmosferas(float presion){
        this.presion=presion*101325;
    }
   @Override
   public String toString()
{
    return "La presion actual es de "+this.presion+" pascales"    ;
}
   @Override
   public boolean equals(Object barometro){
       
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

