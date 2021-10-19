/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

enum MagicMonth {
    JAN,
    FEB,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUG,
    SEP,
    OCT,
    NOV,
    DEC,
}

/**
 * Duck class (derived subclass of the superclass Animal)
 * @author Sandhya Nidigonda
 */
public class Duck extends Animal {
    /**
     * Duck constructor 
     * @param name - the name of this Animal is Duck
     */
    public Duck(String name){
        super(name);
    } 
    @Override
     public  void speak() {
        System.out.println("I am Duck named " +this.name);
}
    
     public  void eat() {
        System.out.println("I eat earthworms");
}
    @Override
     public  void move() {
        System.out.println("I use feet to swim");
} 
     /**
      * 
      * Custom Duck function - your class must use a unique function name
      * 
      * @param monthlyEggsProduction
      * @param monthsinYear
      * @return int 
      */
     
     
     public int duckEggsProduction(int monthlyEggsProduction, int monthsinYear)
     {
         return monthlyEggsProduction*monthsinYear;
     }
     
     public void studentDuck(){
         int monthlyEggsProduction=3;
         int monthsinYear =12;
         int yearlyEggsProduction = duckEggsProduction(monthlyEggsProduction,monthsinYear);
         System.out.println("Yearly Eggs Production of Duck is " + yearlyEggsProduction);
     }
     
     public static void main(String[] args){
         Duck d = new Duck("Sandhya");
         d.speak();
         d.move();
         d.eat();
         d.studentDuck();
         
         System.out.println("my MagicMonth is " +MagicMonth.DEC);
         
     }
}
     

