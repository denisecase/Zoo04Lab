package edu.nwmissouri.zoo04lab;

import java.util.Scanner;

/**
 * ZooApp is a Zoo simulation created by 542 Section 05.
 *
 * @author Dr. Case and others
 */
public class ZooApp {

    // Specify welcome message
    private static final String GREETING_MESSAGE = "Welcome to our 542 Zoo!";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";

    // specify number of  animal types available - TODO: NEED TO AUTOUPDATE****
    private static final int NUMBER_ANIMAL_TYPES = 15;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

        // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape 
        System.out.println(ESCAPE_MESSAGE);

        // construct Scanner and begin interaction
        var scanner = new Scanner(System.in);

        // Prompt for topic: ask if they want to see animals
        System.out.println("Do you want to see animals (y/n)?");
        var animalInterestInput = scanner.next();

        // if yes, show list
        if (animalInterestInput.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                // TODO: NEED TO AUTOUPDATE THE MENU *************
                System.out.println("What animals would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");

                System.out.println("1. Aardvark");
                System.out.println("2. Asp");
                System.out.println("3. Bearcat");
                System.out.println("4. Cow");
                System.out.println("5. Crocodile");
                System.out.println("6. Dalmatian");
                System.out.println("7. Duck");
                System.out.println("8. Floppy");
                System.out.println("9. Griffin");
                System.out.println("10. Kangaroov");
                System.out.println("11. Liger");
                System.out.println("12. MightyLion");
                System.out.println("13. Rabbit");
                System.out.println("14. Shoebill");
                System.out.println("15. Xraytetra");
                System.out.println("25. Elephant");

                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                // set isValid if >= 1 and <= number of animal types
                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_ANIMAL_TYPES;

                // switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput) {

                    case 1: {
                        AardvarkGroup.create();
                        AardvarkGroup.run();
                    }
                    case 2: {
                        AspGroup.create();
                        AspGroup.run();
                    }
                    case 3: {
                        BearcatGroup.create();
                        BearcatGroup.run();
                    }
                    case 4: {
                        CowGroup.create();
                        CowGroup.run();
                    }
                    case 5: {
                        CrocodileGroup.create();
                        CrocodileGroup.run();
                    }
                    case 6: {
                        DalmatianGroup.create();
                        DalmatianGroup.run();
                    }
                    case 7: {
                        DuckGroup.create();
                        DuckGroup.run();
                    }
                    case 8: {
                        FloppyGroup.create();
                        FloppyGroup.run();
                    }
                    case 9: {
                        GriffinGroup.create();
                        GriffinGroup.run();
                    }
                    case 10: {
                        KangaroovGroup.create();
                        KangaroovGroup.run();
                    }
                    case 11: {
//                        LigerGroup.create();
//                        LigerGroup.run();
                    }
                    case 12: {
                        MightyLionGroup.create();
                        MightyLionGroup.run();
                    }
                    case 13: {
                        RabbitGroup.create();
                        RabbitGroup.run();
                    }
                    case 14: {
                        ShoebillGroup.create();
                        ShoebillGroup.run();
                    }
                    case 15: {
                        XraytetraGroup.create();
                        XraytetraGroup.run();
                    }
                     case 25: {
                        ElephantGroup.create();
                        ElephantGroup.run();
                    }
                    default: {
                    }

                }

                // while the input is valid, we loop back
            } while (isValid);

            // close the if loop
        } // Prompt for adventures: ask if they want to try an adventure
        //        System.out.println("Do you want to go on an adventure (y/n)?");
        //        var adventureInterestInput = scanner.next();
        //        if (adventureInterestInput.toUpperCase().startsWith("Y")) {
        //            System.out.println("Sorry - this option is not yet available.");
        //        }
        // output goodbye
        System.out.println(GOODBYE_MESSAGE);

    }

}
