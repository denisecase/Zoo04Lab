/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04lab;


import java.io.PrintStream;

import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class RoaringLionTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public RoaringLionTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test speak method, of class RoaringLion.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I am a Roaring Lion, I love to Roar.";
        RoaringLion roaringLion = new RoaringLion("Roaring Lion");
        roaringLion.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class RoaringLion.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I run for Haunting";
        RoaringLion roaringLion = new RoaringLion("Roaring Lion");
        roaringLion.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function lionAddition()
     *
     * @throws Exception
     */
    @Test
    public void testLionAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        RoaringLion roaringLion = new RoaringLion("Roaring Lion");
        double actual = roaringLion.getLionAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
