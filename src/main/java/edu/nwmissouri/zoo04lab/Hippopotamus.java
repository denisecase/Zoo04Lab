/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Indu Chinthakuntla
 */
public class Hippopotamus extends Animal {

    private String name;

    public Hippopotamus(String name) {
        super(name);

    }

    @Override
    public void speak() {
        System.out.println("I'm an Hippopotamus!");
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getHippopotamusAddition(a, b);
        System.out.printf("I know HippopotamusAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom Hippopotamus function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getHippopotamusAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        var a = new Hippopotamus("Tester");
        a.speak();
        a.move();
        a.profess();
    }

}


    

