/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * This is the Stag class which extends Animal
 * @author Rahul Konda
 */
public class Stag extends Animal{
    
    /**
     * Stag Constructor
     * @param name - the name of this Stag
     */
    public Stag(String name){
        super(name);
    }
     //@Override
    public void eat(){
        System.out.println("I'm CARNIVOROUS, I eat grass.");
    }


    @Override
    public void speak(){
        System.out.println("I'm a STAG, I have LONG HORNS!");
    }
    @Override
    public void move() {
        System.out.println("When I feel SUSPICIOUS, I RUN very fast!");
    }
     //@Override
    public void color(){
        System.out.println("I'm brown in colour with white spots on me");
    }
    
    /**
     * method for addition
     */
       public void access() {
        double a = 2.5;
        int b = 2;
        double c = getStagAddition(a, b);
        System.out.printf("I know StagAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * 
     * @param valueOne
     * @param valueTwo
     * @return 
     */
    public double getStagAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    
     /**
     * enum function with month values
     * 
     */
    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }
    
    /**
     * Main method to run Stag Class
     * @param args 
     */
    public static void main(String[] args) {
        var a = new Stag("Rahul");
        a.eat();
        a.speak();
        a.move();
        a.color();
    }
}
