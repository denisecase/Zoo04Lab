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
    /*
    *Introduced enum
    */
    enum raj{
        jan,
        feb,
        dec
    }

    /**
     *overriding speak method
     */
    @Override
    public void speak()
    {
       System.out.println("Iam deer,Iam deer,Iam deer");
    }

    /**
     *Overriding move method
     */
    @Override
    public void move()
    {
       System.out.println("When i move,I run,I can run fast");
    }

    /**
     *Stated the place of custom animal
     */
    public void place() {
        System.out.println("It live only on land");
    }

    /**
     *Added a method with ismamal name
     */
    public void ismamal() {
        System.out.println("Iam a mamal");
    }

    /**
     * using food method
     */
    public void food()
    {
       System.out.println("Feeds on plants");
    }

    /**
     *returning string
     * @param s
     * @param m
     * @return
     */
    public String name(String s,String m){
        return (s+m);
        
    }

    /**
     * it displays the name
     */ 
    public void display(){
        System.out.println("name is:"+name("Rajashekhar","kota"));
    }

    /**
     *program execution started
     * @param args
     */
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
