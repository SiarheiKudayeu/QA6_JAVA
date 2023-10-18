package lesson5.arrays;

import java.util.Arrays;

public class ArraysTry {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        int[] arrayInt2 = new int[5];
   /*     int firstElement = arrayInt[0];
        System.out.println(firstElement);
        int secondElement = arrayInt[1];
        System.out.println(secondElement);*/
        System.out.println(arrayInt);
        System.out.println(arrayInt2);

        String arrayInt1ToString = Arrays.toString(arrayInt);
        System.out.println(arrayInt1ToString);

        //1)Вручную
        arrayInt[0] = 12;
        arrayInt[1] = 13;
        arrayInt[2] = 77;
        arrayInt[3] = 143436;
        arrayInt[4] = 6;
        System.out.println(Arrays.toString(arrayInt));

        //2) Явная инициализация
        int[] array3 = {3, 123, 334, 55};
        System.out.println(Arrays.toString(array3));
        System.out.println(arrayInt.length);
        System.out.println(array3.length);

        //3) цикл for
        int[] forArray = new int[11];
        for (int i = 0; i < forArray.length; i++) {
            forArray[i] = (i + 1) * 10;
        }
        System.out.println("===========");
        System.out.println(Arrays.toString(forArray));

        for (int i = 0; i < forArray.length; i++){
            System.out.print(forArray[i] + " ");
        }
    }
}
