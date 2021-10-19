/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This is the Test of MightyLion Group.
 * 
 * @author Vijay Kumar Chunchu
 */
public class MightyLionGroupTest {

    //public MightyLionGroupTest() {
    

    @BeforeAll
    public static void huntClass() {
    }

    @AfterAll
    public static void chaseClass() {
    }

    @BeforeEach
    public void hunt() {
    }

    @AfterEach
    public void chase() {
    }

    /**
     * This is the Test of create method, of MightyLionGroup class.
     */
    @Test
    public void testGroupcreate() {
        int expectedSize = 3;
        int actualSize =  MightyLionGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * This is the Test of run method, of MightyLionGroup class.
     */
    @Test
    public void testGroupRun() {
         MightyLionGroup.create();
         MightyLionGroup.run();
        assertTrue(true);
    }

}
