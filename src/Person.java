import java.util.Random;
public  class Person {
    Random rand=new Random();
    public void performProcedure() {
        System.out.println("Виконання процедури від особи");
    }

   final void appointment(){
       int day = rand.nextInt(31) * 1;
       int month = rand.nextInt(12) * 1;
       int year=2024;


       System.out.println("Найближчий день, коли ми б змогли провести процедуру : " + day + "-" + month +"-"+year);
   }

}







