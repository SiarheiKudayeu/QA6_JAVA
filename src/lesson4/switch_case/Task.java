package lesson4.switch_case;

import java.util.Scanner;

public class Task {
    /*1)
    Используем switch-case
    Пользоватьель вводит с клавиатуры число:
    Если число равно 1, то выводин на консоль "Понедельник";
    Если число равно 2, то выводин на консоль "Вторник";
    Если число равно 3, то выводин на консоль "Среда";
    Если число равно 4, то выводин на консоль "Четверг";
    Если число равно 5, то выводин на консоль "Пятница";
    Если число равно 6, то выводин на консоль "Суббота";
    Если число равно 7, то выводин на консоль "Воскресенье";
    В противном случае выводим текст: "Лучше бы сегодня была пятница".
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put number:");
        int number = scanner.nextInt();
        switch (number) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Середа");
                break;
            default:
                System.out.println("Лучше бы сегодня была пятница");
        }
    }
}
