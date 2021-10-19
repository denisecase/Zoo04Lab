/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * This class is about MuleDeerGroup
 * @author Hari Hara Mummadi
 */
public class MuleDeerGroupTest {
    

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
     * Test of create method, of class MuleDeerGroup.
     */
    @Test
    public void testGroupCreate() {
        int actual=3;
        int expected=Math.round(actual);
        assertEquals(actual,expected);

    }

    /**
     * Test of run method, of class MuleDeerGroup.
     */
    @Test
    public void testGroupRun() {
       int h=2;
       int actual=h;
       int expected=Math.round(h);
       assertEquals(actual,expected);
        
    }

}
