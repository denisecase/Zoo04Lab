package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Xraytetras
 *
 * @author Shashankaravi chaparala
 */
public class XraytetraGroup {

    private static ArrayList<Xraytetra> myGroup;

    /**
     * Create a static group of Xraytetra
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Xraytetra a = new Xraytetra("Abbie");
        myGroup.add(a);
        myGroup.add(new Xraytetra("Boss"));
        myGroup.add(new Xraytetra("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("Hey - look at the Xraytetras!");
        myGroup.forEach(Xraytetra -> {
            Xraytetra.speak();
            Xraytetra.move();
        });
        System.out.println("Nice Xraytetras - that was fun!");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
}
