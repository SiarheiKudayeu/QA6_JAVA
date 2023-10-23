package lesson7.homeworks;

public class Task1 {
    public static void main(String[] args) {
        /*Coздать две переменные типа int:
    int a = 7;
    int b = 9;
    Поменять между собой значения переменных a и b.
    Создавать новые переменные нельзя.
    Можно применять только арифметические действия к перемнным a и b.
    Вывести в консоль значения переменных a и b после их переопределения.*/
 /*       int a = 7;
        int b = 9;
        a = a + b; //a = 16 b = 9
        b = a - b; //a = 16 b = 7
        a = a - b; //9
        System.out.println("значение а " + a);
        System.out.println("значение b " + b);*/

/*        int a = 7;
        int b = 9;
        b = a + b -  (a = b);
        System.out.println("значение а " + a);
        System.out.println("значение b " + b);*/

        int a = 7;
        int b = 9;
        a = b;
        System.out.println("значение а " + a);
        b = --a - a/--a;
        System.out.println("значение b " + b);

    }
}
