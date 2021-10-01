/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.vamsibhogireddy04lab;

/**
 *
 * @author vamsibhogireddy
 */
public class Tiger extends Animal{
    public Tiger(String name) 
   {
       super(name);
   }
    /*
    *method created to detect sound variation
    */
    @Override
   public void speak()
    {
        System.out.println("My name is Tiger.");
    }
   /*
    *method created to indicate size
    */
   @Override
    public void size()
    {
        System.out.println("I am one of the strongest animal in the world");
    }
    /*
    *method created to explain in which place it is going to survive
    */
   @Override
    public void place()
    {
        System.out.println("My existence is in many locations in the world");
    }

    
}
