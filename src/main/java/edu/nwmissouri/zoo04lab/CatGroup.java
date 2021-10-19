package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Cats
 *
 * @author Maneesh Sake
 */
public class CatGroup {

    private static ArrayList<Cat> myGroup;

    /**
     * Create a static group of Cats
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Cat a = new Cat("Abbie");
        myGroup.add(a);
        myGroup.add(new Cat("Boss"));
        myGroup.add(new Cat("Cass"));

        return myGroup.size();
    }
    
    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the cats!");
        myGroup.forEach(cat -> {
            cat.speak();
            cat.move();
            cat.profess();
        });
        System.out.println("Nice cats - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        String message= "Thank You for Choosing Me !.";
        System.out.println(message);
        
    }

}
