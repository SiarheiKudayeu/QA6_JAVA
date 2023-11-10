package lesson12.interfaces.ex1;

public interface Eat {
    void eat();
    void drink();

    default void jump() {
        System.out.println("I believe I can jump");
    }
}
