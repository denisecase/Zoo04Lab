/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * This is lioness class which is extended from Animal Class
 *
 * @author Sreebharath Mallampati
 */
public class Lioness extends Animal {

    public enum EatableType {
        Vegeterian,
        NonVegeterian,
        Water
    }

    /**
     * Constructor
     *
     * @author Sreebharath Mallampati
     */
    Lioness(String name) {
        super(name);
    }

    /**
     * This is a main method
     *
     * @author Sreebharath Mallampati
     * @param args
     */
    public static void main(String[] args) {
        Lioness lionessObj = new Lioness("Bharath");
        lionessObj.repeatStrings(3, "Hello");
        lionessObj.checkRepetition();
        lionessObj.move();
        lionessObj.speak();
        System.out.println("I eat " + EatableType.NonVegeterian);
    }

    /**
     * This is a speak method
     *
     * @author Sreebharath Mallampati
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s and I belong Lion family.", this.name);
    }

    /**
     * This method is used to print the moving nature
     *
     * @author Sreebharath Mallampati
     */
    @Override
    public void move() {
        System.out.println("When I move, I hunt, hunt, hunt.\n");
    }

    public String repeatStrings(int times, String word) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += word;
        }
        return result;
    }

    public String checkRepetition() {
        String repeatedString = repeatStrings(6, "Check");
        System.out.println(repeatedString);
        return repeatedString;
    }
}
