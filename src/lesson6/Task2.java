package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    /*    2)Заполнить массив на 10 элементов случайными числами от 0 до 100.
    Вывести в консоль все значения данного массива.
    Найти минимальный элемент и вывести его на консоль.
    */
    public static void main(String[] args) {
        int[] integer = new int[10];
        Random random = new Random();

        for (int i = 0; i < integer.length; i++) {
            integer[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(integer));
        int min = integer[0];
/*        for (int i = 0; i < integer.length; i++) {
            if (min > integer[i]) {
                min = integer[i];
            }
        }*/

        for (int value : integer) {
            if (value < min) {
                min = value;
            }
        }


        System.out.println(min);
    }
}
