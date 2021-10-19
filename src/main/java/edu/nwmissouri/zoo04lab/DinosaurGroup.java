package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;
/**
 * Provides methods to create and run a group of Dinosaurs
 *
 * @author Anurag Kolluru
 */
public class DinosaurGroup {

    private static ArrayList<Dinosaur> myDinosaurGroup;

    /**
     * Create a static group of Dinosaur
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myDinosaurGroup = new ArrayList<>();
        
        Dinosaur p = new Dinosaur("Dino SIR..!");
        myDinosaurGroup.add(p);
        myDinosaurGroup.add(new Dinosaur("Witcher..!"));
        myDinosaurGroup.add(new Dinosaur("Charlizard..!"));

        return myDinosaurGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        System.out.println("Hey....there's a Dinosaur..!");
        myDinosaurGroup.forEach(Dinosaur -> {
            Dinosaur.speak();
            Dinosaur.move();
        });
        System.out.println("Huge Dinosaur's..it was a fun ride!");
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
    }

}
