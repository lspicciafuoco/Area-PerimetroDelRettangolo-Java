/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rettangolo;

/**
 *
 * @author MASSIMO PICCIAFUOCO
 */
public class Rettangolo {
    
    private double base,altezza;
    
    
    public void setBase(double b){
        base=b;
    }
    
    public void setAltezza(double a){
        altezza=a;
    }
    
    public double area(){
        return(altezza*base);
    }
     public double perimetro(){
        return((2*altezza)+(2*base));
        
    }
    
}
