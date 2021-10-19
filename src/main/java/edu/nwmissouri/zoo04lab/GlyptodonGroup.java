package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides method to create an run group a group of Glyptodon
 * 
 * @author Manish Goud Bandharapu
 */
public class GlyptodonGroup {
    
    private static ArrayList<Glyptodon> myGroup;

    /**
     * Create a static group of Glyptodon     * 
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Glyptodon a = new Glyptodon("Bale");
        myGroup.add(a);
        myGroup.add(new Glyptodon("Leader"));
        myGroup.add(new Glyptodon("Republic"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the glyptodon!");
        myGroup.forEach(Glyptodon -> {
            Glyptodon.speak();
            Glyptodon.move();
        });
        System.out.println("Nice glyptodon - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    
    
}
