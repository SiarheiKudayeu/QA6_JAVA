package lesson8.tasks;

import java.util.Scanner;

public class Task1 {
        /*    Необходимо вывести на экран перевернутый прямоугольный треугольник прямым углом сверху в левой части.
        Для вывода использовать условные операторы, циклы.
        Команду System.out.println(); System.out.print(); и можно использовать только с одним символом *.
        Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
        а программа выводит сам треугольник.
        Пример с числом 7:
                *******
                ******
                *****
                ****
                ***
                **
                *

                *******
                *    *
                *   *
                *  *
                * *
                **
                *
        Необходимо написать программу для вывода вначале заполненного, а потом и пустого треугольника.*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int integer = scanner.nextInt();
            for (int i = integer; i>0; i--){
                System.out.println("");
                for ( int j = i; j >0; j--){
                    char char1 = '*';
                    System.out.print(char1);
                }
            }
        }
}
