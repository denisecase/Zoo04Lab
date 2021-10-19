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
 * Test ElephantBirds using JUnit5
 *
 * @author Hemanth Kumar Reddy Pidaparathy
 */
public class ElephantBirdTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public ElephantBirdTest() {
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
     * Test speak method, of class ElephantBird.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Heman. I'm an ElephantBird!";
        var elephantBird = new ElephantBird("Heman");
        elephantBird.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class ElephantBird.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I run,run,run.";
        var elephantBird = new ElephantBird("Heman");
        elephantBird.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function ElephantBirdAddition()
     *
     * @throws Exception
     */
    @Test
    public void testElephantBirdAddition() throws Exception {

        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var elephantBird = new ElephantBird("Heman");
        double actual = elephantBird.getElephantBirdAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
