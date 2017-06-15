package oopsConcept;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public abstract class VechicleAbstract {

    public abstract void start();

    public void stop(){

        System.out.println("Stopping vechicle in abstract class");
    }

}

class Twowheeler extends VechicleAbstract{
    @Override
    public void start(){
        System.out.println("Starting two wheeler");

    }

}

class Fourwheeler extends VechicleAbstract{
    @Override
    public void start(){
        System.out.println("Starting four wheeler");

    }
}
