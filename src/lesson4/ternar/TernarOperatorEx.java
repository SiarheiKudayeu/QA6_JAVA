package lesson4.ternar;

import java.util.Scanner;

public class TernarOperatorEx {
    // условия ? выражение1 : выражение2
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        String message = age > 18 ? "You are adult" : "Go to garden";
        System.out.println(message);*/

        //Определить входит ли введенное число в интервал от 5 до 100 включительно
    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        String positiveResult = "введенное число входит в интервал от 5 до 100";
        String negativeResult = "введенное число не входит в интервал от 5 до 100";
        String result = number < 5 ? negativeResult : number > 100 ? negativeResult : positiveResult;
        System.out.println(result);*/

        System.out.println("Is car new?");
        Scanner scanner = new Scanner(System.in);
        boolean isCarNew = scanner.nextBoolean();
        int costAuto = isCarNew ? 10000 : 5000;
        System.out.println("Cost of your auto is " + costAuto);
    }
}
