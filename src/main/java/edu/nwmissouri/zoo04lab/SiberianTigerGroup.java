package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Akhil Mulamalla
 */
public class SiberianTigerGroup {

    private static ArrayList<SiberianTiger> mySiberianTigerGroup;

    /**
     * Create a static group of SiberianTiger
     *
     * @return the number of animals in the group
     */
    public static int create() {
        mySiberianTigerGroup = new ArrayList<>();
        
        SiberianTiger S = new SiberianTiger("SiberianTiger1");
        mySiberianTigerGroup.add(S);
        mySiberianTigerGroup.add(new SiberianTiger("SiberianTiger2"));
        mySiberianTigerGroup.add(new SiberianTiger("SiberianTiger3"));

        return mySiberianTigerGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("TTTTTTTTTTTTTTTTTTT");
        System.out.println("Look at SiberianTiger!");
        mySiberianTigerGroup.forEach(SiberianTiger -> {
            SiberianTiger.speak();
            SiberianTiger.move();
            SiberianTiger.eat();
        });
        System.out.println("Nice SiberianTigers - they are cute");
        System.out.println("TTTTTTTTTTTTTTTTTTT");
    }

}
