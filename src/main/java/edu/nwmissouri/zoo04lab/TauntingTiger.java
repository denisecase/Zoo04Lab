/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Sarath Arrepu
 */
public class TauntingTiger extends Animal {
    /**
     * This is the parametrized constructor
     * @param name
     */
    public TauntingTiger(String name) {
        super(name);
    }
    /**
     * This method is about the animal speaking
     */
    @Override
    public void speak() {
        System.out.println("I roar");
    }
    /**
     * This method is about the animal movement
     */
    @Override
    public void move() {
        System.out.println("I hunt");
    }
    /**
     * This method is about the animal eating
     */
    @Override
    public void eat() {
        System.out.println("I eat meat");
    }
    /**
     * This method is about the animal type
     */
     public void type() {
        System.out.println("I am a wild animal");
    }
    
    
}
