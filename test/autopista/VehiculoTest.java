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
public class VehiculoTest {
    
    public VehiculoTest() {
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
     * Test of setTiempoEntradaPeaje method, of class Vehiculo.
     */
    @Test
    public void testSetTiempoEntradaPeaje() {
        System.out.println("setTiempoEntradaPeaje");
        int tiempoAhora = 0;
        Vehiculo instance = new Vehiculo();
        instance.setTiempoEntradaPeaje(tiempoAhora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tiempoEntradaPeaje method, of class Vehiculo.
     */
    @Test
    public void testTiempoEntradaPeaje() {
        System.out.println("tiempoEntradaPeaje");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.tiempoEntradaPeaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
