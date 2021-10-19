
package edu.nwmissouri.zoo04lab;


/**
 *
 * @author Pandiri Govinda Reddy
 */
public class YukonMoose extends Animal{

    float height() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    /**
     * Constructor
     * @param name 
     */
    enum MONTH
    {
        JULY,
        AUGUST,
        SEPTEMBER
    }
        public YukonMoose(String name){
        super(name);
    }
    public void size(){
        System.out.println(" I'm 6 feet tall...."+this.name);
    }
    public void survive(){
        System.out.println(" I can survive under 80 degree celsius");
    }
    public void behaviour(){
        System.out.println(" I can be very aggresive");
    }
    public float height(int feet, float inches){
        return feet+inches;
    }
    public void tHeight(){
        System.out.println("YukonMoose height:"+ height(7, (float) 0.6));
    }
    public static void main(String[] args){
        YukonMoose m=new YukonMoose("Alaskan");
        m.height(7, (float) 0.6);
        m.tHeight();
        m.behaviour();
        m.size();
        m.survive();
        MONTH m1=MONTH.JULY;
        MONTH m2=MONTH.AUGUST;
        MONTH m3=MONTH.SEPTEMBER;
        System.out.println("months:"+m1+"\n"+m2+"\n"+m3);
    }
}
