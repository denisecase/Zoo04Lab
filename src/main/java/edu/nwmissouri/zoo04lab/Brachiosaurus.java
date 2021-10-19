/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * Brachiosaurus class creation and extends with Animal class
 * @author Jayanth Naramsetty
 */
public class Brachiosaurus extends Animal{
    enum vehicles{
      bike,
      car,
      plane
    }
    
    /**
     *Brachiosaurus declaration
     * @param name
     */
    public Brachiosaurus(String name){
        super(name);
    }

    /**
     *speak() method
     */
    public void speak(){
            System.out.println("I can Roar,Grunts,Hisses,Squeaks");
        }

    /**
     *move() method
     */
    public void move(){
            System.out.println("i walk all around the land ");
        }
    
     public void profes(){
     double a = 2.5;
     int b = 2;
     double c = getBrachiosaurusAddition(a,b);
     System.out.printf("I know Brachiosaurus addition! %4.2f plus %d is %4.2f \n",a,b,c);
    }
    /**
     *facts() methods
     */
    public void facts(){
            System.out.println("WE are group of reptiles that have lived on Earth\nfor about 245 million years. ");
        }

    double getBrachiosaurusAddition(double first, int second) {
        return first+second; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        var a = new Brachiosaurus("Tester");
        a.speak();
        a.move();
        a.profes();
        vehicles one = vehicles.bike;
        vehicles two = vehicles.car;
        vehicles three = vehicles.plane;
        System.out.println("Vehicles :"+one+" "+two+" "+three+".");
    }
}
