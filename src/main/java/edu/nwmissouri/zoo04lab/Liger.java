/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author RevanthPagilla
 */
public class Liger extends Animal {
    /**
     * Liger constructor
     * @param name - the name of this instance of an animal
     */
    
    public Liger(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will climb trees ");
    }

    @Override
    public void speak() {
         System.out.printf("I roar very loudly! \n", this.name);
    }
    
    
    public void eat() {
         System.out.printf("I hunt very badly \n", this.name);
    }
     
    /**
     * Custom Liger function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getLigerAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        var a = new Liger("Tester");
        a.speak();
        a.move();
        a.eat();
    }

}


