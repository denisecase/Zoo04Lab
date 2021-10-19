package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Vinay Manavarthi
 */
public class KoalaGroupTest {
    
    public KoalaGroupTest() {
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
     * Test of create method, of class KoalaGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = KoalaGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class KoalaGroup.
     */
    @Test
    public void testGroupRun() {
        KoalaGroup.create();
        KoalaGroup.run();
        assertTrue(true);
    }

}
