package edu.nwmissouri.zoo04lab;

/**
 *
 * @author S545407
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
        System.out.println("This endangered species is native to the dense forests of the Congo!");
    }

    /**
     * Determines the animal move
     */
    @Override
    public void move() {
        System.out.println("they've become rare in the wild.");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
