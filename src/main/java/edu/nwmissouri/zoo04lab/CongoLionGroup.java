package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Akshay krishna kintali
 */
public class CongoLionGroup {

    private static ArrayList<CongoLion> myGroup;

    /**
     * Create a static group of CongoLion
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        CongoLion a = new CongoLion("python");
        myGroup.add(a);
        myGroup.add(new CongoLion("venom"));
        myGroup.add(new CongoLion("Carl"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("*****************************************");
        System.out.println("Hey - look at the CongoLion!");
        myGroup.forEach(CongoLion -> {
            CongoLion.speak();
            CongoLion.move();
            CongoLion.name("akshay","kintali");
            CongoLion.display();
        });
        System.out.println("Nice CongoLion - that was fun!");
        System.out.println("*****************************************");

    }
}
