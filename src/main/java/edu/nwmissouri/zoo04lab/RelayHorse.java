/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * RelayHorse class extends from parent class Animal
 *
 * @author BUHVAN CHANDRA SARAKAM S544899
 */
public class RelayHorse extends Animal {
    
    /**
     * RelayHorse constructor
     * @param name - the name of this RelayHorse
     */
    public RelayHorse(String name){
        super(name);
    }
    
    @Override
    public void speak() {
        System.out.printf("\nI'm %s. I'm an RelayHorse!\n", this.name);
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I Run, Run, Run.");
    }
    
    
    public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getRelayHorseAddition(a, b);
        System.out.printf("I know RelayHorseAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom RelayHorse function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getRelayHorseAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }


    public static void main(String[] args) {
        var a = new RelayHorse("Tester");
        a.speak();
        a.move();
        a.profess();
        //a.RelayHorseTracks();
        System.out.println(RelayHorseTracks.SEASHORES);
    }
    
}
