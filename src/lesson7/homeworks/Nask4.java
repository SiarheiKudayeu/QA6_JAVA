package lesson7.homeworks;

import java.util.Scanner;

public class Nask4 {
    public static void main(String[] args) {
/*        У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.
//
//   Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine())
//   присвоить перемнным типа String следующие значения:
//   string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно?
//   Помимо string1, string2, string3, string4 новых переменных создавать нельзя.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я тестирую замечательно. Что еще нужно?");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next() + " ";
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);


    }
}
