
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
import lab6.Calculator

class CalculatorTest {
 Calculator calcul= new Calculator(2,2);
    public CalculatorTest() {
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
    public void AddTest01()
    {
        assertEquals(4.0,calcul.add());
    }
    
     @Test
     public void SubTest02()
    {
        assertEquals(0.0,calcul.sub());
    }
    
     @Test
     public void MultTest03()
    {
        assertEquals(4.0,calcul.mult());
    }
    
     @Test
     public void DivTest03()
    {
        assertEquals(1.0,calcul.div());
    }
}
