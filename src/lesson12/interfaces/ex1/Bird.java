package lesson12.interfaces.ex1;

public class Bird implements Move, Eat{
    static String name = "Bird";

    @Override
    public void move() {
        System.out.println("I am " + name + ". And I fly");
    }

    @Override
    public void eat() {
        System.out.println("I am " + name + ". And I eat");
    }

    @Override
    public void drink() {
        System.out.println("I am " + name + ". And I drink");
    }
}
