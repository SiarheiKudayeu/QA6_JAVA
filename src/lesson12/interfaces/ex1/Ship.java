package lesson12.interfaces.ex1;

public class Ship implements Move {
    static String name = "Ship";

    @Override
    public void move() {
        System.out.println("I am " + name + ". And I swim");
    }
}
