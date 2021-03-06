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
 * @author Nikhil Porika
 */
public class DalmatianGroupTest {

    public DalmatianGroupTest() {
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
     * Test of create method, of class DalmatianGroup
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = DalmatianGroup.create();
        assertEquals(expectedSize, actualSize);

    }

    /**
     * Test of run method, of class DalmatianGroup.
     */
    @Test
    public void testGroupRun() {

        DalmatianGroup.create();
        DalmatianGroup.run();
        assertTrue(true);

    }

}
