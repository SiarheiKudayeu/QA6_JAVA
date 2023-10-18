package lesson5.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTruString {
    public static void main(String[] args) {

        String[] strings = new String[4];
        //1)Вручную
        strings[0] = "Zero";
        strings[1] = "One";
        System.out.println(Arrays.toString(strings));


        //2) Явная инициализация
        String[] strings1 = {"First", "Second", "Third"};
        System.out.println(Arrays.toString(strings1));

        Scanner[] scanners = new Scanner[3];
        scanners[0] = new Scanner(System.in);
        scanners[1] = new Scanner(System.in);
        scanners[2] = new Scanner(System.in);
        System.out.println(Arrays.toString(scanners));

    }
}
