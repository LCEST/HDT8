/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class MetodosTest {
    
    public MetodosTest() {
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
     * Test of agregar method, of class Metodos.
     */
    @Test
    public void testAgregar() throws Exception {
        Lector lector = new Lector();
        String[] listPac = lector.getText();
        System.out.println("agregar");
        VectorHeap<Paciente> heap = null;
        Metodos instance = new Metodos();
        instance.agregar(heap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of quitar method, of class Metodos.
     */
    @Test
    public void testQuitar() {
        System.out.println("quitar");
        VectorHeap<Paciente> heap = null;
        Metodos instance = new Metodos();
        instance.quitar(heap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarJV method, of class Metodos.
     */
    @Test
    public void testAgregarJV() throws Exception {
        System.out.println("agregarJV");
        Metodos instance = new Metodos();
        instance.agregarJV();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
