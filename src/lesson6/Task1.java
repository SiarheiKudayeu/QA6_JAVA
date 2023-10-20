package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /*1)Заполнить массив на 10 элементов случайными числами
    от -50 до +50.
    Вывестив консоль сам массив.
    Вывести в консоль сумму всех его элементов.*/
    public static void main(String[] args) {
        int[] newArray = new int[10];
        Random random = new Random();
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(newArray));

        int sumResult = 0;
        for (int i = 0; i < newArray.length; i++) {
            sumResult = sumResult + newArray[i];
        }
        System.out.println("сумму всех его элементов = " + sumResult);
    }
}
