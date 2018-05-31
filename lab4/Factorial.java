/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.math.BigInteger;

public class Factorial {
    public BigInteger fact(BigInteger numb)
    {
        if(numb.equals(BigInteger.ZERO))
        {
            return BigInteger.valueOf(1);
        }
        else
        {
            return numb.multiply(fact(numb.subtract(BigInteger.ONE)));
        }

    }
}

