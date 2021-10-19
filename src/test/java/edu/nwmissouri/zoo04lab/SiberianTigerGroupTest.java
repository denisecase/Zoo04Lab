package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Akhil Mulamalla
 */
public class SiberianTigerGroupTest {

    private static ArrayList<SiberianTigerTest> mySiberianTigerGroup;

    /**
     * Create a static group of SiberianTigerTest
     *
     * @return the number of animals in the group
     */
    public static int create() {
        mySiberianTigerGroup = new ArrayList<>();
        
        SiberianTigerTest S = new SiberianTigerTest("SiberianTiger1");
        mySiberianTigerGroup.add(S);
        mySiberianTigerGroup.add(new SiberianTigerTest("SiberianTiger2"));
        mySiberianTigerGroup.add(new SiberianTigerTest("SiberianTiger3"));

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
        });
        System.out.println("Nice SiberianTigers - they are cute");
        System.out.println("TTTTTTTTTTTTTTTTTTT");
    }

}
