/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.math.BigInteger;

public class lab4 {
        public static void main(String[] args) {
    Factorial factorial=new Factorial();
    System.out.println("3!="+factorial.fact(new BigInteger("3")));
    System.out.println("5!="+factorial.fact(new BigInteger("5")));
}
}
