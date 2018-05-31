/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

public class EngeneeCalculator extends Calculator {
    
    public EngeneeCalculator(double a) {
        super(a);
    }
    
    public double sin(){
    return Math.sin(a*Math.PI/180);
    }
   
     public double cos(){
    return Math.cos(a*Math.PI/180);
    }
    
}
