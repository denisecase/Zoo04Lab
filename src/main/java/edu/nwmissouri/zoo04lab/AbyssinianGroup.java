package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *
 * @author Vamsi krishna Areti (S544902)
 */

public class AbyssinianGroup {
private static ArrayList<Abyssinian> myGroup;

    /**
     * Create a static group of Abyssinian
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Abyssinian a = new Abyssinian("Cat");
        myGroup.add(a);
        myGroup.add(new Abyssinian("venom"));
        myGroup.add(new Abyssinian("Carl"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("*****************************************");
        System.out.println("Hey - look at the Abyssinian!");
        myGroup.forEach(abyssinian -> {
            abyssinian.speak();
            abyssinian.move();
            abyssinian.eat();
            abyssinian.visible();
            abyssinian.breed();
        });
        System.out.println("Nice Abyssinian - that was fun!");
        System.out.println("*****************************************");
    
}}

    

