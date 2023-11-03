package lesson9.task;

import java.util.Scanner;

public class Task1 {
    /*    1)Написать метод, который будет спрашивать у пользователя ввести с клавиатуры предложение
    а после выводит в консоль из скольки слов состоит данное предложение.
    А также этот метод должен возвращать количество этих слов.*/
    public int str() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert sentence:");
        String string = scanner.nextLine();
        String[] string2 = string.split(" ");
        int i = string2.length;
        System.out.println("Count of words is " + i);
        return i;
    }

    public static void main(String[] args) {
        int number = new Task1().str();
        System.out.println("Count of words is " + number);
    }
}
