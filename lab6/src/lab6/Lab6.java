/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EngeneeCalculator s1 = new EngeneeCalculator(30); 
        System.out.println("sin="+s1.sin());
        Calculator s2= new Calculator(1,2);
        System.out.println("a+b="+s2.add());
        System.out.println("a-b="+s2.sub());
        System.out.println("a*b="+s2.mult());
        System.out.println("a/b="+s2.div());
    }
    
}
