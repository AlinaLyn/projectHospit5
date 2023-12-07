import java.util.Scanner;
public class Patiens extends Person {
    private String name;
    private String typeOfinjury;
    private int age;
    private int[] patientsPerDay;


    public Patiens() {
        this.name = name;
        this.typeOfinjury = typeOfinjury;
        this.age = age;
        this.patientsPerDay = new int[7];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfinjury() {
        return typeOfinjury;
    }

    public void setTypeOfinjury(String typeOfinjury) {
        this.typeOfinjury = typeOfinjury;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int[] getPatientsPerDay() {
        return patientsPerDay;
    }

    public void setPatientsPerDay(int[] patientsPerDay) {
        this.patientsPerDay = patientsPerDay;
    }

    int chooseProcedure() {
        System.out.println("Доброго дня!" + "Яку процедуру Ви б хотіли обрати?");
        System.out.println("Введіть в систему код '103',щоб побачити перелік");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("" + choice);
        return choice;
    }


    public void preferenceProcedure() {
        System.out.println("Вкажіть потрібне Вам обстеження");
        System.out.println("1.Лабораторні дослідження(загальний аналіз крові/біохімічний аналіз крові/група та резус-фактор крові/аналізи на інфекції/аналізи гормонів та імунологічні тести)");
        System.out.println("2.Зображувальні дослідження(рентгенографія/УЗД/КТ/МРТ/флюрографія)");
        System.out.println("3.Електрокардіографія і дослідження серця");
        System.out.println("4.Ендоскопія(гастроскопія/колоноскопія/бронхоскопія)");
        System.out.println("5.Хірургічні процедури ( операції на серці/видалення апендециту/лапароскопічні операції /ампутації кінцівок/пластична хірургія)");
        System.out.println("6.Лікування інфекцій( інфузії антибіотиків та інших лікарських засобів)");
        System.out.println("7.Постановка діагнозу та консультація лікарів різних спеціалізацій");
        System.out.println("№: ");
    }


    private String getDayOfWeek(int day) {
        String[] daysOfWeek = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        return daysOfWeek[day];
    }

    public void inputPatients() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Введіть кількість пацієнтів на " + (i) + ":");
            patientsPerDay[i] = scanner.nextInt();
        }
    }

    public void displayPatientsPerDay() {
        System.out.println("Кількість пацієнтів на кожен день тижня:");
        for (int i = 0; i < 7; i++) {
            System.out.println(getDayOfWeek(i) + ": " + patientsPerDay[i]);
        }
    }

    public int calculateTotalPatients() {
        int totalPatients = 0;
        for (int i = 0; i < patientsPerDay.length; i++) {
            totalPatients += patientsPerDay[i];
        }
        return totalPatients;
    }


    }













