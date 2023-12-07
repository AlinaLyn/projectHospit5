import java.util.Scanner;
public class Doctors extends Person {
    private String name;
    private double receptionHours;
    private int age;


    public Doctors(String name,double receptionHours,int age) {
        this.name = name;
        this.receptionHours=receptionHours;
        this.age=age;

    }

    public Doctors() {

    }

    void staff(){
        System.out.println("Доброго дня!Мене звуть " + name  );
    }

    public void performProcedure() {
        System.out.println("Важливо виконувати процедуру згідно усіх правил та норм");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReceptionHours() {
        return receptionHours;
    }

    public void setReceptionHours(double receptionHours) {
        this.receptionHours = receptionHours;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    }




