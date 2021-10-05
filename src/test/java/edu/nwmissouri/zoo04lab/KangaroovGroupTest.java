package edu.nwmissouri.tummala04lab;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Kangaroov Group.
 * 
 * @author Satya Sai Vinuthna Tummala
 */
public class KangaroovGroupTest {
   
    public KangaroovGroupTest() {
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
     * Test of create method, of class KangaroovGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = KangaroovGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class KangaroovGroup.
     */
    @Test
    public void testGroupRun() {
        KangaroovGroup.create();
        KangaroovGroup.run();
        assertTrue(true);
    }

}
 
