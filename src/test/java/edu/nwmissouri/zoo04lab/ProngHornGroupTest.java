/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test ProngHorn Group.
 * 
 * @author Alekhya Gandra
 */
public class ProngHornGroupTest {

    public ProngHornGroupTest() {
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
     * Test of create method, of class ProngHornGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = ProngHornGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class ProngHornGroup.
     */
    @Test
    public void testGroupRun() {
        ProngHornGroup.create();
        ProngHornGroup.run();
        assertTrue(true);
    }

}
