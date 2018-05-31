/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

public class Calculator {
     protected double a;
    protected double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Calculator{" + "a=" + a + ", b=" + b + '}';
    }
    
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

 public double add(){
     return a+b;
 }
  public double sub(){
     return a-b;
 }
   public double mult(){
     return a*b;
 }
    public double div(){
     return a/b;
 }

    
    
}
