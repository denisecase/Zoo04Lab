package edu.nwmissouri.zoo04lab;

import edu.nwmissouri.zoo04lab.Bearcat.occurFrom;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * creating BearcatGroup class for compress the switch logic
 * 
 * @author Pavan Kumar Atmakuri
 */
public class BearcatGroup {

    private static ArrayList<Bearcat> myGroup;

    /**
     * Create a static group of Bearcat
     *
     * @return the number of animals in the group
     */
    
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Bearcat("Shashi"));
        myGroup.add(new Bearcat("Madhav"));
        myGroup.add(new Bearcat("Afridi"));

        return myGroup.size();
    }

    public static void run() {
        Scanner s=new Scanner(System.in);
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the bearcat!");
        for (Bearcat bearcat : myGroup) {
            bearcat.speak();
            bearcat.move();
            bearcat.breed();
            bearcat.cal();
            System.out.println("Please enter OccurPlace of "+bearcat.name+" from enum values of INDIA, NEPAL, BANGLADESH");
            occurFrom pl = occurFrom.valueOf(s.nextLine()) ;
            System.out.println("Bearcat "+bearcat.name+" from "+pl);
        }

        System.out.println("Nice bearcat - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
