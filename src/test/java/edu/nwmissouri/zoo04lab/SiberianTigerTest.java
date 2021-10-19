package edu.nwmissouri.zoo04lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Mulamalla Akhil Kumar Reddy
 * 
 */
public class SiberianTigerTest extends Animal{
    
    /**
     * This is a constructor
     * @String name
     */
    public SiberianTigerTest (String name){
        super(name);
    }
    
    /*thi is roar method*/
    @Override
    public  void speak() {
        System.out.println("I'm a Tiger, my roar can be heard as far as 1.8 miles (3 km) away");
    }

    /*this is Run method*/
    @Override
    public void move()  {
                
    }
    @Test
    public void test(){
         System.out.println("I can Run 80 kilometers per hour (km/h)");
        int actual=4;
        int a=4;
        assertEquals(a,actual);

    }
    }
