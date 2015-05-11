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
public class ControladorTest {
    
    public ControladorTest() {
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
     * Test of LlegaCoche method, of class Controlador.
     */
    @Test
    public void testLlegaCoche() {
        System.out.println("LlegaCoche");
        Reloj r = null;
        Controlador instance = null;
        instance.LlegaCoche(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estadoPeaje method, of class Controlador.
     */
    @Test
    public void testEstadoPeaje() {
        System.out.println("estadoPeaje");
        Reloj r = null;
        Controlador instance = null;
        instance.estadoPeaje(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marchaCoche method, of class Controlador.
     */
    @Test
    public void testMarchaCoche() {
        System.out.println("marchaCoche");
        Reloj r = null;
        Controlador instance = null;
        instance.marchaCoche(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
