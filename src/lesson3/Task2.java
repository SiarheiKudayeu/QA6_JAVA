package lesson3;

public class Task2 {
    /*     2) Создать переменную text типа String и разместить в нее произвольный текст.
        Пусть в консоль выводится сообщение "Is the length of the String more than 100 characters?"
        , а после выводится true, если количество символов в данном тексте превышает 100,
        В противном случае пусть выводится false
        */
    public static void main(String[] args) {
        String text = "Hello";
        boolean someResult = text.length()>100;
        System.out.println("Is the length of the String more than 100 characters? " + (text.length()>100));
    }
}
