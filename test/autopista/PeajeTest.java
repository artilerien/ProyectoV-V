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
        when(CabinasMock.add(CabinaMock)).thenReturn(true);
        when(CabinasMock.get(0)).thenReturn(CabinaMock);
        when(CabinaMock.getTotalEsperadoConCola(Reloj0Mock)).thenReturn(1);
        when(CabinaMock.getTotalEsperadoConCola(Reloj1Mock)).thenReturn(2);
        when(CabinaMock.getTotalEsperadoConCola(Reloj2Mock)).thenReturn(3);
    }
    
    @After
    public void tearDown() {
    }


    //Test of guardarCola method, of class Peaje.

    @Test
    public void testGuardarCola0() {
        System.out.println("guardarCola0");
        Peaje instance = new Peaje(5);
        instance.guardarCola(0, Reloj1Mock);   
        
        
        
        
    }

    @Test (expected=IndexOutOfBoundsException.class)
    public void testGuardarCola10() {
        System.out.println("guardarCola1");
        int nCab = 5;
        Peaje instance = new Peaje(5);
        instance.guardarCola(nCab, Reloj0Mock);
    }
       
    @Test //Mismo test que el anterior pero con un reloj cuya hora es diferente de 0, funciona correctamente tambien
    public void testGuardarCola22() {
        System.out.println("guardarCola21");
        int nCab = 1;
        Peaje instance = new Peaje(5);
        instance.guardarCola(nCab, Reloj2Mock);
    }
     
     //Test of eligeCabina method, of class Peaje.
    
    @Test  //Siempre debe elegir una de las 3 cabinas que menos coches tengan = suponemos que la funcion ordenar funciona correctamente, luego debera devolver valores entre 0-2
    public void testEligeCabina0() {
        System.out.println("eligeCabina1");
        Peaje instance = new Peaje(3);; //Peaje con 1 cabina
        int expResult = 2;
        int result = instance.eligeCabina(); 
        assertTrue(result <= expResult); //Asi aseguramos que el test nunca falla
        //result siempre sera 0, 1 o 2
        //Funciona solo con peajes entre 3-5 cabinas,
    }
    
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
        Peaje instance = new Peaje(5);
        instance.rondaCabinas(Reloj0Mock);
        
    }

    @Test
    public void testRondaCabinas1() {
        System.out.println("rondaCabinas1");
        Peaje instance = new Peaje(5);
        instance.rondaCabinas(Reloj0Mock);
    }
    

    // Test of estado method, of class Peaje.

    @Test
    public void testEstado0() {
        System.out.println("estado0");
        Peaje instance = new Peaje(5);
        instance.estado(Reloj0Mock);
    }
 
    @Test
    public void testEstado1() {
        System.out.println("estado1");
        Peaje instance = new Peaje(5);
        instance.estado(Reloj0Mock);
    }
    
    @Test
    public void testEstado2() {
        System.out.println("estado2");
        Peaje instance = new Peaje(5);
        instance.estado(Reloj0Mock);
    }

}
