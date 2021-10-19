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
 * Test RelayHorse using JUnit5 
 *
 * @author Bhuvan Chandra Sarakam (S544899)
 */
public class RelayHorseTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public RelayHorseTest() {
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
     * Test of speak method, of class RelayHorse.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Allie. I'm an RelayHorse!";
        var RelayHorse = new RelayHorse("Allie");
        RelayHorse.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class RelayHorse.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I Run, Run, Run.";
        var RelayHorse = new RelayHorse("Allie");
         RelayHorse.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    

    /**
     * Test custom function RelayHorseAddition()
     *
     * @throws Exception
     */
    @Test
    public void testRelayHorseAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var RelayHorse = new RelayHorse("Allie");
        double actual = RelayHorse.getRelayHorseAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
