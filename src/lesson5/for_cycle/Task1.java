package lesson5.for_cycle;

import java.util.Scanner;

public class Task1 {
    /*   4)Пользователь вводит слово с клавиатуры, оно выводится в консоль таким образом, что каждый символ
   выводится через пробел. Используем для этого цикл for.
   Пример: пользователь ввел слово "Картина", в консоль выводится "К а р т и н а"
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i) + " ");
        }
    }
}
