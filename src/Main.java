
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Patiens client = new Patiens();

        Patiens procedurePreference = new Patiens();
        Scanner p = new Scanner(System.in);
        Scanner p1 = new Scanner(System.in);

        Doctors surgeon = new Doctors("Олег", 7.00 - 16.00, 40);
        Doctors cardiologist = new Doctors("Петро", 11.00 - 17.00, 54);
        Doctors rehabilitationSpecialist = new Doctors("Євген", 9.00 - 18.00, 38);
        Doctors endoscopist = new Doctors("Сергій", 8.00 - 16.30, 29);
        Doctors psychiatrist = new Doctors("Володимир", 7.00 - 19.00, 50);
        Doctors oncologist = new Doctors("Вікторія", 7.00 - 19.00, 46);
        Doctors therapist = new Doctors("Галина", 7.30 - 16.30, 39);

        Procedures surgeries = new Procedures(500, 0.25);
        Procedures electrocardiography = new Procedures(6000.00, 3.20);
        Procedures rehabilitation = new Procedures(1750, 0.47);
        Procedures endoscopy = new Procedures(750.00, 0.50);
        Procedures psychotherapy = new Procedures(1200, 1.30);
        Procedures oncology = new Procedures(350, 0.20);
        Procedures healthCheck = new Procedures(550.00, 0.30);


        switch (client.chooseProcedure()) {
            case 103:
                procedurePreference.preferenceProcedure();
                int choose = p.nextInt();
                switch (choose) {
                    case 1:
                        healthCheck.description();
                        System.out.println("Лікар Галина");
                        therapist.staff();
                        healthCheck.findPrice();
                        break;
                    case 2:
                        surgeries.description();
                        System.out.println("Лікар Олег");
                        surgeon.staff();
                        surgeries.findPrice();
                        break;
                    case 3:
                        psychotherapy.description();
                        System.out.println("Лікар Володимир");
                        psychiatrist.staff();
                        psychotherapy.findPrice();
                        break;
                    case 4:
                        endoscopy.description();
                        System.out.println("Лікар Сергій");
                        endoscopist.staff();
                        endoscopy.findPrice();
                        break;
                    case 5:
                        electrocardiography.description();
                        System.out.println("Лікар Петро");
                        cardiologist.staff();
                        electrocardiography.findPrice();
                        break;
                    case 6:
                        rehabilitation.description();
                        System.out.println("Лікар Євген");
                        rehabilitationSpecialist.staff();
                        rehabilitation.findPrice();
                        break;
                    case 7:
                        oncology.description();
                        System.out.println("Лікар Вікторія");
                        oncologist.staff();
                        oncology.findPrice();
                        break;
                }

                Schedule shift1 = new Schedule("Понеділок", "Хірург,кардіолог");
                Schedule shift2 = new Schedule("Вівторок", "Терапевт,реабілітолог");
                Schedule shift3 = new Schedule("Середа", "Психіатр,ендоскопіст");
                Schedule shift4 = new Schedule("Четвер", "Хірург,онколог");
                Schedule shift5 = new Schedule("П'ятниця", "Терапевт, кардіолог");
                Schedule shift6 = new Schedule("Субота", "Реабілітолог, ендоскопіст");
                Schedule shift7 = new Schedule("Неділя", "Онколог, психіатр");
                Scanner sc = new Scanner(System.in);
                System.out.println("Введіть день тижня");
                String inputDay = sc.nextLine();
                String doctorsWorking = "";
                if (inputDay.equalsIgnoreCase("Понеділок")) {
                    doctorsWorking = shift1.getDoctorsForDay(inputDay);
                } else if (inputDay.equalsIgnoreCase("Вівторок")) {
                    doctorsWorking = shift2.getDoctorsForDay(inputDay);
                } else if (inputDay.equalsIgnoreCase("Середа")) {
                    doctorsWorking = shift3.getDoctorsForDay(inputDay);
                } else if (inputDay.equalsIgnoreCase("Четвер")) {
                    doctorsWorking = shift4.getDoctorsForDay(inputDay);
                } else if (inputDay.equalsIgnoreCase("П'ятниця")) {
                    doctorsWorking = shift5.getDoctorsForDay(inputDay);
                } else if (inputDay.equalsIgnoreCase("Субота")) {
                    doctorsWorking = shift6.getDoctorsForDay(inputDay);
                } else if (inputDay.equalsIgnoreCase("Неділя")) {
                    doctorsWorking = shift7.getDoctorsForDay(inputDay);
                } else {
                    doctorsWorking = "Лікарі не працюють в цей день";
                }

                if (!doctorsWorking.isEmpty()) {
                    System.out.println("Лікарі, в яких чергування в цей день " + ": " + doctorsWorking);
                } else {
                    System.out.println("В цей день лікарі не працюють.");
                }
        }
        Patiens hospital = new Patiens();

        hospital.inputPatients();
        hospital.displayPatientsPerDay();

        int totalPatients = hospital.calculateTotalPatients();
        System.out.println("Загальна кількість пацієнтів за тиждень: " + totalPatients);


        Patiens patiens = new Patiens();
        Doctors doctors = new Doctors();
        Person ps1 = new Doctors("___", 2, 2);
        ps1.performProcedure();
        Person ps2 = new Patiens();
        ps2.performProcedure();

        Person person=new Person();
       person.appointment();
       Reviews reviews=new Reviews();
        reviews.performing();
       reviews.note();

       Schedule schedule=new Schedule();
       schedule.leaveanswer();


    }
}











































