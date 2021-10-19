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
 * @author Sreebharath Mallampati
 */
public class LionessGroupTest {
    /**
     * This methods tests create method
     * throws Exception
     */
    @Test
    public void testCreate() throws Exception {
        int expectedSize = 3;
        int actualSize = LionessGroup.create();
        assertEquals(expectedSize, actualSize);
    }

  /**
   * This method tests run method.
   * throws Exception
   */
    @Test
    public void testRun() throws Exception {
        LionessGroup.create();
        LionessGroup.run();
        assertTrue(true);
    }
}
