package edu.nwmissouri.zoo04lab;

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
public class StringRayGroupTest {
    
    public StringRayGroupTest() {
    }
        
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class StringRayGroup.
     */
    @Test
    public void testCreate() {
        int expectedSize = 3;
        int actualSize = StringRayGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class StringRayGroup.
     */
    @Test
    public void testRun() {
         StringRayGroup.create();
        StringRayGroup.run();
        assertTrue(true);
        
    }
    
}
