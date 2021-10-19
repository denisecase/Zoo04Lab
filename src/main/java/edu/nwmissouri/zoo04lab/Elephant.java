/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * This shows "Super plant"
 *
 * @author Homakesavadurgaprasad OMTRI (S544929)
 */
enum SuperPlanet {
    EARTH,
    JUPITER,
    VENUS,
    NEPTUNE,
    URANUS,

}

/**
 * This class defines the nature of the Elephant animal
 */
public class Elephant extends Animal {

    /**
     * This method is used to get the string from the parent class
     *
     * @param name Elephant
     */
    public Elephant(String name) {
        super(name);
    }

    /**
     * This is used to print animal speak
     *
     */
    @Override
    public void speak() {
        System.out.printf(" I'm %s.I'm an Elephant!", this.name);
    }

    /**
     * This is used to print animal move
     *
     */
    @Override
    public void move() {
        System.out.println(" I could not able to swim in water but would like to walk!. ");
    }

    /**
     * This method will initialize the values and calls the sum method
     */
    public void profess() {
        double a = 2.5;
        int b = 5;
        double c = getElephantAddition(a, b);
        System.out.printf("I know ElephantAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * This method will calculate the sum of two numbers
     *
     * @param valueOne which is used to pass value of one in addition
     * @param valueTwo which is used to pass value of two in addition
     * @return it returns the sum of two numbers
     */
    public double getElephantAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    /**
     * The application's entry point This is the main method which makes use of
     * profess,speak,move method.
     *
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {
        Elephant Tommy = new Elephant("Tommy");
        Tommy.speak();
        Tommy.move();
        Tommy.profess();

        System.out.println("My Super Planet is :" + SuperPlanet.EARTH);

    }
}
