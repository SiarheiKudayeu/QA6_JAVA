package lesson9.constructor;

public class Main {
    public static void main(String[] args) {
        Home home = new Home("Паникахи", 8, 2, false);
        Home home1 = new Home();
        home.getInfo();
        System.out.println("=============");
        home1.getInfo();
        Home home2 = new Home(23,232,true,"Street");
    }
}
