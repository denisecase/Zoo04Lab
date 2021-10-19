/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Manoj Gorantla
 */
public class Kangaroo extends Animal {
    
    public enum Calender
    {
    July,
    August,
    September;
    }

    /**
     *
     * @param name is passing and referring it to super class.
     */
    public Kangaroo(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Kangaroo!\n", this.name);
    }

    @Override
    public void move() {
        System.out.println("In General I can jump but can't run unlike another animals");
    }
    
    public void speed()
    {
        System.out.println("My Maximum speed is 45 MPH");
    }
    
    public void region()
    {
        System.out.println("I am from Australia");
    }
    
    public void calc()
    {
        int g=10;
        double m=12.23;
        double r=(g*m);
        System.out.println("Result of the calculation is "+r);
    }
    
    public double disc(int g, double m)
    {
        return g-(g*(m/100));
    }

    public static void main()
    {
        var k=new Kangaroo("Kiwi");
        k.speak();
        k.speed();
        k.move();
        k.region();
        k.calc();
    }
}
