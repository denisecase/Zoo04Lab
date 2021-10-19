package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *Provides methods to create and run a group of ElephantBirds
 * 
 * @author Hemanth Kumar Reddy Pidaparathy
 */
public class ElephantBirdGroup {
    
    private static ArrayList<ElephantBird> myGroup;

    /**
     * Create a static group of ElephantBird
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        ElephantBird a = new ElephantBird("Iguana");
        myGroup.add(a);
        myGroup.add(new ElephantBird("Panther"));
        myGroup.add(new ElephantBird("TasmanianDevil"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the elephant Birds!");
        myGroup.forEach(elephantBird -> {
            elephantBird.speak();
            elephantBird.move();
        });
        System.out.println("Nice elephant bird - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}
