package try_Catch;

/**
 * Created by Ankita Singh on 6/14/2017.
 */
public class MainDemo {

    public static void main(String[] args) {

        Math m = new Math();


        try{

            int result = m.division(10, 0);
            System.out.println(result);
        } catch(Exception e){

            System.out.println("you are dividing the number by zero");
            e.printStackTrace();
        } finally{
            System.out.println("lets clean up the resources");

        }



    }
}
