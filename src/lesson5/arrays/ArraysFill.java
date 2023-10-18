package lesson5.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysFill {
    public static void main(String[] args) {
        //Вариант1
        Random randomObject = new Random();
        int randomInt = randomObject.nextInt(-50, 50);
        System.out.println(randomInt);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i ++ ){
            array[i] = randomObject.nextInt(-20, 20);
        }
        System.out.println(Arrays.toString(array));

        //Вариант2
        int randomInt2 = (int) ((Math.random() * 41) - 20);
        System.out.println(randomInt2);
    }
}
