import java.util.Scanner;
public class Schedule implements LeaveAnswer {

    private String days;
    private String doctors;
    Scanner scanner = new Scanner(System.in);

    public Schedule(String days, String doctors) {

        this.doctors = doctors;
        this.days = days;
    }

    public Schedule() {

    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getDoctors() {
        return doctors;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }

    public boolean isDayValid(String day) {
        return days.contains(day);
    }

    public String getDoctorsForDay(String day) {
        if (isDayValid(day)) {
            return doctors;
        }
        return day;
    }

    @Override
    public void leaveanswer() {
        System.out.println("Введіть ваше ім'я:");
        String name = scanner.nextLine();
        System.out.println("Залиште свій коментар: ");
        String comment = scanner.nextLine();
        System.out.println("Дякуємо, " + name + "! Ваш коментар: " + comment);

    }
}











