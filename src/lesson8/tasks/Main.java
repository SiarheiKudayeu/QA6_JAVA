package lesson8.tasks;

public class Main {
    public static void main(String[] args) {
    /*    Task2 testWithMethods = new Task2();
        testWithMethods.data();
        System.out.println("Your age is " + testWithMethods.yourCurrentAge());*/
        Recipe recipe1 = new Recipe();
        recipe1.nameOfDish = "Salted water";
        recipe1.timeToCook = 10.5;
        recipe1.ingredients = new String[]{"Water", "Salt"};

        Recipe recipe2 = new Recipe();
        recipe2.nameOfDish = "Salad";
        recipe2.timeToCook = 20;
        recipe2.ingredients = new String[]{"Tomato", "Cucumber", "Salt","Oil"};

        recipe1.getInfo();
        System.out.println("========");
        recipe2.getInfo();

    }
}
