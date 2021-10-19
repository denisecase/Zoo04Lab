/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Vinay Manavarthi
 */

/**
 * This class defines the nature of the koala
 * @author Vinay Manavarthi (S545225)
 */
public class Koala extends Animal {

    enum Climate {
        WINTWR,
        SUMMER,
        FALL;
    }


    public Koala(String name) {
        super(name);
    }

    public void speak() {
           System.out.printf("I'm %s. I'm an Koala!", this.name);
    }

    public void move() {
        System.out.println("Koala movement");
    }
/**
     * This method will initialize the values and calls the sumOfNumbers method
     */
    public void sum() {
        int num1 = 5;
        int num2 = 5;
        int sum = sumOfNumbers(num1, num2);
        System.out.println("The Sum of two numbers is: " + sum);
    }

    public int sumOfNumbers(int a, int b) {
        return a + b;
    }
/**
 * The application's starting  point
 * This is the main method which makes use of sum(),speak(),move().
 * @param args an array of command-line arguments for the application
 */
    public static void main(String[] args) {

        Koala koalaObj = new Koala("Vinay");
        koalaObj.move();
        koalaObj.speak();
        koalaObj.sum();

        Climate weather = Climate.SUMMER;
        System.out.println("I love to leave in " + weather + " season");
    }
}
