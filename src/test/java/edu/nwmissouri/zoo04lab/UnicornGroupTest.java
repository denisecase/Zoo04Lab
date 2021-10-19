/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Sujith Reddy Naidu
 */
public class UnicornGroupTest {
    
    
    /**
     * Test of create method, of class UnicornGroup.
     */
    @Test
    public void testCreate() {
        int expectedSize = 3;
        int actualSize = UnicornGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class UnicornGroup.
     */
    @Test
    public void testRun() {
        UnicornGroup.create();
        UnicornGroup.run();
        assertTrue(true);
    }
}
