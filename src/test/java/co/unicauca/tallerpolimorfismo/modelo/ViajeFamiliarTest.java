/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author JuanMZ
 */
public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of descripcion method, of class ViajeFamiliar.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeFamiliar instance = new ViajeFamiliar(3);
        String expResult = "viaje para disfrutar con toda tu familia";
        String result = instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeFamiliar.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeFamiliar instance = new ViajeFamiliar(3);
        String expResult = "Método implementado en la clase hija ViajeFamiliar";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testGetFamilia() {
        System.out.println("getFamilia");
        ViajeFamiliar instance = new ViajeFamiliar(3);
        int expResult = 3;
        int result = instance.getFamilia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFamilia method, of class ViajeFamiliar.
     */
    @Test
    public void testSetFamilia() {
        System.out.println("setFamilia");
        int familia = 3;
        ViajeFamiliar instance = new ViajeFamiliar(3);
        instance.setFamilia(familia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
