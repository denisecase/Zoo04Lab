/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

enum Places{
    KERALA,
    DELHI,
    MANALI,
    HYDERABAD,
    CHENNAI,
   
}
/**
 * Gerenuk class (derived subclass of the superclass Animal)
 *
 * @author Tejaswini Challa
 */
public class Gerenuk extends Animal {
   
    /**
     * Gerenuk constructor
     *     
     * @param name - the name of this Gerenuk
     */
   public Gerenuk(String name)
   {
      super(name);
   }
    @Override
   public void speak()
    {
        System.out.printf("I'm %s. I'm an Aardvark!", this.name);
    }
   @Override
   public void move()
   {
       System.out.println("I can move with four legs");
   }
  
    public void size()
    {
        System.out.println("140 to 160 CENTIMETERS");
    }
    public void place()
    {
        System.out.println("Exists in Kenya");
    }
   public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getGerenukAddition(a, b);
        System.out.printf("I know GerenukAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom Gerenuk function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getGerenukAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }
    /**
     * Enum function with plant values
     * 
     */
    public enum Gender {
        Male,
        Female,
        Other,
    }
    /**
     * Main method
     * @param args 
     */
    
     public static void main(String[] args) {
        var a = new Gerenuk("Tester");
        a.speak();
        a.move();
         a.size();
         a.place();
        a.profess();
        System.out.println("My favourite place is "+Places.HYDERABAD);
     }
    
    }
