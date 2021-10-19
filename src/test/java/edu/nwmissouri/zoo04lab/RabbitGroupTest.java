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
 * @author 
 */
public class RabbitGroupTest {
    
    public RabbitGroupTest() {
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
     * Test of create method, of class RabbitGroup.
     */
    @Test
    public void testCreate() {
        int expectedSize = 3;
        int actualSize = RabbitGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class RabbitGroup.
     */
    @Test
    public void testRun() {
       RabbitGroup.create();
       RabbitGroup.run();
        assertTrue(true);
    }
    }
    

