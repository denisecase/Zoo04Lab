
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
 * Test Giraffe using JUnit5
 * @author Himaja Reddy Maddi
 */
public class GiraffeTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public GiraffeTest() {
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
     * Test of speak method, of class Giraffe.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception{
        String expected = "I'm Jerry. I'm giraffe!";
        var giraffe = new Giraffe("Jerry");
        giraffe.speak();
        String actual = outputStreamCaptor.toString().trim();
        //System.out.println(actual);
       assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Giraffe.
     * 
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "When I move, I run, run, run.";
        var giraffe = new Giraffe("Spike");
        giraffe.move();
        
        String actual = outputStreamCaptor.toString().trim();
        //String actual = "When I move, I walk, walk, walk.";
       // System.out.println("---------"+actual);
        assertEquals(expected, actual);
    }
    
    /**
     * Test custom function ardvarkAddition()
     *
     * @throws Exception
     */
    @Test
    public void testGiraffeMultiplication() throws Exception {
        
        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var giraffe = new Giraffe("Spike");
        double actual = giraffe.getGiraffeMultiplication(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

    
}
