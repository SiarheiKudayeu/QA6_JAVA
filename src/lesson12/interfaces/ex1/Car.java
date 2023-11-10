package lesson12.interfaces.ex1;

public class Car implements Move {
    static String name = "Car";

    @Override
    public void move() {
        System.out.println("I am " + name + ". And I drive");
    }
}
