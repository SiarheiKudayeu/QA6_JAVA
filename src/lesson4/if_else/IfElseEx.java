package lesson4.if_else;

import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        if (number > 0) {
            if(number==500){
                System.out.println("Your number > 0, and equals 500");
            } else {
                System.out.println("Your number > 0");
            }
        } else if (number < 0){
            System.out.println("Your number < 0");
        } else {
            System.out.println("Your number = 0");
        }

    }
}
