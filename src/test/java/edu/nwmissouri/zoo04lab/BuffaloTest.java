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
 * @author Bhaskar Venkata Prudhvi Bobbala
 */
public class BuffaloTest{
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public BuffaloTest() {
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
     * Test speak method, of class Buffalo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Bobbala. I'm a Buffalo!";
        var Buffalo = new Buffalo("Bobbala");
        Buffalo.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Buffalo.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I usually walk with four legs";
        var Buffalo= new Buffalo("Bobbala");
        Buffalo.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function ardvarkAddition()
     *
     * @throws Exception
     */
    @Test
    public void testBuffaloAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double morningMilkProduction = 2.5;
        double eveningMilkProduction = 0.5;
        double expected = 3;

        // call function to get the actual
        var Buffalo= new Buffalo("Bobbala");
        double actual = Buffalo.getBuffaloAddition(morningMilkProduction, eveningMilkProduction);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }
}
