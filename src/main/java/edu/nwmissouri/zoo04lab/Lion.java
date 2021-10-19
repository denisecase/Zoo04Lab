package edu.nwmissouri.zoo04lab;

/**
 * Lion class (derived subclass of the superclass Animal)
 *
 * @author Nikhil KrishnanVenkatesh
 */
public class Lion extends Animal {

    /**
     * Lion constructor
     *
     * @param name - the name of this Lion
     */
    enum RECORD{
        FIRST,
        SECOND,
        THIRD
    }
    public Lion(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Lion!", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    
    public void speed() {
        System.out.println("I can run with a speed of 100 miles/hr");
    }

    public void profess() {
        double a = 5.2;
        int b = 2;
        double c = getLionAddition(a, b);
        System.out.printf("I know LionAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom Lion function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getLionAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        var a = new Lion("Tester");
        a.speak();
        a.move();
        a.profess();
        a.speed();
        RECORD R1= RECORD.FIRST;
        RECORD R2= RECORD.SECOND;
        RECORD R3= RECORD.THIRD;
        System.out.println("enums"+R1+"\n"+R2+"\n"+R3);
    }

}
