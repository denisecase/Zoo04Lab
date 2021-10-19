/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class PandaTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public PandaTest() {
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
     * Test of speak method, of class Panda.
     */
    @Test
    public void testSpeak() {
       // System.out.println("speak");
        String expected = "Hi I am a Panda1! I Squeak..";
        var p = new Panda("Panda1");
        p.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Panda.
     */
    @Test
    public void testMove() {
        //System.out.println("move");
        String expected = "I am a lazy animal and love to roll on ground";
        var p = new Panda("Panda1");
        p.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of pandaType method, of class Panda.
     */
//    @Test
//    public void testPandaType() {
//        System.out.println("pandaType");
//        Panda instance = null;
//         var p = new Panda("Panda1");
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of full name method, of class Panda.
     */
    @Test
    public void testFullname() {
        System.out.println("fullname");
        String fname = "RED";
        String lname = "PANDA";
        String expResult = "REDPANDA";
        var p = new Panda("Panda1");
        String result = p.fullname(fname, lname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
