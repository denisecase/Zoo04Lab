/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

import java.util.Scanner;



/**
 *
 * @author Srilekha Janagam
 */
public class Cheetah extends Animal {

    /**
     * Cheetah constructor 
     * @param name - the name of this aardvark
     */
    public Cheetah(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Aardvark!", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");;//To change body of generated methods, choose Tools | Templates.
    }
    
    public void diet() {
        System.out.println("When I move, I walk, walk, walk.");;//To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String message=scan.nextLine();
        
      Cheetah obj=new Cheetah(message);
      obj.speak();
      obj.move();
      obj.diet();
      
        
    }
    
    
}

