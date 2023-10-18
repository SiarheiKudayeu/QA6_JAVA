package lesson5.while_cycle;

import java.util.Scanner;

public class DoWhileChicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше нуля!");
        int x = scanner.nextInt();
        while (x > 0) {
            System.out.println(x);
        }


        do {
            System.out.println(x);
        } while (x > 0);
    }
}
