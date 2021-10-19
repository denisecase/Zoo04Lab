/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author S545113
 */
public class Xraytetra extends Animal {

    /* This is parameter constructor which initialize the instance variables according to parameters passed
 * @param name is passed to the constructor
 * 
     */
    public Xraytetra(String name) {
        super(name);
    }

    /**
     * This is speak method which is used to to print the message print the
     * statement
     */
    @Override
    public void speak() {
        System.out.println("I am Xraytetra");
    }

    /**
     * This is move method which is used to to print the message print the
     * statement
     */
    @Override
    public void move() {
        System.out.println("I can swim");
    }

    /**
     * location function
     */
    public void location() {
        System.out.println("I live in water!");
    }

    /**
     * character function
     */
    public void character() {
        System.out.println("The xraytetra has a base of different shades of yellow tail.");
    }

    /**
     ** Custom profess function
     *
     * @param valueOne double input
     * @param valueTwo int input
     *
     */
    public void profess() {
        double a = 4.5;
        int b = 4;
        double c = getXraytetraAddition(a, b);
        System.out.printf("I know XraytetraAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom getXraytetraAddtion function
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getXraytetraAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    /**
     * Enum function with plant values
     *
     */
    public enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Xraytetra xraytetra = new Xraytetra("Shashankaravi");
        xraytetra.speak();
        xraytetra.move();
        xraytetra.location();
        xraytetra.character();
        xraytetra.profess();
        for (Days days : Days.values()) {
            System.out.println(days);
        }
    }
}
