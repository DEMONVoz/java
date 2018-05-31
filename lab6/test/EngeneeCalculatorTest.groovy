
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import static org.junit.Assert.*
import lab6.EngeneeCalculator

class EngeneeCalculatorTest {
EngeneeCalculator en= new EngeneeCalculator(90);
    public EngeneeCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void SinTest01(){
        assertEquals(1,en.sin());
    }
    
     @Test 
    public void CosTest01(){
        assertEquals(0,en.cos());
    }
    
}
