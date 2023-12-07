import java.util.Random;
import java.util.Scanner;

abstract class AbstractPerson  {
    Random rand1 = new Random();
    Scanner scanner=new Scanner(System.in);

    public void performing() {
        System.out.println("Ви можете оцінити роботу персоналу від 1-5");
    }
        abstract void note();


}