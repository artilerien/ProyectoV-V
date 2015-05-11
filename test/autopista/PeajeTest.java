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
public class PeajeTest {
    
    @Mock
    private Reloj RelojMock;
    
    @Mock
    private Cabina CabinaMock;
    
    Peaje peaje0 = new Peaje(0);
    Peaje peaje1 = new Peaje(1);
    Peaje peaje2 = new Peaje(2);
    
    public PeajeTest() {
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
     * Test of guardarCola method, of class Peaje.
     */
    @Test
    public void testGuardarCola() {
        System.out.println("guardarCola");
        int nCab = 0;
        RelojMock = null;
        Peaje instance = null;
        instance.guardarCola(nCab, RelojMock);
    }

    /**
     * Test of eligeCabina method, of class Peaje.
     */
    @Test
    public void testEligeCabina() {
        System.out.println("eligeCabina");
        Peaje instance = null;
        int expResult = 0;
        int result = instance.eligeCabina();
        assertEquals(expResult, result);
    }

    /**
     * Test of rondaCabinas method, of class Peaje.
     */
    @Test
    public void testRondaCabinas() {
        System.out.println("rondaCabinas");
        Reloj miOrloj = null;
        Peaje instance = null;
        instance.rondaCabinas(miOrloj);
    }

    /**
     * Test of estado method, of class Peaje.
     */
    @Test
    public void testEstado() {
        System.out.println("estado");
        Reloj reloj = null;
        Peaje instance = null;
        instance.estado(reloj);

    }
    
}
