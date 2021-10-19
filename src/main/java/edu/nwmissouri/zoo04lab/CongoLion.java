/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Akshay krishna kintali
 * 
 */
//Inheritance taking place here
public class CongoLion extends Animal {
    enum COLOUR
            {
        BROWN,
        RED,
        YELLOW
        
        
     }

    public CongoLion(String name) 
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
   @Override
    public void speak()
    {
        System.out.println("I sounds as roar");
    }
   
   //place method created for lion
    public void place()
    {
        System.out.println("I generally lives in Africa");
    }
    @Override
    public void move()
    {
        System.out.println("I move with four legs");
    }
    public String name(String s,String n){
        return s+n;
        
    }
    public void display(){
        System.out.println("my name:"+name("akshay","kintali"));
    }
     public static void main(String[] args) {
        CongoLion CL = new CongoLion("Kintali");
        CL.speak();
        CL.move();
        CL.name("akshay","kintali");
        CL.display();
        CongoLion.COLOUR R1=CongoLion.COLOUR.BROWN;
        CongoLion.COLOUR R2=CongoLion.COLOUR.RED;
        CongoLion.COLOUR R3=CongoLion.COLOUR.YELLOW;
        System.out.println("enums:"+R1+"\n"+R2+"\n"+R3);
        
        
        
    }
    
    
}
