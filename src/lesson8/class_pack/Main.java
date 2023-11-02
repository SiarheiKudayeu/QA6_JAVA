package lesson8.class_pack;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Animal dog = new Animal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please name your pet:");
        dog.name = "Rex";
        System.out.println("Your pet's name is "+ dog.name );
        dog.getInfoAboutYourAnimal();
        System.out.println("===============");
        dog.age = 6;
        int x = dog.returnAgeOfTheAnimal()+8;
        System.out.println("Возраст вашего животного " + dog.returnAgeOfTheAnimal());
        System.out.println("===============");
        dog.someActionOfAnimal("Backflip",4);
        dog.someActionOfAnimal2(4,"Jump");
        System.out.println("===============");
        int howLong = dog.howMuchOurPetCanLeaveMore(15);
        System.out.println("You can leave " + howLong + " year!");
    }
}
