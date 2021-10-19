/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  edu.nwmissouri.zoo04lab;
/**
 * This class is about MuleDeer extends Animal
 *
 * @author Hari Hara Mummadi
 */
public class MuleDeer extends Animal {
 /**
  * Using enum
  * 
  */
    enum Play{
        Play1,
        Play2,
        Play3
    }
    /**
     * constructor for MuleDeer
     * @param name 
     */
    public MuleDeer(String name) {
        super(name);
    }

    /**
     * Overriding move method
     */
    @Override
    public void move() {
        System.out.println("I run on my 4 legs!");
    }

   /**
    * Overriding speak method
    */
    @Override
    public void speak() {
        System.out.printf("I'm %s.I'm an Deer!\n", this.name);
    }
    public void habitate(){
        System.out.println("I live in Zoo and Forest");
    }
    public void feed(){
        System.out.println("I Feed on Grass");
    }
    public void calculate() {
        int a = 4;
        int b = 5;
        int c = getMuleDeerAdd(a, b);
        System.out.printf("MuleDeer addition!"+c+"\n");
    }
     public int getMuleDeerAdd(int value1, int value2) {
        int h=value1+value2;
         return h;
    }
     public static void main(String[] args){
        MuleDeer i=new MuleDeer("play");
        i.move();
        i.habitate();
        i.speak();
        i.feed();
        i.calculate();
        i.getMuleDeerAdd(4, 5);
        Play p1=Play.Play1;
        Play p2=Play.Play2;
        Play p3=Play.Play3;
        System.out.println("enums are: " +p1+" "+p2+" "+p3);
}
}

