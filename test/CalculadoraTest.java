/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import calculo.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franco
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

   // sumar
    @Test
    public void testSuma(){
    int resultado = Calculadora.suma(1014, 1200);
    int esperado = 2214; 
    assertEquals(esperado, resultado);       
    }        
      // conmutativa
    @Test
    public void testSumaConmutativa(){
    int resultado = Calculadora.suma(1200,1014 );
    int esperado = 2214; 
    assertEquals(esperado, resultado);       
    }   
    
    //restar
    @Test
    public void testResta(){
    int resultado = Calculadora.resta(10,3 );
    int esperado = 7; 
    assertEquals(esperado, resultado);       
    }
    
    
    // minuendo menor que sustraendo
    @Test
    public void testRestaMinuendo(){
    int resultado = Calculadora.resta(3, 10);
    int esperado = -7; 
    assertEquals(esperado, resultado);       
    }
    
    
    //Distributiva
    @Test
    public void testDistributiva(){
    int resultado = Calculadora.distributiva(2, 6, 4);
    int esperado = 20; 
    assertEquals(esperado, resultado);    
    }
    
    //Expresion1
    @Test
    public void testExpresion1(){
        int resultado = Calculadora.expresion1(2, 3, 1, 4);
        int esperado = 9;
        assertEquals(esperado, resultado);        
    }
    
    //Expresion2 los parentesis se resuelven prmero
    @Test
    public void testExpresion2(){
        int resultado = Calculadora.expresion2(2, 3, 1, 4);
        int esperado = 25;
        assertEquals(esperado, resultado);        
    }
    
    
}