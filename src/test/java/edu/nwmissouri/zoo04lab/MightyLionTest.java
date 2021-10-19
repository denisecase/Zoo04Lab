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
 * This is the Test of MightyLion using JUnit5
 *
 * @author Vijay Kumar Chunchu
 */

public class MightyLionTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public MightyLionTest() {
    }

    @BeforeAll
    public static void huntClass() {
    }

    @AfterAll
    public static void chaseClass() {
    }

    @BeforeEach
    public void hunt() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void chase() {
    }

    /**
     * This is the Test speak method, of MightyLion class.
     *
     * @throws java.lang.Exception
     */
  
  @Test
    public void testSpeak() throws Exception {
        String expected = "I'm a cango lion";
        var MightyLion = new MightyLion("cango");
        mightylion.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(pride,family);
    }

    /**
     * This is the Test of move method, of MightyLion class.
     *
     * @throws java.lang.Exception
     */
    
@Test
    public void testMove() throws Exception {
        String expected = "I am carnivores and I will hunt the animals";
        var mightylion = new MightyLion("cango lion");
        mightylion.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * This is the Test to custom function mightylionAddition()
     *
     * @throws Exception
     */
    
@Test
    public void testMightyLionAddition() throws Exception {
        
        // set up test, figure out expected by hand
        double age = 3.0;
        int friends = 6;
        double pride= 10.0;

        // call function to get the actual
        var mightylion = new MightyLion("cango");
        double family = mightylion.getMightyLionAddition(age, friends);

        
        assertEquals(pride,family);
    }

}
