public class Procedures {
    private double price;
    private double time;

    public Procedures(double price, double time) {
        this.price = price;
        this.time = time;
    }

    //Опис процедури
    void description() {
        System.out.println("Час:" + " " + time);
    }

    void findPrice() {
        System.out.println("Ціна:" + price + " грн");
    }


    public void setPrice(int price) {
        this.price = (double) price;
    }

    public double getPrice() {
        return price;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }




    }







