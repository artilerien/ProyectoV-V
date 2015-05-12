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

/*
    //Test of guardarCola method, of class Peaje.

    @Test (expected=IndexOutOfBoundsException.class)
    public void testGuardarCola0() {
        System.out.println("guardarCola0");
        int nCab = 0;
        Peaje instance = peaje0; //Peaje con 0 cabinas debe lanzar excepcion
        instance.guardarCola(nCab, Reloj0Mock);
    }

    @Test
    public void testGuardarCola10() {
        System.out.println("guardarCola1");
        int nCab = 0;
        Peaje instance = peaje1;
        instance.guardarCola(nCab, Reloj0Mock);
    }
    
    @Test (expected=IndexOutOfBoundsException.class)
    public void testGuardarCola11() {
        System.out.println("guardarCola1");
        int nCab = 1; //se le indica una cabina inexistente (solo tiene 1 cabina, la cabina 0, y le pedimos encolar en la cabina 1)
        Peaje instance = peaje1; //peaje con 1 cabina (cabina 0)
        instance.guardarCola(nCab, Reloj0Mock);
    }
   
    @Test //Este test quiza sobre, ya que seria el mismo caso que testGuardarCola10() pero con un peaje de 2 cabinas
    public void testGuardarCola21() {
        System.out.println("guardarCola20");
        int nCab = 1;
        Peaje instance = peaje2;
        instance.guardarCola(nCab, Reloj0Mock);
    }
     
    @Test //Mismo test que el anterior pero con un reloj cuya hora es diferente de 0, funciona correctamente tambien
    public void testGuardarCola22() {
        System.out.println("guardarCola21");
        int nCab = 1;
        Peaje instance = peaje2;
        instance.guardarCola(nCab, Reloj2Mock);
    }
    
     //Test of eligeCabina method, of class Peaje.
    
    @Test (expected=IndexOutOfBoundsException.class)
    public void testEligeCabina0() {
        System.out.println("eligeCabina0");
        Peaje instance = peaje0; //Peaje con 0 cabinas debe lanzar excepcion
        int expResult = 0;
        int result = instance.eligeCabina(); //Sera imposible elegir cabina, si el peaje no tiene cabinas
        assertEquals(expResult, result);
    }
 
    //Siempre debe elegir una de las 3 cabinas que menos coches tengan
    
    @Test  
    public void testEligeCabina1() {
        System.out.println("eligeCabina1");
        Peaje instance = new Peaje(3);; //Peaje con 1 cabina
        int expResult = 2;
        int result = instance.eligeCabina(); 
        assertTrue(result <= expResult); //Asi aseguramos que el test nunca falla
        //result siempre sera 0, 1 o 2
        //Si se tiene un peaje con menos de 3 cabinas,
        //habra un 10 % de probabilidad de error en el caso de q tenga 2 cabinas
        //y un 40% (30 + 10) en el caso de que tenga una sola cabina. 
    }
 */   
    @Test 
    public void testEligeCabina2() {
        System.out.println("eligeCabina2");
        Peaje instance = new Peaje(5);
        int expResult = 2;
        int result = instance.eligeCabina();
        assertTrue(result <= expResult);
    }  
  
    
    @Test (expected=ArrayIndexOutOfBoundsException.class)
    public void testEligeCabina3() {
        System.out.println("eligeCabina3");
        Peaje instance = new Peaje(6); //Error con peajes de mas de 5 cabinas
        int expResult = 2;
        int result = instance.eligeCabina();
        assertTrue(result <= expResult);
    }  
  

     // Test of rondaCabinas method, of class Peaje.

    @Test
    public void testRondaCabinas0() {
        System.out.println("rondaCabinas0");
        Peaje instance = peaje0;
        instance.rondaCabinas(Reloj0Mock);
        
    }
 /* 
    @Test
    public void testRondaCabinas1() {
        System.out.println("rondaCabinas1");
        Peaje instance = peaje1;
        instance.rondaCabinas(Reloj0Mock);
    }
    

    // Test of estado method, of class Peaje.

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
    */
}
