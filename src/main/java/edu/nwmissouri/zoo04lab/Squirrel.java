package edu.nwmissouri.zoo04lab;

enum DaysofWeek{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY
}

/**
 *Squireel class (derived from subclass of superclass Animal)
 * @author Nithin Reddy Kumbham
 */
public class Squirrel extends Animal{
    /**
     * Aardvark constructor
     * @param String name1 
     */
    public Squirrel(String name1){
        super(name1);
    }
    
    /**
     * Method which defines type of animal with name
     * @param name 
     */
    public void typeofAnimal(String name){
        System.out.println("Hey I am herbivores and my name is "+name+", I eat only plants ");
    }
    
    /**
     * Method which defines age of animal
     */
    public void age(){
        System.out.println("My age is 6 years");
    }
    
    /**
     * Method which defines height of animal
     */
    public void height(){
        System.out.println("My height is 14.3 cm");
    }
    
    /**
     * Method which defines weight of animal
     */
    public void weight(){
        System.out.println("My weight is 16 lbs");
    }
    
    /**
     * A method which returns height and weight of an animal combined in double
     * @param height of animal
     * @param weight of animal
     * @return height and weight of animal
     */
    
    public double heightweight(double height, double weight){
        return height + weight;
    }
    
    
    /**
     * Method which defines whether animal is disabled or not
     */
    public void isDisabled(){
        System.out.println("Are u kidding !, I am perfectly alright");
    }
    
    /**
     * Method which defines sound of animal
     */
    @Override
    public void speak(){
        System.out.println("I make a keech keech Sound");
    }
    
    /**
     * Method which defines movement of animal
     */
    @Override
    public void move(){
        System.out.println("I move with four legs");
    }
    
    /**
     * Method which defines sleep duration of animal
     */
    public void sleep(){
        System.out.println("I njoy my sleep, I sleep for 10 hours");
    }
    
    /**
     * Method which defines gender of animal
     */
    public void gender(){
        System.out.println("I am female");
    }
    
    /**
     * Method void which multiplies a & b
     */
    public void functionMultiply(){
        int a = 10;
        int b = 15;
        System.out.println("Result of a*b is : "+a*b);
    }
    
    public static void main(String args[]){
        Squirrel pinto = new Squirrel("pinto");
        double height = 5.4;
        double weight = 15.9;
        double result = pinto.heightweight(height,weight);
        pinto.typeofAnimal("pinto");
        pinto.age();
        pinto.move();
        pinto.speak();
        pinto.isDisabled();
        pinto.functionMultiply();
        System.out.println("Height and weight of me combined is : "+result);
        
        //enum
        DaysofWeek monday = DaysofWeek.MONDAY;
        DaysofWeek sunday = DaysofWeek.SUNDAY;
        if(DaysofWeek.MONDAY == monday){
            System.out.println("Today is Monday, Gotta rush to work");
        }
        if(DaysofWeek.SUNDAY == sunday){
            System.out.println("Today is Sunday, The weekend is gonna complete");
        }
    }
    
}
