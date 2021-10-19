/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * Provides methods to create and run a group of StringRay.
 * @author Saikrishna Vuppala
 */
public class StringRay extends Animal {
    /**
     * 
     * @param name 
     */

    public StringRay(String name) {
        super(name);
    }

   // @Override
    public void swim() {
        System.out.println("I swim in water");
    }

    @Override
    public void move() {
        System.out.println("When I move I swim");
    }
    @Override
    public void speak() {
        System.out.println("I speak shhh..");
    }
    
    
    public void confess() {
        double a = 3.5;
        int b = 3;
        double c = getStringRayAddition(a, b);
        System.out.printf("I know FloppyAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    public double getStringRayAddition(double valueOne, int valueTwo) {
    return valueOne + valueTwo;
    }

    /**
    * Enum function with plant values
    *
    */
    public enum Times {
        MORNING,
        EVENEING,
        NIGHT;
    }

    /**
    * Main method
    * @param args
    */
    public static void main(String[] args) {
        var sr = new StringRay("Sai");
        sr.speak();
        sr.move();
        sr.swim();
        for (Times times : Times.values()) {
            System.out.println(times);
        }
    }
    
}
