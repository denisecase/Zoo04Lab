package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Bhaskar Venkata Prudhvi Bobbala
 */
public class BuffaloGroup {
    private static ArrayList<Buffalo> myGroup;

    /**
     * Create a static group of Aardvarks
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Buffalo a = new Buffalo("Jack");
        myGroup.add(a);
        myGroup.add(new Buffalo("Hana"));
        myGroup.add(new Buffalo("Nikh"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Buffaloes!");
        myGroup.forEach(Buffalo -> {
            Buffalo.speak();
            Buffalo.move();
            Buffalo.diet();
            Buffalo.family();
            Buffalo.lifespan();
        });
        System.out.println("Nice Buffaloes - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}
