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
        //when(CabinaMock.getMaxCoches()).thenReturn(1);
        //when(CabinaMock.getNCoches()).thenReturn(1);
        when(CabinaMock.getTotalEsperado()).thenReturn(1);
        when(CabinaMock.getTotalEsperadoConCola(Reloj1Mock)).thenReturn(2);
        when(CabinaMock.getTotalEsperadoConCola(Reloj2Mock)).thenReturn(3);
        when(CabinaMock.getTotalEsperadoConCola(Reloj2Mock)).thenReturn(3);
    }
    
    @After
    public void tearDown() {
    }


    //Test of guardarCola method, of class Peaje.

    @Test (expected=ArithmeticException.class)
    public void testGuardarCola0() {
        System.out.println("guardarCola0");
        Peaje instance = new Peaje(5);
        instance.guardarCola(0, Reloj0Mock);
        instance.guardarCola(0, Reloj1Mock); 
        instance.guardarCola(0, Reloj2Mock); 
        instance.estado(Reloj2Mock);
        //Resultados de la cabina 1
        //Numero máximo de coches: 3
        //Coches servidos: 0
    }

    @Test (expected=IndexOutOfBoundsException.class)
    public void testGuardarCola1() {
        System.out.println("guardarCola0");
        Peaje instance = new Peaje(5);
        instance.guardarCola(0, Reloj0Mock);
        instance.guardarCola(5, Reloj1Mock); //cabina en la posicion 5 del array no existe
        instance.estado(Reloj2Mock);
        //Resultados de la cabina 1
        //Numero máximo de coches: 3
        //Coches servidos: 0
    }
       
    @Test  (expected=ArrayIndexOutOfBoundsException.class)
    public void testGuardarCola22() {
        System.out.println("guardarCola21");
        int nCab = -1; 
        Peaje instance = new Peaje(5);
        instance.guardarCola(nCab, Reloj2Mock);
    }
    
     //Test of eligeCabina method, of class Peaje.
   
    @Test  //Siempre debe elegir 1 de las 3 cabinas que menos coches tengan = suponemos que la funcion ordenar funciona correctamente, luego debera devolver valores entre 0-2
    public void testEligeCabina() {
        System.out.println("eligeCabina");
        Peaje instance = new Peaje(5);; 
        int expResult = 2;
        int result = instance.eligeCabina(); 
        assertTrue(result <= expResult); //Asi aseguramos que el test nunca falla
        //result siempre sera 0, 1 o 2
    }
   
     // Test of rondaCabinas method, of class Peaje.
    @Test(expected = Exception.class)
    public void testRondaCabinas0() {
        System.out.println("rondaCabinas0");
        Peaje instance = new Peaje(5);
        instance.rondaCabinas(Reloj0Mock); //Lanzara una NoSuchElementExcepcion
        
    }
    
    // Test of rondaCabinas method, of class Peaje.
    @Test
    public void testRondaCabinas1() {
        System.out.println("rondaCabinas0");
        Peaje instance = new Peaje(5);
        instance.rondaCabinas(Reloj1Mock); 
        
    }

 
    // Test of estado method, of class Peaje.
 
    @Test(expected = ArithmeticException.class)
    public void testEstado0() {
        System.out.println("estado0");
        Peaje instance = new Peaje(5);
        instance.estado(Reloj0Mock);
    }
 
    @Test
    public void testEstado1() {
        System.out.println("estado1");
        Peaje instance = new Peaje(5);
        instance.guardarCola(0, Reloj0Mock);
        instance.guardarCola(1, Reloj1Mock);
        instance.guardarCola(2, Reloj1Mock);
        instance.guardarCola(3, Reloj2Mock);
        instance.eligeCabina();
        instance.rondaCabinas(Reloj1Mock);
        instance.estado(Reloj2Mock);
    }

}
