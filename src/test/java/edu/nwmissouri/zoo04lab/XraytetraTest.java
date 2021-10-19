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
 * Test Xraytetra using JUnit5 
 *
 * @author Shashankaravi Chaparala
 */
public class XraytetraTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public XraytetraTest() {
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
     * Test of speak method, of class Xraytetra.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I am Xraytetra";
        var Xraytetra = new Xraytetra("Allie");
        Xraytetra.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Xraytetra.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I can swim";
        var Xraytetra = new Xraytetra("Allie");
         Xraytetra.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of location method, of class Xraytetra.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testLocation() throws Exception {
        String expected = "I live in water!";
        var xraytetra = new Xraytetra("Shashankaravi");
        xraytetra.location();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of character method, of class Xraytetra.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCharacter() throws Exception {
        String expected = "The xraytetra has a base of different shades of yellow tail.";
        var xraytetra = new Xraytetra("Shashankaravi");
        xraytetra.character();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function ardvarkAddition()
     *
     * @throws Exception
     */
    @Test
    public void testXraytetraAddition() throws Exception {

        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var xraytetra = new Xraytetra("Shashankaravi");
        double actual = xraytetra.getXraytetraAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }
}
