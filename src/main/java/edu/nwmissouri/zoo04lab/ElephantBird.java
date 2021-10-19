package edu.nwmissouri.zoo04lab;

/**
 *Elephant Bird class derived from animal class
 * 
 * @author Hemanth Kumar Reddy Pidaparathy
 */
public class ElephantBird extends Animal {
    
    enum status{
        one,
        two,
        three,
        four
    }
    
    /**
     * ElephantBird name
     *
     * @param name
     */
    public ElephantBird(String name) {
        super(name);
    }
    
    /**
     * Elephant Bird speak
     *
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an ElephantBird!",this.name);
    }
    
    /**
     *Elephant Bird move
     * 
     */
    @Override
    public void move() {
        System.out.println("When I move, I run,run,run.\n");
    }
    
    public void profes(){
        double a = 2.5;
        int b = 2;
        double c = getElephantBirdAddition(a,b);
        System.out.printf("I know ElephantBird addition! %4.2f plus %d is %4.2f \n",a,b,c);
    }

    double getElephantBirdAddition(double first, int second) {
        return first+second; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        var a = new ElephantBird("Tester");
        a.speak();
        a.move();
        a.profes();
        status single = status.one;
        status doubles = status.two;
        status triple = status.three;
        System.out.println("Status :"+single+" "+doubles+" "+triple+".");
    }
    
}
