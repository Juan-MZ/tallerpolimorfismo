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
public class ViajeIncentivoTest {
    
    public ViajeIncentivoTest() {
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
     * Test of getEmpresa method, of class ViajeIncentivo.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        ViajeIncentivo instance = new ViajeIncentivo("emtel");
        String expResult = "emtel";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpresa method, of class ViajeIncentivo.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String empresa = "emtel";
        ViajeIncentivo instance = new ViajeIncentivo("emtel");
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of descripcion method, of class ViajeIncentivo.
     */
    @Test
    public void testDescripcion() {
        System.out.println("descripcion");
        ViajeIncentivo instance = new ViajeIncentivo("emtel");
        String expResult = "Viaje incentivo que te envía la empresa "+ instance.getEmpresa();
        String result = instance.descripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cualquierMetodo2 method, of class ViajeIncentivo.
     */
    @Test
    public void testCualquierMetodo2() {
        System.out.println("cualquierMetodo2");
        ViajeIncentivo instance = new ViajeIncentivo("emtel");
        String expResult = "Método implementado en la clase hija viaje de incentivo";
        String result = instance.cualquierMetodo2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
