package lesson12.interfaces.ex1;

public abstract class Fish implements Eat{
    @Override
    public void eat() {
        System.out.println("Fish eat");
    }
}
