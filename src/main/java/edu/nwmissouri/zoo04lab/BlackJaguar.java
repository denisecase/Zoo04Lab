package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Naveen Kumar Kanaparthi
 */
public class BlackJaguar extends Animal {
    
    /**
     *
     * @param name
     */
    public BlackJaguar(String name) {
        super(name);
    }
    enum level {
        firstLevel,
        SecondLevel,
        thirdLevel
    }
    
    /**
     *speak method
     */
    @Override
    public void speak(){
        System.out.printf("I am %s. I am Jaguar!", this.name);
    }
    
    /**
     *move method
     */
    @Override
    public void move(){
        System.out.println("When I move, I walk.\n");
    }

    /**
     *behaviour method
     */
    public void behaviour(){
        System.out.println("I am very aggressive and hunt alone");
    }

    /**
     *
     * @param fs
     * @param ls
     * @return
     */
    public String name(String fs,String ls){
         return fs+ls;
     }

    /**
     *details method
     */
    public void details(){
         System.out.println("name:"+name("naveen","kanaparthi"));
     }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
         BlackJaguar b=new BlackJaguar("yahoo");
         b.speak();
         b.move();
         b.behaviour();
         b.details();
         level l=level.firstLevel;
         level l1=level.SecondLevel;
         level l2=level.thirdLevel;
         System.out.println("game levels are:"+l+"\n"+l1+"\n"+l2);


     }
    }

