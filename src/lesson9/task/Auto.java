package lesson9.task;

import java.util.Objects;

public class Auto {
    /*4)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
создать геттеры и сеттеры для данных полей, а также конструктор класса,
принимающий в параметры все поля данного класса.
*/
    private String name;
    private int price;

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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Auto(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private boolean isNew;

    public Auto(String name, int price, boolean isNew) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return price == auto.price && Objects.equals(name, auto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        String result;
        if (isNew) {
            result = "This is new Auto";
        } else {
            result = "This is not new Auto";
        }
        return "Name of the auto is " + name + "\n" +
                "Price of the auto is " + price + "\n" +
                result;
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto("Skoda", 23454, true);
        Auto auto2 = new Auto("Skoda", 2345, true);
        System.out.println(auto1.hashCode());
        System.out.println(auto2.hashCode());
        System.out.println(auto1.equals(auto2));
    }
}

