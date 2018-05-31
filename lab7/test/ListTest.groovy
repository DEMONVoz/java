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

class ListTest {

    List ls = new List();
   
    
    public ListTest() {
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
   public void AddFrontTest(){
       assertEquals([1],addFront(1));
   }
   
   @Test
    public void AddBackTest(){
       assertEquals([2,1],addFront(2));
   }
   
    @Test
    public void delElTest(){
       assertEquals([1],delEl(2));
   }
   
   
    
    
}
