package keywords;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public class Car {
    String carModel;
    int year;

    //Constructor 1
    public Car(){
    }

    //Constructor 2
    public Car(String carModel){
        this.carModel = carModel;
        System.out.println(this.carModel);
    }
    //Constructor 3
    public Car(String carModel, int year){
        this.carModel = carModel;
        this.year = year;
        System.out.println(this.carModel+" "+this.year);
    }

    public void engine(){
        System.out.println("Run by regular oil");
    }
}


