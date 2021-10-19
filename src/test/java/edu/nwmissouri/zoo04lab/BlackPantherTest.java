package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test BlackPanther using JUnit5
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class BlackPantherTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public BlackPantherTest() {
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
     * Test speak method, of class BlackPanther.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Hemanth. I'm an BlackPanther!";
        var blackPanther = new BlackPanther("Hemanth");
        blackPanther.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class BlackPanther.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I run, run, run.";
        var blackPanther = new BlackPanther("Hemanth");
        blackPanther.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function blackPantherAddition()
     *
     * @throws Exception
     */
    @Test
    public void testBlackPantherAddition() throws Exception {

        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var blackPanther = new BlackPanther("Allie");
        double actual = blackPanther.getBlackPantherAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
