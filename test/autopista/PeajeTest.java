/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package autopista;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;



/**
 *
 * @author linux1
 */
public class PeajeTest {
    
    @Mock
    private Reloj Reloj0Mock;
 
    @Mock
    private Reloj Reloj1Mock;
    
    @Mock
    private Reloj Reloj2Mock;
    
    
    @Mock
    private Cabina CabinaMock;
    
    @Mock
    private ArrayList<Cabina> CabinasMock;
    
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
        when(Reloj0Mock.tiempoAhora()).thenReturn(0);
        when(Reloj1Mock.tiempoAhora()).thenReturn(1);
        when(Reloj2Mock.tiempoAhora()).thenReturn(2);
        when(CabinaMock.getTotalEsperadoConCola(Reloj0Mock)).thenReturn(1);
        when(CabinaMock.getTotalEsperadoConCola(Reloj1Mock)).thenReturn(2);
        when(CabinaMock.getTotalEsperadoConCola(Reloj2Mock)).thenReturn(3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of guardarCola method, of class Peaje.
     */
    @Test
    public void testGuardarCola0() {
        System.out.println("guardarCola0");
        int nCab = 0;
        Peaje instance = peaje0;
        instance.guardarCola(nCab, Reloj1Mock);
    }

    @Test
    public void testGuardarCola10() {
        System.out.println("guardarCola1");
        int nCab = 0;
        Peaje instance = peaje1;
        instance.guardarCola(nCab, Reloj0Mock);
    }
    
    @Test
    public void testGuardarCola11() {
        System.out.println("guardarCola1");
        int nCab = 1;
        Peaje instance = peaje1;
        instance.guardarCola(nCab, Reloj0Mock);
    }
    
    @Test
    public void testGuardarCola20() {
        System.out.println("guardarCola20");
        int nCab = 0;
        Peaje instance = peaje2;
        instance.guardarCola(nCab, Reloj0Mock);
    }
    
        @Test
    public void testGuardarCola21() {
        System.out.println("guardarCola21");
        int nCab = 1;
        Peaje instance = peaje2;
        instance.guardarCola(nCab, Reloj0Mock);
    }
    
        @Test
    public void testGuardarCola22() {
        System.out.println("guardarCola21");
        int nCab = 2;
        Peaje instance = peaje2;
        instance.guardarCola(nCab, Reloj0Mock);
    }
    
    /**
     * Test of eligeCabina method, of class Peaje.
     */
    @Test
    public void testEligeCabina0() {
        System.out.println("eligeCabina0");
        Peaje instance = peaje0;
        int expResult = 0;
        int result = instance.eligeCabina();
        assertEquals(expResult, result);
    }

    @Test
    public void testEligeCabina1() {
        System.out.println("eligeCabina1");
        Peaje instance = peaje1;
        int expResult = 0;
        int result = instance.eligeCabina();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEligeCabina2() {
        System.out.println("eligeCabina2");
        Peaje instance = peaje2;
        int expResult = 0;
        int result = instance.eligeCabina();
        assertEquals(expResult, result);
    }  
   
    
    /**
     * Test of rondaCabinas method, of class Peaje.
     */
    @Test
    public void testRondaCabinas0() {
        System.out.println("rondaCabinas");
        Peaje instance = peaje0;
        instance.rondaCabinas(Reloj0Mock);
    }

    @Test
    public void testRondaCabinas1() {
        System.out.println("rondaCabinas1");
        Peaje instance = peaje1;
        instance.rondaCabinas(Reloj0Mock);
    }
    
    /**
     * Test of estado method, of class Peaje.
     */
    @Test
    public void testEstado0() {
        System.out.println("estado0");
        Peaje instance = peaje0;
        instance.estado(Reloj0Mock);
    }
 
    @Test
    public void testEstado1() {
        System.out.println("estado1");
        Peaje instance = peaje1;
        instance.estado(Reloj0Mock);
    }
    
    @Test
    public void testEstado2() {
        System.out.println("estado2");
        Peaje instance = peaje2;
        instance.estado(Reloj0Mock);
    }
}
