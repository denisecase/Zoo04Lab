package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * This defines ElephantGroup
 *
 * @author Homakesavadurgaprasad OMTRI (S544929)
 */
public class ElephantGroup {

    private static ArrayList<Elephant> myGroup;

    /**
     *
     * @return the number of group size
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Elephant("Homesh"));
        myGroup.add(new Elephant("Homi"));
        myGroup.add(new Elephant("Omtri"));

        return myGroup.size();
    }

    /**
     * do not reply any value
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Elephant!");
        for (Elephant elephant : myGroup) {
            elephant.speak();
            elephant.move();
        }

        System.out.println("Nice Elephant - that was really fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
