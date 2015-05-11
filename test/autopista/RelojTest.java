/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package autopista;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author linux1
 */
public class RelojTest {
    
    public RelojTest() {
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

    /**
     * Test of aCero method, of class Reloj.
     */
    @Test
    public void testACero() {
        System.out.println("aCero");
        Reloj instance = new Reloj();
        instance.aCero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tiempoAhora method, of class Reloj.
     */
    @Test
    public void testTiempoAhora() {
        System.out.println("tiempoAhora");
        Reloj instance = new Reloj();
        int expResult = 0;
        int result = instance.tiempoAhora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tic method, of class Reloj.
     */
    @Test
    public void testTic() {
        System.out.println("tic");
        Reloj instance = new Reloj();
        instance.tic();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
