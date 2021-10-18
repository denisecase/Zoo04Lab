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
 * Test Aardvark using JUnit5
 *
 * @author Denise Case
 */
public class CheetahTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public CheetahTest() {
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
     * Test speak method, of class Cheetah.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Chase. I'm an Cheetah!";
        var cheetah = new Cheetah("Chase");
        cheetah.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Cheetah.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I walk, walk, walk.";
        var cheetah = new Cheetah("Allie");
        cheetah.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function cheetahAddition()
     *
     * @throws Exception
     */
    @Test
    public void testCheetahAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
       int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var cheetah = new Cheetah("Allie");
        double actual = cheetah.getCheetahAddition(first, second);


        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
