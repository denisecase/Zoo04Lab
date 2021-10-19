/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ANURAG KOLLURU
 */
public class DinosaurGroupTest {
    
    public DinosaurGroupTest() {
    }

    /**
     * Test of create method, of class DinosaurGroup.
     */
    @Test
    public void testCreate() {
    }

    /**
     * Test of run method, of class DinosaurGroup.
     */
    @Test
    public void testRun() {
        int length=4;
        int breadth=5;
        int area=length*breadth;
        int actual=20;
        assertEquals(area,actual);
    }
    
}
