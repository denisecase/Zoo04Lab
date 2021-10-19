package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Cows
 *
 * @author Harika_Chintala
 */
public class CowGroup {
    

    private static ArrayList<Cow> myGroup;

    /**
     * Create a static group of Cow
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Cow a = new Cow("dimpie");
        myGroup.add(a);
        myGroup.add(new Cow("mumpie"));
        myGroup.add(new Cow("jumpie"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        System.out.println("Hey - look at the Cow!");
        myGroup.forEach(cow -> {
            cow.speak();
            cow.move();
            cow.eat();
            cow.color();
            cow.studentCow();
            System.out.println();
            cow.directionToGo(Cow.EnumDirections.WEST);
            System.out.println();
            System.out.println("******************");
            System.out.println();
        });
        System.out.println("Nice Cow - that was fun!");
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

}
