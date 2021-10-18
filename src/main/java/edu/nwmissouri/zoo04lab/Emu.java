package edu.nwmissouri.zoo04lab;

/**
 * 
 *  This documents "ColorsOfLife"
 * @author S545407
 */
enum ColorsOfLife{
    RED,
    YELLOW,
    BLUE,
    VOILET,
    GREEN,
   
}
/**
 * This class defines the nature of the Emu animal
 * @author Venkata Prabhakar Takkellapati (S545407)
 */
public class Emu extends Animal {

    public Emu(String name) {
        super(name);
    }

    /**
     * Determines the animal speak
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Emu!", this.name);
    }

    /**
     * Determines the animal move
     */
    @Override
    public void move() {
        System.out.println("they've become rare in the wild.");

    } 
    /**
     * This method will initialize the values and calls the sum method
     */
  public void sumOfTwo() {
        double p = 7.5;
        int q = 2;
        double r = emuSum(p, q);
        System.out.printf("I know EmuAddition! %4.2f plus %d is %4.2f \n", p, q, r);
    }
  /**
   * This method will calculate the sum of two numbers
   * @param first double value which is passed from sumOfTwo() 
   * @param second int value which is passed from sumOfTwo()
   * @return it returns the sum of two numbers
   */
public double emuSum(double first, int second) {
        return first + second;
    }
/**
 * The application's entry point
 * This is the main method which makes use of sumOfTwo,speak,move method.
 * @param args an array of command-line arguments for the application
 */
    public static void main(String[] args){
        var emu = new Emu("Adding");
        emu.speak();
        emu.move();
        emu.sumOfTwo();
         System.out.println("My Favourite Color is : "+ColorsOfLife.YELLOW);


    }
}
