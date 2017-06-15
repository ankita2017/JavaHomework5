package oopsConcept;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public class Andriod extends Mobile {

    Andriod(String man, String os, String m, int co) {
        super(man, os, m, co);
    }

    public String getModel(){
        return "This is Android Mobile " + model;
    }

    public String getManufacturer() {
        return "This is manufacturer " + manufacturer;
    }


    public String getOperating_system() {
        return "The operating system is " + operating_system;
    }

    public int getCost(){
        return cost;
    }
}
