package edu.nwmissouri.zoo04lab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class Floppy extends Animal {

    /**
     * Every animal has a name. Class variable name is not private, but
     * protected - only subclass can use it.
     */
    protected String name = "Floppy";

    /**
     * Floppy super constructor
     *
     * @param name - the name of this instance of an animal
     */
    public Floppy(String name) {
        super(name);
    }

    /**
     * speak() - general method for Floppy utterance.
     *
     */
    @Override
    public void speak() {
        System.out.println("I'm a Floppy.");
    }

    /**
     * move() - general method for Floppy utterance.
     *
     */
    @Override
    public void move() {
        System.out.println("When I move, I swim, swim.");
    }
}
