package edu.nwmissouri.mummadi04lab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class is about RedDeer extends Animal
 *
 * @author Hari Hara Mummadi
 */
public class RedDeer extends Animal {

    /**
     * Constructor for RedDeer
     *
     * @param name name of instance of RedDeer
     */
    public RedDeer(String name) {
        super(name);
    }

    /**
     * Method for deer()
     */
    public void deer() {
        System.out.println("Welcome to Animal Zoo");
    }

    /**
     * Method for move()
     */
    @Override
    public void move() {
        System.out.println("I run on my 4 legs!");
    }

    /**
     * Method for sound()
     */
    @Override
    public void sound() {
        System.out.printf("I'm %s.I'm an Deer!\n", this.name);
    }

    /**
     * Method for habitat()
     */
    @Override
    public void habitat() {
        System.out.println("I Live in Zoo & Forest");
    }

    /**
     * Method for feed()
     */
    public void feed() {
        System.out.println("I Feed on Grass\n");
    }
}
