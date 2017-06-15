package oopsConcept;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public class PolyOverload {

    public static void main(String[] args){
        PolyOverload po = new PolyOverload();
        po.print(10);
        po.print("Hello Sam");
        po.print("How are you", 50);

    }

    public void print(String s){
        System.out.println("First Method String only " + s);
    }

    public void print(int a){
        System.out.println("Second Method Number only " + a);
    }

    public void print(String s, int a){
        System.out.println("Third Method Both string and number--- " + s +"---" +  a);
    }

}
