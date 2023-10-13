package lesson3;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        int x = 9;
        //System.out.println("hello hello");
        String word = new String("Text");
        //System.out.println(word);
        String word2 = "Text2";
        //System.out.println(word2);

        System.out.println(word2.concat(word));
        word2 = word2.concat(" ").concat(word);
        System.out.println(word2);

        //+ equals concat
        System.out.println("===============");
        String word3 = "Text3";
        String word4 = "Text4";
        System.out.println(word3 + " " + word4);
        String gorshock = word3 + " " + word4;
        System.out.println(gorshock);

        //concat 2
        System.out.println("==================");
        System.out.println(word4 + " " + 13 + " " + (12 < 20));
        String numberString = "300";
        int number = Integer.parseInt(numberString);
        System.out.println(numberString + 200);
        System.out.println(number + 200);

        int number2 = Integer.parseInt(numberString);

        //символы экранирования \n \b
        System.out.println("==============");
        String text = "My random test\n = \"Test1\"!!\b";
        System.out.println(text);
        String xy = "\"Test1\"!";

        //System.out.println вывод следующего текста с новой строки
        //System.out.printl  вывод следующего текста с той же строки
        System.out.println("===========");
        System.out.println("First string");
        System.out.print("Second string");
        System.out.println("Third string");
        System.out.println("Next");

        //length()
        System.out.println("==========");
        String anyMeaning = "qwert5";
        int countOfSymbols = anyMeaning.length();
        System.out.println(countOfSymbols);

        //valueOf()
        boolean boo = false;
        double dou = 3.0;
        String booString = String.valueOf(boo);
        String douString = String.valueOf(dou);

        String result = "" + boo + dou;
        System.out.println(result);

        //contains
        System.out.println("=============");
        String containsString = "This random text with strings etc";
        boolean resultContains = containsString.contains("textwefwef");
        System.out.println(resultContains);
        System.out.println(containsString.contains("text"));


    }
}
