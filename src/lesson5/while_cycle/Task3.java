package lesson5.while_cycle;

import java.util.Scanner;

public class Task3 {
    /*    3)Пользователь вводит число с клавиатуры. используя цикл while необходимо вывести в консоль все числа
     * от введенного числа до нуля. Если пользоаватель ввел отрицательное число, то необходимо попросить его
     * вести положительное число до тех пор, пока он не введет число больше нуля.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int x = scanner.nextInt();
        if (x <= 0) {
            while (x <= 0) {
                System.out.println("Введите число больше нуля!");
                x = scanner.nextInt();
            }
        }
        while (x > 0) {
            System.out.println(x);
            x--;
        }
    }
}
