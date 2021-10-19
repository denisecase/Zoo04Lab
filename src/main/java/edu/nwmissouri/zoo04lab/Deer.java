/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author RajashekharKota
 */
public class Deer extends Animal {

    /**
     *
     * @param name
     */
    public Deer(String name) {
        super(name);
    

    }
    enum raj{
        jan,
        feb,
        dec
    }

    /**
     *
     */
    @Override
    public void speak()
    {
       System.out.println("Iam deer,Iam deer,Iam deer");
    }

    /**
     *
     */
    @Override
    public void move()
    {
       System.out.println("When i move,I run,I can run fast");
    }

    /**
     *
     */
    public void place() {
        System.out.println("It live only on land");
    }

    /**
     *
     */
    public void ismamal() {
        System.out.println("Iam a mamal");
    }

    /**
     *
     */
    public void food()
    {
       System.out.println("Feeds on plants");
    }
    public String name(String s,String m){
        return (s+m);
        
    }
    public void display(){
        System.out.println("name is:"+name("Rajashekhar","kota"));
    }
   public static void main(String[] args){
        Deer d = new Deer("Hurry");
        d.speak();
        d.display();
        d.food();
        d.ismamal();
        d.move();
        d.place();
        raj r=raj.dec;
        raj r1=raj.feb;
        raj r2=raj.jan;
        System.out.println("months"+r+"\n"+r1+"\n"+r2);


        
        
    }
}
