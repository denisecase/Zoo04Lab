/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gayatri Devabhaktuni
 */
public class ShoebillGroupTest {
    
    public ShoebillGroupTest() {
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
     * Test of create method, of class ShoebillGroup.
     */
    @Test
    public void testCreate() {
       int expectedSize = 3;
        int actualSize = ShoebillGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class ShoebillGroup.
     */
    @Test
    public void testRun() {
        ShoebillGroup.create();
        ShoebillGroup.run();
        assertTrue(true);
    }
    
}
