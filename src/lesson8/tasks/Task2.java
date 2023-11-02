package lesson8.tasks;

import java.util.Date;
import java.util.Scanner;

public class Task2 {
    /*             1) Написать метод, принимающий в качестве параметров два числа,
    который будет выводить на консоль сумму этих двух чисел.
    принимает - не возвращает
    */
    public void sumOfElements(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    /*            2) Написать второй метод, который будет возвращать сумму двух чисел,
   которые он будет принимать в параметре метода.
   Вывести на консоль сумму двух любых чисел при помощи первого и второго метода.
   принимает - возвращает
   */
    public int sumOfElements2(int number1, int number2) {
        return number1 + number2;
    }


    /*3) Написать метод, который будеть выводить в консоль какое точное время и дата сейчас
                на вашем устройстве. В формате такого типа: 12 June 2022 year, 14:55
              */
    public void data() {
        Date date = new Date();
        System.out.printf("%1$td %1$tB %1$tY year, %1$tH:%1$tM", date);
        System.out.println();
    }

 /*                   4) Написать метод, который будет просить ввести с клавиатуры ваш год рождения.
    Данный метод возвращает int который равен вашему возрасту.
    Используем класс Date как на прошлом занятии.
            (P.s пока не затрагиваем момент месяца рождения,
    останавливаемся только на разнице лет.)*/

    public int yourCurrentAge() {
        System.out.println("Insert Your year of birth:");
        return Integer.parseInt(String.format("%tY", new Date())) - new Scanner(System.in).nextInt();
    }
}
