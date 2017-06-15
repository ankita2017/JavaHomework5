package oopsConcept;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public class VechicleTesting {

    public static void main(String[] args) {

        VechicleAbstract twowheeler = new Twowheeler();
        VechicleAbstract fourwheeler = new Fourwheeler();

        twowheeler.start();
        twowheeler.stop();
        fourwheeler.start();
        fourwheeler.stop();

    }
}
