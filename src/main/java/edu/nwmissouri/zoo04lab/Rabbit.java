/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *This is Rabbit class which extends Animal class
 * @author Keerthana Ragut
 */
public class Rabbit extends Animal {

    /**
     * 
     * @param name of the Rabbit
     */
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I'm a Rabbit!");
    }

    @Override
    public void move() {
        System.out.println("I hop");
    }
    //@Override
    public void favfood() {
        System.out.println("I Love eating Clover!!");
    }

    //@Override
    public void skintype() {
        System.out.println("I am very soft and fur");
    }

    //@Override
    public void color() {
        System.out.println("I can be White or Brown!!");
    }
    /**
     ** Custom cal function
     *
     * @param m double input
     * @param n int input
     *
     */
    public void cal() {
        double m = 4.0;
        int n = 2;
        double o = getRabbitAdd(m, n);
        System.out.printf("I know RabbitAddition! %4.2f plus %d is %4.2f \n", m, n, o);
    }

    public double getRabbitAdd(double m, int n) {

        return m + n;
    }

    /**
     * Enum function with FOODHabits values
     *
     */
    public enum FoodHabits {
        CARNIVORES,
        HERBIVORES,
        OMNIVORES,
        OTHERS;

    }

    public static void main(String[] args) {
        var par = new Rabbit("Keerthana");
        par.speak();
        par.move();
        par.favfood();
        par.skintype();
        par.color();
        par.cal();
        for (FoodHabits foodhabit : FoodHabits.values()) {
            System.out.println(foodhabit);
        }

    }
}
