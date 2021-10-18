package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Srilekha Janagam
 */
public class CheetahGroup {
    
      private static ArrayList<Cheetah> myGroup;

    /**
     * Create a static group of Cheetah
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Cheetah a = new Cheetah("Chase");
        myGroup.add(a);
        myGroup.add(new Cheetah("Parker"));
        myGroup.add(new Cheetah("Strom"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Cheetahs!");
        myGroup.forEach(cheetah -> {
            cheetah.speak();
            cheetah.move();
            cheetah.diet();
            cheetah.profess();
            
        });
        System.out.println("Nice Cheetahs - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}

    

