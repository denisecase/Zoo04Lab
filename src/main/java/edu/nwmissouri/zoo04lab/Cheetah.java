package edu.nwmissouri.zoo04lab;

/**
 * Cheetah class (derived subclass of the superclass Animal)
 *
 * @author Srilekha Janagam
 */
public class Cheetah extends Animal {

    /**
     * Aardvark constructor
     *
     * @param name - the name of this aardvark
     */
    public Cheetah(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Cheetah!", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    
    public void diet(){
        System.out.println("I am a carnivore");
        
    }

    public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getCheetahAddition(a, b);
        System.out.printf("I know CheetahAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom Cheetah function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getCheetahAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        var a = new Cheetah("Tester");
        a.speak();
        a.move();
        a.profess();
        a.diet();
    }

}
