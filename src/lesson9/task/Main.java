package lesson9.task;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.getInfo();
        aquarium.setHeight(22);
        aquarium.setLength(33);
        aquarium.setWidth(543);
        aquarium.setName("Nemo");
        aquarium.getInfo();
        System.out.println(aquarium.getName());
    }
}
