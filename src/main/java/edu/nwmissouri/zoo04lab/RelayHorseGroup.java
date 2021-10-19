package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Aardvarks
 *
 * @author BHUVAN CHANDRA SARAKAM (S544899)
 */
public class RelayHorseGroup {

    private static ArrayList<RelayHorse> myGroup;

    /**
     * Create a static group of RelayHorse
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        RelayHorse a = new RelayHorse("Abbie");
        myGroup.add(a);
        myGroup.add(new RelayHorse("Boss"));
        myGroup.add(new RelayHorse("Cass"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the RelayHorse!");
        myGroup.forEach(RelayHorse -> {
            RelayHorse.speak();
            RelayHorse.move();
            RelayHorse.profess();
        });
        System.out.println("Nice RelayHorse - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
