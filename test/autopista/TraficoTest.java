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
public class TraficoTest {
    
    public TraficoTest() {
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
     * Test of getProximaLlegada method, of class Trafico.
     */
    @Test
    public void testGetProximaLlegada() {
        System.out.println("getProximaLlegada");
        Trafico instance = null;
        int expResult = 0;
        int result = instance.getProximaLlegada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of proximaLlegada method, of class Trafico.
     */
    @Test
    public void testProximaLlegada() {
        System.out.println("proximaLlegada");
        Reloj r = null;
        Trafico instance = null;
        instance.proximaLlegada(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
