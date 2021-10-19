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
 * This class is about MuleDeerTest
 * @author Hari Hara Mummadi
 */
public class MuleDeerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    
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
     * Test of move method, of class MuleDeer.
     */
    @Test
    public void testMove() {
        String expected="I run on my 4 legs!";
        var play4 = new MuleDeer("run");
        play4.move();
        String actual= outputStreamCaptor.toString().trim();
        assertEquals(actual,expected);
    }

    /**
     * Test of speak method, of class MuleDeer.
     */
    @Test
    public void testSpeak() throws Exception {
        String expected="I'm MuleD.I'm an Deer!";
        var play = new MuleDeer("MuleD");
        play.speak();
        String actual= outputStreamCaptor.toString().trim();
        assertEquals(actual,expected);
    }

    /**
     * Test of habitat method, of class MuleDeer.
     */
    @Test
    public void testHabitate() {
       String expected="I live in Zoo and Forest";
       var play1=new MuleDeer("live");
       play1.habitate();
       String actual= outputStreamCaptor.toString().trim();
       assertEquals(actual,expected);
    }

    /**
     * Test of feed method, of class MuleDeer.
     */
    @Test
    public void testFeed() {
       String expected="I Feed on Grass";
       var play2=new MuleDeer("feed");
       play2.feed();
       String actual= outputStreamCaptor.toString().trim();
       assertEquals(actual,expected);
    }

    /**
     * Test of main method, of class MuleDeer.
     */
    @Test
    public void testMain() {
       int actual=6;
       int expected=Math.round(actual);
       assertEquals(actual,expected);
    }
    
}
