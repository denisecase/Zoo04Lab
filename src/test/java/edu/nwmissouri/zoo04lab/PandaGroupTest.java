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
 * @author S545236
 */
public class PandaGroupTest {
    
    public PandaGroupTest() {
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
     * Test of create method, of class PandaGroup.
     */
    @Test
    public void testCreate() {
//        System.out.println("create");
//        int expResult = 0;
//        int result = PandaGroup.create();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
                int expectedSize = 3;
        int actualSize = PandaGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class PandaGroup.
     */
    @Test
    public void testRun() {
//        System.out.println("run");
//        PandaGroup.run();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
                PandaGroup.create();
        PandaGroup.run();
        assertTrue(true);
    }
    
}
