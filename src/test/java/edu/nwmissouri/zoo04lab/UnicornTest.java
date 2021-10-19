/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Sujith Reddy Naidu
 */
public class UnicornTest {


    /**
     * This method tests calculateAreaOfCircle method
     * @throws Exception 
     */
    @Test
    public void testCalculateAreaOfCircle() throws Exception{
        double expected = 2*2*Math.PI;
        Unicorn unicorn = new Unicorn("unicorn");
        double actual = unicorn.calculateAreaOfCircle(2);
        assertEquals(expected, actual);
    }

    /**
     * This method tests getAreaOfCircle method
     * @throws Exception
     */
    @Test
    public void testGetAreaOfCircle() throws Exception {
        double expected = 4*4*Math.PI;
        Unicorn unicorn = new Unicorn("unicorn");
        double actual = unicorn.getAreaOfCircle();
        assertEquals(expected, actual);
    }

}

