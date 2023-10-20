package lesson6;

import java.util.Arrays;
import java.util.Random;

public class ForEachEx {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        Random random = new Random();
        for (int number: arrayInt) {
            number = random.nextInt(-50, 50);
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}
