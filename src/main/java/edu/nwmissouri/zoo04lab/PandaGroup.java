package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Pandas
 *
 * @author Preethi Jadhav
 */
public class PandaGroup {

    private static ArrayList<Panda> myPandaGroup;

    /**
     * Create a static group of Panda
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myPandaGroup = new ArrayList<>();
        
        Panda p = new Panda("Panda1");
        myPandaGroup.add(p);
        myPandaGroup.add(new Panda("Panda2"));
        myPandaGroup.add(new Panda("Panda3"));

        return myPandaGroup.size();
    }
    /**
     * e num type of age 
     */
    public enum age{
        kidAge,
        middleAge,
        oldAge,
    }
    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("PANDA PANDA PANDA PANDA");
        System.out.println("Hey - look at the Pandas!");
        myPandaGroup.forEach(panda -> {
            panda.speak();
            panda.move();
        });
        System.out.println("Nice Pandas - that was fun!");
        System.out.println("This Panda1 is : "+age.kidAge);
        System.out.println("This Panda2 is : "+age.middleAge);
        System.out.println("This Panda3 is : "+age.oldAge);

        System.out.println("PANDA PANDA PANDA PANDA");
    }

}
