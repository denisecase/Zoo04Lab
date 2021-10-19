/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *Test Aardvark using JUnit5
 * 
 * @author Rahul Konda
 */
public class StagTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public StagTest() {
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
     * Test of eat method, of class Stag.
     */
    @Test
    public void testEat() {
        String expected = "I'm CARNIVOROUS, I eat grass.";
        var stag = new Stag("Konda");
        stag.eat();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test speak method, of class Stag.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() {
        String expected = "I'm a STAG, I have LONG HORNS!";
        var stag = new Stag("Konda");
        stag.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Stag.
     */
    @Test
    public void testMove() {
        String expected = "When I feel SUSPICIOUS, I RUN very fast!";
        var stag = new Stag("Konda");
        stag.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of color method, of class Stag.
     */
    @Test
    public void testColor() {
        String expected = "I'm brown in colour with white spots on me";
        var stag = new Stag("Konda");
        stag.color();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class Stag.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Stag.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    /**
     * 
     * @throws Exception 
     */
    @Test
    public void testStagAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 4.0;
        int second = 10;
        double expected = 14.0;

        // call function to get the actual
        var stag = new Stag("Konda");
        double actual = stag.getStagAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

    
}
