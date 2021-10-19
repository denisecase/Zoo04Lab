/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * CREATING BEARCAT CLASS EXTENDING THE ANIMAL CLASS
 * 
 * @author Pavan Kumar Atmakuri
 */
public class Bearcat extends Animal {
    
    
    public enum occurFrom{
    INDIA,
    NEPAL,
    BANGLADESH;
    }
    public Bearcat(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I will climb trees :)");
    }

    @Override
    public void speak() {
         System.out.printf("I'm %s. I'm a Bearcat! \n", this.name);
    }
    
    public void breed(){
        System.out.println("I'm Binturong breed");
    }
    
    public void cal(){
        int a=55;
        double p=10;
        double d=discount(a,p);
        System.out.println("After discount the value become:"+d);
    }

    public double discount(int a,double p) {
    return a-(a*(p/100));    
    }
    
    public static void main(String[] args) {
        var a = new Bearcat("Pavan");
        a.speak();
        a.move();
        a.breed();
        a.cal();
    }
    
    
}
