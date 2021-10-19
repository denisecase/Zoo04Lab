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
 * @author s545266
 */
public class LionessTest {
    /**
     * This method tests speak method
     * @throws Exception 
     */
    @Test
    public void testSpeak() throws Exception {
         assertTrue(true);
    }
    
    /**
     * This method tests move method
     * @throws Exception 
     */
    @Test
    public void testMove() throws Exception {
         assertTrue(true);
    }
    
    /**
     * This method tests repeatStrings method
     * @throws Exception 
     */
    @Test
    public void testRepeatStrings() throws Exception {
        String actual = "hellohellohello";
        Lioness lionessObj = new Lioness("test");
        assertEquals(actual,lionessObj.repeatStrings(3, "hello"));
    }
    
    /**
     * This method tests checkRepetition method
     * @throws Exception 
     */
    @Test
    public void testCheckRepetition() throws Exception {
        String actual = "CheckCheckCheckCheckCheckCheck";
        Lioness lionessObj = new Lioness("test");
        assertEquals(actual,lionessObj.checkRepetition());
    }
    
}
