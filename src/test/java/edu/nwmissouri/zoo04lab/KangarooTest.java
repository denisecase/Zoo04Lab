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
 * @author s545503
 */
public class KangarooTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    public KangarooTest() {
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
     * Test of speak method, of class Kangaroo.
     */
    @Test
    public void testSpeak() {
       String eo="I'm Manoj. I'm an Kangaroo!";
       var kg=new Kangaroo("Manoj");
       kg.speak();
       String oo=outputStreamCaptor.toString().trim();
       assertEquals(eo, oo);
       
    }

    /**
     * Test of move method, of class Kangaroo.
     */
    @Test
    public void testMove() {
        String eo="In General I can jump but can't run unlike another animals";
        var kg=new Kangaroo("Manoj");
        kg.move();
        String oo=outputStreamCaptor.toString().trim();
        assertEquals(eo,oo);
        
    }

    /**
     * Test of speed method, of class Kangaroo.
     */
    @Test
    public void testSpeed() {
        String eo="My Maximum speed is 45 MPH";
        var kg=new Kangaroo("Manoj");
        kg.speed();
        String oo=outputStreamCaptor.toString().trim();
        assertEquals(eo,oo);
        
    }

    /**
     * Test of region method, of class Kangaroo.
     */
    @Test
    public void testRegion() {
        String eo="I am from Australia";
        var kg=new Kangaroo("Manoj");
        kg.region();
        String oo=outputStreamCaptor.toString().trim();
        assertEquals(eo,oo);
        
    }

    /**
     * Test of calc method, of class Kangaroo.
     */
    @Test
    public void testCalc() {
         int g=10;
        double m=12.23;
        double eo=8.777;
        var kg=new Kangaroo("Manoj");
        double r=kg.disc(g, m);
        assertEquals(eo,r);
    }

    /**
     * Test of disc method, of class Kangaroo.
     */
    @Test
    public void testDisc() {
        System.out.println("disc");
        int g = 0;
        double m = 0.0;
        Kangaroo instance = new Kangaroo("Manoj");
        double expResult = 0.0;
        double result = instance.disc(g, m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Kangaroo.
     */
    
    
}
