/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Bhaskar Venkata Prudhvi Bobbala
 */
public class Buffalo extends Animal {
    enum COLOR
            {
        BLACK,
        BROWN
    }


    /**
     * *
     * Constructor for Buffalo
     *
     * @param name - the name of this Buffalo
     */
    public Buffalo(String name) {
        super(name);
    }

    /**
     * *
     * Override method for buffalo speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm a Buffalo!", this.name);
    }
     
    /**
     * *
     * Override method for buffalo move
     */
    @Override
    public void move() {
        System.out.println("I usually walk with four legs");
    }
    /**
     * *
     * Override method for buffalo diet
     */
    //@Override
    public void diet() {
        System.out.println("I'm a Herbivore");
    }

    /**
     * *
     * Override method for buffalo family
     */
    //@Override
    public void family() {
        System.out.println("I am from Bovidae family");
    }

    /**
     * *
     * Override method for buffalo lifespan
     */
    //@Override
    public void lifespan() {
        System.out.println("My life span is 10-20 years");
    }
    
     /**
     * 
     * @param morningMilkProduction is of type double 
     * @param eveningMilkProduction is of type double
     * @return double value
     */
    public double getBuffaloAddition(double morningMilkProduction, double eveningMilkProduction)
    {
        return morningMilkProduction + eveningMilkProduction;
    }
    
    /**
     * 
     */
    public void Buffalo(){
        double morningMilkProduction = 4.5;
        double eveningMilkProduction = 4.0;
        double perDayMilkProduction = getBuffaloAddition(morningMilkProduction, eveningMilkProduction);
        System.out.println("I am " + this.name + ", I produce " + morningMilkProduction + "liters Of milk in the morning and "+eveningMilkProduction+"liters in the Evening, Overall I will produce "+perDayMilkProduction+"\"liters per\" day");
    }
    
    public static void main(String[] args){
        Buffalo Buffalo=new Buffalo("Bobbala");
        Buffalo.speak();
        Buffalo.move();
        Buffalo.diet();
        Buffalo.family();
        Buffalo.lifespan();
        COLOR C1=COLOR.BLACK;
        COLOR C2=COLOR.BROWN;
        System.out.println("enums: "+C1+"\n"+C2);
    }
        
        

}

