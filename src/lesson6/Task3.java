package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    //Пользователь вводит строку с клавиатуры. Все цифры из данной строки
    //должны быть помещены в массив. Массив необходимо отсортировать по возрастанию
    //и вывести на экран.
    //afbasfb89abfafb74kjbkljashg904j8;kj;h498  [3,234,25] [3,25,234]
    public static void main(String[] args) {
/*        char x = 'A';
        System.out.println(Character.isDigit(x));*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert String");
        String text = scanner.nextLine();
        String result = "";
        //System.out.println("lkcqlkclkqcn3l;knlkn234lklknl;kn25cqscq2acasc4".split("\\d").length);
        if(text.split("\\d").length == 1) {
            System.out.println("В данном тексте нет чисел");
        } else {
           for(int i = 0; i < text.length(); i++){
               if(Character.isDigit(text.charAt(i))){
                   result = result + text.charAt(i);
                   while ((i+1 != text.length()) && Character.isDigit(text.charAt(i+1))){
                       i = i +1;
                       result = result + text.charAt(i);
                   }
                   result = result + " ";

               }
           }
        }
        System.out.println(result);
        int x = 5;
        String[] arrayString = result.split("\\s");
        System.out.println(Arrays.toString(arrayString));

        int[] arrayInt = new int[arrayString.length];

        for(int i = 0; i < arrayInt.length; i++){
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }

        System.out.println(Arrays.toString(arrayInt));

        //Упорядочить по возрастанию
        for(int i = 0; i < arrayInt.length; i++){
            int min;
            for(int a = i + 1; a < arrayInt.length; a++){
                if(arrayInt[i] > arrayInt[a]){
                  min = arrayInt[a];
                  arrayInt[a] = arrayInt[i];
                  arrayInt[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(arrayInt));

    }

}
