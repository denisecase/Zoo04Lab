//package edu.nwmissouri.zoo04lab;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
///**
// * Test Aardvark using JUnit5 
// *
// * @author Rohan Kondaveeti
// */
//public class GoatTest {
//
//    private final PrintStream standardOut = System.out;
//    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//
//    public GoatTest() {
//    }
//
//    @BeforeAll
//    public static void setUpClass() {
//    }
//
//    @AfterAll
//    public static void tearDownClass() {
//    }
//
//    @BeforeEach
//    public void setUp() {
//        System.setOut(new PrintStream(outputStreamCaptor));
//    }
//
//    @AfterEach
//    public void tearDown() {
//    }
//
//    /**
//     * Test of speak method, of class Goat.
//     *
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testSpeak() throws Exception {
//        String expected = "I'm Allie. I'm an Goat!";
//        var goat = new Goat("Allie");
//         goat.speak();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals(expected, actual);
//    }
//
//    /**
//     * Test of move method, of class Goat.
//     *
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testMove() throws Exception {
//        String expected = "When I move, I walk, walk, walk.";
//        var goat = new Goat("Allie");
//         goat.move();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals(expected, actual);
//    }
//
//}
