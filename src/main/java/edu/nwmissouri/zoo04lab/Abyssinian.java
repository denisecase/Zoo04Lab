/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Vamsi krishna Areti (S544902)
 */
//class Abyssinian is extending the animal class
public class Abyssinian extends Animal {
    //creating constructor for Abyssinian class
    enum RANK{
        FIRST,
        SECOND,
        THIRD
    }
   public Abyssinian(String name) 
   {
       super(name);
   }
   //overriding the speak method
    @Override
   public void speak()
    {
        System.out.println("I'm Abyssinia.");
    }
   //overriding the eat method
   
    public void eat()
    {
        System.out.println("I eat Purina Pro Plan True Nature Adult Grain Free Natural Salmon & Egg Recipe.");
    }
    //overriding the move method
   @Override
    public void move()
    {
        System.out.println("I walk on four legs.");
    }
    public void visible(){
        System.out.println("Vamsi Krishna Areti");
    }
    public void breed(){
        System.out.println("I am one of the breed from cat family");
    }
     public static void main(String[] args) {
        Abyssinian aby = new Abyssinian("Areti");
        aby.speak();
        aby.move();
        aby.eat();
        aby.visible();
        aby.breed();
        
        RANK RA1=RANK.FIRST;
        RANK RA2=RANK.SECOND;
        RANK RA3=RANK.THIRD;
        System.out.println("enums:"+RA1+"\n"+RA2+"\n"+RA3);
    }
}
