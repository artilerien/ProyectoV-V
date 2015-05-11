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
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;
/**
 *
 * @author linux1
 */
public class CabinaTest {
 
    @Mock
    private Reloj RelojMock;
    
    public CabinaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encolarCoche method, of class Cabina.
     */
    @Test
    public void testEncolarCoche() {
        System.out.println("encolarCoche");
        Reloj reloj = null;
        Cabina instance = null;
        instance.encolarCoche(reloj);
    }

    /**
     * Test of servirCabina method, of class Cabina.
     */
    @Test
    public void testServirCabina() {
        System.out.println("servirCabina");
        Reloj reloj = null;
        Cabina instance = null;
        instance.servirCabina(reloj);
    }

    /**
     * Test of getTotalEsperadoConCola method, of class Cabina.
     */
    @Test
    public void testGetTotalEsperadoConCola() {
        System.out.println("getTotalEsperadoConCola");
        Reloj reloj = null;
        Cabina instance = null;
        int expResult = 0;
        int result = instance.getTotalEsperadoConCola(reloj);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxCoches method, of class Cabina.
     */
    @Test
    public void testGetMaxCoches() {
        System.out.println("getMaxCoches");
        Cabina instance = null;
        int expResult = 0;
        int result = instance.getMaxCoches();
        assertEquals(expResult, result);
    }

    /**
     * Test of getproxServ method, of class Cabina.
     */
    @Test
    public void testGetproxServ() {
        System.out.println("getproxServ");
        Cabina instance = null;
        int expResult = 0;
        int result = instance.getproxServ();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNCoches method, of class Cabina.
     */
    @Test
    public void testGetNCoches() {
        System.out.println("getNCoches");
        Cabina instance = null;
        int expResult = 0;
        int result = instance.getNCoches();
        assertEquals(expResult, result);
    }

    /**
     * Test of getServidos method, of class Cabina.
     */
    @Test
    public void testGetServidos() {
        System.out.println("getServidos");
        Cabina instance = null;
        int expResult = 0;
        int result = instance.getServidos();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalEsperado method, of class Cabina.
     */
    @Test
    public void testGetTotalEsperado() {
        System.out.println("getTotalEsperado");
        Cabina instance = null;
        int expResult = 0;
        int result = instance.getTotalEsperado();
        assertEquals(expResult, result);
    }
    
}
