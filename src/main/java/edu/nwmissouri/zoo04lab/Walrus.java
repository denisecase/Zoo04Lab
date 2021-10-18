/*To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * Walrus class,derived subclass from the superclass Animal)
 * @author Rehaman Naguru Abdur
 */
public class Walrus extends Animal {

    static double getWalrusAddition(double first, int second) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
      return first + second ;
    }


    //@param name
    public Walrus(String name) { // walrus constructor with parameter
        super(name);
    }

    

     @Override
    public void speak() {//method
        System.out.println("I'm walrus, I growls, taps and make bell-like sounds below water.");
    }

    @Override
    public void move() { //method
        System.out.println("I move move and run");
    }
    
     public void intro() {
        System.out.println("I'm an Walrus");
    }
    
    
    public void about() {
        System.out.println("I am a sea animal");
    }

}
