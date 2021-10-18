//package edu.nwmissouri.zoo04lab;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
///**
// *
// * @author Tejaswini Challa
// */
//public class GerenukTest {
//   private final PrintStream standardOut = System.out;
//    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//
//    public GerenukTest() {
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
//     * Test of speak method, of class Gerenuk.
//     *
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testSpeak() throws Exception {
//        String expected = "I'm Allie. I'm an Gerenuk!";
//        var Gerenuk = new Gerenuk("Allie");
//        Gerenuk.speak();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals(expected, actual);
//    }
//
//    /**
//     * Test of move method, of class Gerenuk.
//     *
//     * @throws java.lang.Exception
//     */
//    @Test
//    public void testMove() throws Exception {
//        String expected = "When I move, I walk, walk, walk.";
//        var Gerenuk = new Gerenuk("Allie");
//         Gerenuk.move();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals(expected, actual);
//    }
//
//} 
//
