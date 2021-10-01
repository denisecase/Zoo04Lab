/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.keerthanaRagut04lab;

/**
 *
 * @author Keerthana Ragut
 */
public class Rabbit extends Animal {

    /**
     * 
     * @param name of the Rabbit
     */
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I'm a Rabbit!");
    }

    @Override
    public void favfood() {
        System.out.println("I Love eating Clover!!");
    }

    @Override
    public void skintype() {
        System.out.println("I am very soft and fur");
    }

    @Override
    public void color() {
        System.out.println("I can be White or Brown!!");
    }
}
