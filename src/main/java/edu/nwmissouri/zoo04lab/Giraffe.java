/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *Giraffe class (derived subclass of the superclass Animal)
 * 
 * @author Himaja Reddy Maddi
 */
public class Giraffe extends Animal {

    /**
     * Giraffe constructor
     *
     * @param name - the name of this Giraffe
     */
    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm giraffe!", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I run, run, run.");

    }

    /**
     * Custom Giraffe function for performing an operation
     *
     * 
     */
    public void multiply() {
        double a = 1.5;
        int b = 4;
        double c = getGiraffeMultiplication(a, b);
        System.out.printf("I know GiraffeMultiplication! %4.2f times %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom Giraffe function 
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getGiraffeMultiplication(double leg1, int leg2) {
        return leg1 * leg2;
    }

    public static void main(String[] args) {
        var giraffe = new Giraffe("Spike");
        giraffe.speak();
        giraffe.move();
        giraffe.multiply();
    }


}

