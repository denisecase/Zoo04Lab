/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *Test Panther using JUnit5
 * @author Pinninti Harshika
 */
public class PantheraTest {
     private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public PantheraTest() {
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
     * Test speak method, of class Panther
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I am Panthera";
        var Panthera = new Panthera("Harshika");
        Panthera.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method , for the Panther
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I can eat and walk";
        var Panthera = new Panthera("Harshika");
        Panthera.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function PantheraAddition()
     *
     * @throws Exception
     */
    
    @Test
    public void testPantheraAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double a = 6.0;
        int b = 9;
        double expected = 15.0;

        // call function to get the actual
        var Panthera = new Panthera("Tommy");
        double actual = Panthera.getPantheraAddition(a, b);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
    



