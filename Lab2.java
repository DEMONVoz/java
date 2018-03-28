/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author DEMON
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 0.01, x = 7.1, b = 5, c = 4.1;
    double F = (Math.exp(-a*x) * Math.cos(b*x+c) + Math.exp(a*x) + Math.sin(c*x-1));
            System.out.println("F = " + F);
        }
    }
