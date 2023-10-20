package lesson6;

import java.util.Arrays;
import java.util.Random;

public class ForEachCycle {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        Random random = new Random();
        System.out.println(Arrays.toString(arrayInt));
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(-50, 50);
        }

        //вывод элементов массива при помощи for
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]+ " ");
        }
        System.out.println();

        //вывод элементов массива при помощи forEach
        for (int nameOfAbstractElement : arrayInt){
            System.out.print(nameOfAbstractElement + " ");
        }
    }
}
