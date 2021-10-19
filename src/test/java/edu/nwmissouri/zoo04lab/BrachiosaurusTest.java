package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Jayanth Naramsetty
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
 * Test Brachiosaurus using JUnit5
 *
 * @author Jayanth Naramsetty
 */
public class BrachiosaurusTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public BrachiosaurusTest() {
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
     * Test speak method, of class Brachiosaurus.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I can Roar,Grunts,Hisses,Squeaks";
        var brachiosaurus = new Brachiosaurus("Allie");
        brachiosaurus.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Brachiosaurus.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "i walk all around the land";
        var brachiosaurus = new Brachiosaurus("Allie");
        brachiosaurus.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function BrachiosaurusAddition()
     *
     * @throws Exception
     */
    @Test
    public void testBrachiosaurusAddition() throws Exception {

        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var Brachiosaurus = new Brachiosaurus("Allie");
        double actual = Brachiosaurus.getBrachiosaurusAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
