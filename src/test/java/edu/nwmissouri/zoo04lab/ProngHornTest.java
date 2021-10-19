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
 * Test ProngHorn using JUnit5
 *
 * @author Alekhya Gandra
 */
public class ProngHornTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public ProngHornTest() {
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
     * Test speak method, of class ProngHorn.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Prog. I'm a ProngHorn!";
        var pronghorn = new ProngHorn("Prog");
         pronghorn.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class .ProngHorn
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I walk, walk, walk.";
        var pronghorn = new ProngHorn("Prog");
        pronghorn.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function testProngHornAddition()
     *
     * @throws Exception
     */
    @Test
    public void testProngHornAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 4.0;
        int second = 1;
        double expected = 5.0;

        // call function to get the actual
        var pronghorn = new ProngHorn("Prog");
        double actual = pronghorn.getProngHornAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }
    
 


}
