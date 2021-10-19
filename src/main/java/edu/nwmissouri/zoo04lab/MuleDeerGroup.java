package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * This class is about MuleDeerGroup
 * @author Hari Hara Mummadi
 */
public class MuleDeerGroup {
     private static ArrayList<MuleDeer> myGroup;

    /**
     * Create a static group of MuleDeers
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        MuleDeer a = new MuleDeer("Sitka Deer");
        myGroup.add(a);
        myGroup.add(new MuleDeer("California Mule Deer"));
        myGroup.add(new MuleDeer("Cedros Island Mule Deer"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Mule deers!");
        myGroup.forEach(muledeer -> {
            muledeer.speak();
            muledeer.move();
            muledeer.habitate();
            muledeer.feed();
        });
        System.out.println("Nice Mule deers - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
