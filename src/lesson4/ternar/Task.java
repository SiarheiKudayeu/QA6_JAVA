package lesson4.ternar;

import java.util.Scanner;

public class Task {
    /*6)Программа просит ввести с клавиатуры число.
    При помощи тернарного оператора вывести в консоль, является ли введенное число
    больше нуля, меньше нуля, или оно равно нулю.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        String result = number > 0 ? "Больше 0" : number < 0 ? "Меньше 0" : "Равно 0";
        System.out.println(result);
    }
}
