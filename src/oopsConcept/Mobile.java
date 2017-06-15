package oopsConcept;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public class Mobile {
    public String manufacturer, operating_system, model;
    protected int cost;

    //constructor to set properties
    Mobile(String man, String os, String m, int co) {
        this.manufacturer = man;
        this.operating_system = os;
        this.model = m;
        this.cost = co;
    }

    // method to access model property of object
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public String getOperating_system() {
        return operating_system;
    }

    public int getCost() {
        return cost;
    }
}
