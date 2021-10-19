/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * This class is a custom Lion class, which is defining the lion behavior
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class RoaringLion extends Animal {

    enum Weeks {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    /**
     * this constructor passing the animal name to parent class
     *
     * @param name
     */
    public RoaringLion(String name) {
        super(name);
    }

    /**
     * this function prints the animal sound
     */
    public void speak() {
        System.out.println("I am a " + this.name + ", I love to Roar.");
    }

    /**
     * this function prints the animal movement
     */
    public void move() {
        System.out.println("I run for Haunting");
    }

    /**
     * this is a main function where the execution begins
     */
    public static void main(String[] args) {
        RoaringLion roaringLion = new RoaringLion("Roaring Lion");
        roaringLion.speak();
        roaringLion.move();
        roaringLion.lionAddtion();
        
         System.out.println("Most awaiting day in a week: " + Weeks.FRIDAY);
    }

    /**
     * this function is to declare the local variables for to call an actual
     * addition function
     */
    public void lionAddtion() {
        double a = 5.5;
        int b = 7;
        double c = getLionAddition(a, b);
        System.out.printf("I know LionAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * this function returns the sum the two input parameters
     */
    public double getLionAddition(double input1, int input2) {
        return input1 + input2;
    }
}
