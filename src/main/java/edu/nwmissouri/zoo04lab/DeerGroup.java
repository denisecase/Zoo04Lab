package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *class DeerGroup is added
 * @author Rajashekhar Kota
 */
public class DeerGroup {
    
    
     private static ArrayList<Deer> myGroup;

    /**
     * Created a static group of Deer
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Deer a = new Deer("Abbie");
        myGroup.add(a);
        myGroup.add(new Deer("Boss"));
        myGroup.add(new Deer("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Deer!");
        myGroup.forEach(Deer -> {
            Deer.speak();
            Deer.move();
            Deer.display();

        });
        System.out.println("Nice Deer - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}
