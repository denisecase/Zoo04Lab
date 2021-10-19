package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Mulamalla Akhil Kumar Reddy
 * 
 */
public class SiberianTiger extends Animal{
    
    /**
     * This is a constructor
     * @String name
     */
    enum car{
        toyota,
        maruthi,
        honda
    }

    public SiberianTiger (String name){
        super(name);
    }

    /*thi is roar method*/
    @Override
    public  void speak() {
        System.out.println("I'm a Tiger, my roar can be heard as far as 1.8 miles (3 km) away");
    }

    /*this is Run method*/
    @Override
    public void move() {
        System.out.println("I can Run 80 kilometers per hour (km/h)");
    }
    public void eat(){
        System.out.println("i am ready to eat");
        
    }
    
       public static void main(String[] args) {
        SiberianTiger a = new SiberianTiger("Tester");
        a.speak();
        a.move();
        a.eat();
        car c=car.honda;
       car c1=car.maruthi;
       car c2=car.toyota;
       System.out.println("cars"+c+c1+c2);
       

    }
             

    }
