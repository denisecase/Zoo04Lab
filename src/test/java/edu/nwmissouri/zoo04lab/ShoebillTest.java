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
 * @author Gayatri Devabhaktuni
 */
public class ShoebillTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
   
    
    
    public ShoebillTest() {
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
     * Test of speak method, of class Shoebill.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception{
        String expected = "I'm a Shoebill sound like a Machine Gun!";
        var shoebill = new Shoebill("Gayatri");
        shoebill.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Shoebill.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I fly and walk.";
        var shoebill = new Shoebill("Gayatri");
        shoebill.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of eat method, of class Shoebill.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testEat() throws Exception {
        String expected = "I Love eating Fish";
        var shoebill = new Shoebill("Gayatri");
        shoebill.eat();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
     /**
     * Test custom function ardvarkAddition()
     *
     * @throws Exception
     */ 
     @Test
    public void testShoebillAddition() throws Exception {
        
       
        double first = 5.0;
        int second = 10;
        double expected = 15.0;
        var shoebill = new Shoebill("Shammy");
        double actual;
       
        actual = shoebill.getShoebillAddition(first, second);
        assertEquals(expected, actual);
    }
    
}
