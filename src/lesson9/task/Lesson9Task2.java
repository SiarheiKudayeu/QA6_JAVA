package lesson9.task;

import java.util.Arrays;
import java.util.Random;

public class Lesson9Task2 {
        /*2) Создать метод который принимает в параметры значение типа int, после создает массив
    Заполненный случайными числами от 1 до 100 размеренностью, равной введенному в параметру int.
    Данный метод выводит в консоль все значения данного массива и  возвращает минимальное значение данного массива.*/
        public int int1 (int i){

            int[] array=new int[i];
            Random random=new Random();
            for(int j=0;j<array.length;j++){
                array[j]= random.nextInt(100);
            }
            System.out.println(Arrays.toString(array));
            int min=array[0];
            for (int j=0;j< array.length;j++){
                if (array[j]<min){
                    min=array[j];
                }
            }
            return min;
        }

    public static void main(String[] args) {
        System.out.println(new  Lesson9Task2().int1(5));
    }
}

