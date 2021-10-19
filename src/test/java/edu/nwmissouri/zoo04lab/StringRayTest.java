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
 * @author Saikrishna Vuppala
 */
public class StringRayTest {
    
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    
    public StringRayTest() {
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
     * Test of swim method, of class StringRay.
     */
    /**
     * 
     * @throws Exception 
     */
    @Test
    public void testSwim() throws Exception{
        String expected = "I swim in water";
        var stringRay = new StringRay("sai");
        stringRay.swim();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);    
    }

    /**
     * Test of move method, of class StringRay.
     */
    /**
     * 
     * @throws Exception 
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move I swim";
        var stringRay = new StringRay("Sai");
        stringRay.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);   
    }

    /**
     * Test of speak method, of class StringRay.
     */
    @Test
    public void testSpeak() {
        String expected = "I speak shhh..";
        var stringRay = new StringRay("Sai");
        stringRay.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
     /**
     * Test custom function PantheraAddition()
     *
     * @throws Exception
     */
    
    @Test
    public void testStringRayAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double a = 6.0;
        int b = 9;
        double expected = 15.0;

        // call function to get the actual
        var StringRay = new StringRay("Tommy");
        double actual = StringRay.getStringRayAddition(a, b);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }
    
}
