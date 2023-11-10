package lesson12.abstract_class.ex1;

public class Cucuruznik extends Plane{
    public Cucuruznik(String name, int cost, boolean hasPropeller) {
        super(name, cost, hasPropeller);
    }

    @Override
    void move() {
        System.out.println("Кручу пропеллер!");
    }
}
