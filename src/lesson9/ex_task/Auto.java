package lesson9.ex_task;

public class Auto {
    private String name;
    private int price;
    private int distanceBeforeTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDistanceBeforeTo() {
        return distanceBeforeTo;
    }

    public void setDistanceBeforeTo(int distanceBeforeTo) {
        this.distanceBeforeTo = distanceBeforeTo;
    }

    public Auto(String name, int price, int distanceBeforeTo) {
        this.name = name;
        this.price = price;
        this.distanceBeforeTo = distanceBeforeTo;
    }
}
