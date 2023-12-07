
class Reviews extends AbstractPerson {

    void note(){
        System.out.println("Введіть вашу оцінку : ");
        int rating=scanner.nextInt();
        if (rating>=1 && rating <=5) {
            System.out.println("Отож ви оцінили нашу роботу в :" + rating + " бал(-ів;-a)" +". "+"Дякуємо за Ваш відгук! ");
        }else {
            System.out.println("Невірний формат оцінки. Введіть число від 1 до 5.");
        }
    }
}
