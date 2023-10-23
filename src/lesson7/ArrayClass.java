package lesson7;

import java.util.Arrays;
import java.util.Collections;

public class ArrayClass {
    public static void main(String[] args) {
        int[] x = {12, 123, 33, 44, 23, 232};

        //sort() - сортировка массива по возрастанию
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);

        //toString() - приводим массив к строковому типу и можем отобразить его содержимое
        String resultAfterSorting = Arrays.toString(x);
        System.out.println(resultAfterSorting.replace(",", ""));

        //Collections для сортировки в обратном порядке
        int[] x2 = {12, 123, 33, 44, 23, 232};
        Integer[] x2Integer = new Integer[x2.length];
        for (int i = 0; i < x2Integer.length; i++) {
            x2Integer[i] = x2[i];
        }
        Arrays.sort(x2Integer, Collections.reverseOrder());
        System.out.println(Arrays.toString(x2Integer));

        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println(Arrays.toString(names));


        //fill() заполняет массив указанным элементом
        String[] strings = new String[8];
        System.out.println(Arrays.toString(strings));
        Arrays.fill(strings, "-");
        System.out.println(Arrays.toString(strings));

        int[] ints = new int[10];
        Arrays.fill(ints, (int) (Math.random() * 100));
        System.out.println(Arrays.toString(ints));

        //binarySearch() получить индекс элемента по значение
        //names x2

        String[] strings1 = {"One", "Two", "Three"};
        System.out.println(Arrays.binarySearch(x2, 44));


        //equals()
        String[] strings2 = {"One", "Two", "Three"};
        System.out.println(strings1);
        System.out.println(strings2);
        System.out.println(strings1.equals(strings2));
        System.out.println(Arrays.equals(strings2, strings1));

        //deepToString()
        System.out.println("============");
        int[][] numbers = {
                {1, 2, 3, 4, 13}, {5, 6, 7}, {9, 10, 11}
        };
        int[][] numbers2 = {
                {1, 2, 3, 4, 13}, {5, 6, 7}, {9, 10, 11}
        };
        System.out.println(Arrays.deepToString(numbers2));
        System.out.println(Arrays.deepEquals(numbers, numbers2));

        //copyOf()
        String[] strings3 = Arrays.copyOf(strings2, strings2.length);
        System.out.println(Arrays.toString(strings3));

        //System.arraycopy() - специальный метод для копирования массивов
        //первый параметр - это массив из которого нужно копировать данные,
        //второй параметр - индекс элемента массива с которого мы начинаем копирование
        //третий параметр - массив в который мы будем вставлять элементы
        //четвертый параметр -индекс элемента массива с которого мы начинаем вставлять скопированные данные
        //пятый параметр - количество копируемых элементов
        int[] arrayParent = {3, 34, 123, 3, 5, 78, 53, 345, 45};
        int[] arrayChild = new int[20];
        System.arraycopy(arrayParent, 2, arrayChild, 4, 5);
        System.out.println(Arrays.toString(arrayChild));

        PersonalMethodsExample.sortArrayFromMinToMax(arrayParent);
        System.out.println("===========");
        System.out.println(Arrays.toString(arrayParent));
    }
}
