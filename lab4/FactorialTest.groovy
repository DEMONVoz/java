/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.company.lab4

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*;
import javaapplication1.Factorial

class FactorialTest extends groovy.util.GroovyTestCase {
    private Factorial factorial= new Factorial()

    @Test
    public void testFact01()
    {
        assertEquals(new BigInteger("1"),factorial.fact(new BigInteger("0")));
    }
    @Test
    public void testFact02()
    {
        assertEquals(new BigInteger("6"),factorial.fact(new BigInteger("3")));
    }

}

