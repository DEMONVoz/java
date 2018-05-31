/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

public class Parallelepiped {
    private double a;
    private double b;
    private double c;

    public Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double Area(){
    double s=2*(a*b+a*c+b*c);
    return s;
    }
    
    public double Voluem(){
      double v=a*b*c; 
     return v;
    }
      public void Compration(){
       double v=a*b*c;
       double s=2*(a*b+a*c+b*c);
        if(v<s){
        System.out.println("V<S");}
        else if (v>s)System.out.println("V>S");
        else System.out.println("V==S");
      }
    }
    