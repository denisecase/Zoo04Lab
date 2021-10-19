/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Satya Sai Vinuthna Tummala
 */
public class Kangaroov extends Animal {

    /**
     * Kangaroo Constructor
     *
     * @param name - the name of this Kangaroov
     */

    public Kangaroov(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will move with four legs.");
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm a Kangaroo!\n", this.name);
    }

    public void confess() {
        double a = 3.5;
        int b = 3;
        double c = getKangaroovAddition(a, b);
        System.out.printf("I know KangaroovAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom getKangaroovAddtion function
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getKangaroovAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    /**
     * Enum function with food values
     *
     */
    public enum Food {
        Sandwich,
        Burger,
        Icecream,
        Pasta,
        Rice,
        
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Kangaroov kangaroov = new Kangaroov("Satya");
        kangaroov.speak();
        kangaroov.move();

        kangaroov.confess();
        for (Food food : Food.values()) {
            System.out.println(food);
        }
    }
}
