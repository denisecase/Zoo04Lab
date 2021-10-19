package edu.nwmissouri.zoo04lab;
import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Aardvarks
 *
 * @author Revanth Pagilla
 */
public class LigerGroup {

    private static ArrayList<Liger> myLigerGroup;

    /**
     * Create a static group of Liger
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myLigerGroup = new ArrayList<>();
        
        Liger l = new Liger("Liger1");
        myLigerGroup.add(l);
        myLigerGroup.add(new Liger("Liger2"));
        myLigerGroup.add(new Liger("Liger3"));

        return myLigerGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey i am Liger!");
        myLigerGroup.forEach(liger -> {
            liger.speak();
            liger.move();
            liger.eat();
        });
        System.out.println("Liger - cross breed of lion and tiger");
        System.out.println("Crossbreed of lion and tiger");
    }

}
