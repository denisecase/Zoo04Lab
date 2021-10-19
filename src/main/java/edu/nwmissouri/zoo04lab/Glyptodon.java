/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 * Glyptodon Class derived from animal class
 * 
 * @author Manish Goud Bandharapu 
 */
public class Glyptodon extends Animal{
    enum animal {
        lion,
        tiger,
        deer
        }
    
    /**
     * 
     * Animal addition
     * @param name
     */
    public Glyptodon(String name){
        super(name);
    }
    
    /**
     * Animal speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm Manish. I'm an Glyptodon!",this.name);
    }
    
    /**
     * Animal move
     */
    @Override()
    public void move() {
        System.out.println("move move move \n");
        
    }
    public void profes(){
        double a = 2.5;
        int b = 2;
        double c = getGlyptodonAddition(a,b);
        System.out.printf("I know Glyptodon addition! %4.2f plus %d is %4.2f \n",a,b,c);
    }
    
    double getGlyptodonAddition(double first, int second) {
        return first+second; //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        var a = new Glyptodon("Tester");
        a.speak();
        a.move();
        a.profes();
        animal R1=animal.lion;
        animal R2=animal.tiger;
        animal R3=animal.deer;
        System.out.println("enums:"+R1+"\n"+R2+"\n"+R3);
    }
}
