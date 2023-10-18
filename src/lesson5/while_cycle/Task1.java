package lesson5.while_cycle;

import java.util.Scanner;

public class Task1 {
    /*1) Написать программу, которая будет просить ввести пользователя с клавиатуры число до тех пор
    пока он не введет число 13. Также программа будет выводить в консоль число, введеное пользователем,
    если оно четное.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int x = scanner.nextInt();
        while (x != 13) {
            if (x%2==0){
                System.out.println("This number is " + x);
            }
            System.out.println("Введите число!");
            x = scanner.nextInt();
        }
    }
}
