package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Vinay Manavarthi
 */
public class KoalaGroup {
    
      private static ArrayList<Koala> myGroup;

    /**
     * Create a static group of Koala
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Koala koalaObj = new Koala("python");
        myGroup.add(koalaObj);
        myGroup.add(new Koala("venom"));
        myGroup.add(new Koala("Carl"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
         System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Koala!");
        myGroup.forEach(Koala -> {
            Koala.speak();
            Koala.move();
        });
        System.out.println("Nice Koala - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

    }
    
}
