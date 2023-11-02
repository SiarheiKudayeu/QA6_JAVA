package lesson8.overload;

import java.util.Arrays;

public class Overload {
    public void doSmth() {
        System.out.println("I am empty method");
    }

    public void doSmth(String text) {
        System.out.println("I am method with text: " + text);
    }

    public void doSmth(int number) {
        System.out.println("I am method with integer: " + number);
    }

    public void doSmth(int number, String text) {
        System.out.println("I am method with integer: " + number);
        System.out.println("I am method with text: " + text);
    }

    public void doSmth(String text, int number) {
        System.out.println("I am method with integer: " + number);
        System.out.println("I am method with text: " + text);
    }

    public void doSmth(int[] arrayNumber) {
        System.out.println(Arrays.toString(arrayNumber));
    }

    public int doSmth1() {
        return 34;
    }
    public int doSmth1(int x) {
        return x;
    }

    public static void main(String[] args) {
        Overload overload =new  Overload();
        overload.doSmth();
        System.out.println("===========");
        overload.doSmth("Text");
        System.out.println("===========");
        overload.doSmth(6);
        System.out.println("===========");
        overload.doSmth(73, "Number text");
        System.out.println("===========");
        overload.doSmth("Word", 22);
        System.out.println("===========");
        overload.doSmth(new int[]{23, 34, 5, 2,});
    }
}
