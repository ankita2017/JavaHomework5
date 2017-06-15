package oopsConcept;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public class PolyOveride {

    public static void main(String[] args){

        Mobile m = new Mobile("Nokia", "windows", "Lumia", 10000);
        System.out.println(m.getManufacturer());
        System.out.println(m.getOperating_system());
        System.out.println(m.getModel());
        System.out.println(m.getCost());

        Andriod an = new Andriod("Samsung", "Andriod", "Galaxy", 20000);
        System.out.println(an.getManufacturer());
        System.out.println(an.getOperating_system());
        System.out.println(an.getModel());
        System.out.println(an.getCost());

    }
}
