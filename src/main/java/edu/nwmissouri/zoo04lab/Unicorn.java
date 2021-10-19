/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Sujithreddy
 */
public class Unicorn extends Animal {

    public enum UnicornGender {
        Male,
        Female
    }

    /**
     * unicorn constructor
     *
     * @param name - the name of this instance of an animal
     */
    public Unicorn(String name) {
        super(name);
    }
    
    public static void main(String[] args){
        Unicorn unicorn = new Unicorn("animal");
        unicorn.calculateAreaOfCircle(4);
        unicorn.getAreaOfCircle();
        System.out.println("Hi, I'm "+ UnicornGender.Male);
    }

    @Override
    public void move() {
        System.out.println("I will climb trees ");
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an unicorn! \n", this.name);
    }

    public double calculateAreaOfCircle(double radius) {
        return Math.PI * radius *radius;
    }

    public double getAreaOfCircle() {
        double areaOfCircle = calculateAreaOfCircle(4);
        System.out.println("The area of circle with radius 4 is " + areaOfCircle);
        return areaOfCircle;
    }

}
