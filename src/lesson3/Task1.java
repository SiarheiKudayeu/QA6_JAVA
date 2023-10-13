package lesson3;

public class Task1 {
    /*    1) Создать пять любых переменных типа String ( word1, word2, word3 и т.д. ).
     Создать также переменную типа String result1 и result2.
     Поместить в result1 все слова word1 - word5 используя метод concat.
     Поместить в result2 все слова word1 - word5 используя оператор +.
     Вывести result1 и result2 в консоль.
     */
    public static void main(String[] args) {
        String word1 = "home";
        String word2 = "home1";
        String word3 = "home2";
        String word4 = "home3";
        String word5 = "home4";
        String result1 = word1.concat(" ").concat(word2).concat(word3).concat(word4).concat(word5);
        String result2 = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
        System.out.println(result1);
        System.out.println(result2);
    }

}
