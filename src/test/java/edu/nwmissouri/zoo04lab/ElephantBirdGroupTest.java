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
 * Test ElephantBird Group.
 * 
 * @author Hemanth Kumar Reddy Pidaparathy
 */
public class ElephantBirdGroupTest {

    public ElephantBirdGroupTest() {
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
     * Test of create method, of class ElephantBirdGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = ElephantBirdGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class ElephantBirdGroup.
     */
    @Test
    public void testGroupRun() {
        ElephantBirdGroup.create();
        ElephantBirdGroup.run();
        assertTrue(true);
    }

}
