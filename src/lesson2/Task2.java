package lesson2;

public class Task2 {
 /*       1.5) int x = 5;
       int y = 4 + x++;
       y+= --y - x;
       int z = y++;
Ответ: x = 6, y = 12, z = 11

  */

    /*

    int x = 5;
           int y = 4 + x++;
           y+= --y - x;
           int z = y++;

        int x = 5;
        int y = 4;
        x = 8;
        y = 8;
        int z = 7 + 7;
        Ответ: x = 7, y = 7, z = 14
        */
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        x = x++ - y++ + ++x;
        y += 3;
        int z = --x + --y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
