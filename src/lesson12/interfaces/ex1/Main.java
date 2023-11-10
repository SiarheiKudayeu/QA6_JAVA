package lesson12.interfaces.ex1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Car car = new Car();
        Ship ship = new Ship();

        bird.move();
        car.move();
        ship.move();
        bird.eat();
    }
}
