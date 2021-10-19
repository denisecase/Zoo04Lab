
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Himaja Reddy Maddi
 */
public class GiraffeGroupTest {
    
    public GiraffeGroupTest() {
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
     * Test of create method, of class GiraffeGroup.
     */
    @Test
    public void testCreate() {
         int expectedSize = 3;
        int actualSize = GiraffeGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class GiraffeGroup.
     */
    @Test
    public void testRun() {
        GiraffeGroup.create();
        GiraffeGroup.run();
        assertTrue(true);
    }
    
}
