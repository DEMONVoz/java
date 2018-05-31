
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
import lab5.Parallelepiped

/**
 *
 * @author lenya
 */
class ParallelepipedTest {
Parallelepiped P0 = new Parallelepiped(1,2,3);
    public ParallelepipedTest() {
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
   public void ParallelAreaTest01()
   {
       assertEquals(22.0,P0.Area());
   }
     @Test
   public void ParallelVolumeTest02()
   {
       assertEquals(6.0,P0.Voluem());
   }
     @Test
   public void ParallelComprationTest03()
   {
       assertEquals("V<S",P0.Compration());
   }
}
