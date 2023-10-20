package lesson6;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /*Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа
//     и символ – или + или % или / или *. На экран выводится результат действия над двумя введенными числами.
//     Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number1:");
        double number1 = scanner.nextDouble();
        System.out.println("Insert number2:");
        double number2 = scanner.nextDouble();
        System.out.println("Insert char:");
        String symbol = scanner.next();
        double result = symbol.equals("–") ? number1 - number2 :
                symbol.equals("+") ? number1 + number2 :
                        symbol.equals("%") ? number1 % number2 :
                                symbol.equals("/") ? number1 / number2 :
                                        symbol.equals("*") ? number1 * number2 : 0;
        System.out.println(result);
    }
}
