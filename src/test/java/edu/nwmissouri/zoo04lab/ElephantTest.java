/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * This is used to explain test group of Elephant test group
 * Test Elephant using JUnit5
 *
 * @author Homakesavadurgaprasad OMTRI (S544929)
 */
public class ElephantTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public ElephantTest() {
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
     * Test speak method, of class Elephant.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSpeak() throws Exception {
        String expected = "I'm Lobby.I'm an Elephant!";
        var Elephant = new Elephant("Lobby");
        Elephant.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test move method, of class Elephant.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMove() throws Exception {
        String expected = "I could not able to swim in water but would like to walk!.";
        var Elephant = new Elephant("Lobby");
        Elephant.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test custom function elephantAddition()
     *
     * @throws Exception
     */
    @Test
    public void testElephantAddition() throws Exception {

        // set up test, figure out expected by hand
        double first = 5.0;
        int second = 10;
        double expected = 15.0;

        // call function to get the actual
        var Elephant = new Elephant("Lobby");
        double actual = Elephant.getElephantAddition(first, second);

        // assertEquals(expected, actual);
        assertEquals(expected, actual);
    }

}
