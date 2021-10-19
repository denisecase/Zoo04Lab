package edu.nwmissouri.zoo04lab;
import java.util.ArrayList;

/**
 * SquirrelGroup class demonstrating run and create methods
 * @author Nithin Reddy Kumbham
 */
public class SquirrelGroup {

private static ArrayList<Squirrel> myGroup;

    /**
     * Create a static group of Squirrel
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Squirrel a = new Squirrel("Pinto");
        myGroup.add(a);
        myGroup.add(new Squirrel("Searel"));
        myGroup.add(new Squirrel("Sophie"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("*****************************************");
        System.out.println("Hey - look at the Squirrel!");
        myGroup.forEach(Squirrel -> {
            Squirrel.speak();
            Squirrel.move();
        });
        System.out.println("Nice Squirrel - that was fun!");
        System.out.println("*****************************************");
    
}
}
    

