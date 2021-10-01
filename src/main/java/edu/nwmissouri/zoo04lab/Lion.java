/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.kintali04lab;

/**
 *
 * @author Akshay krishna kintali
 */
//Inheritance taking place here
public class Lion extends Animal {
    public Lion(String name) 
   {
       super(name);
   }

    /**
     *
     */
    //color method created for lion
   public void color()
    {
        System.out.println("I am lion and my color is deep orange brown");
    }
   //sound method created for lion
    public void sound()
    {
        System.out.println("I sounds as roar");
    }
   @Override
   //place method created for lion
    public void place()
    {
        System.out.println("I generally lives in Africa");
    }
    
    
    
}
