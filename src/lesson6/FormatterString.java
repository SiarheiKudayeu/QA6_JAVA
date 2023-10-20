package lesson6;

import java.util.Date;

public class FormatterString {
    public static void main(String[] args) {
        //System.out.printf(format, arguments);

        //String %s
        String var = "text";
        System.out.printf("This is a string with %s good", var);
        System.out.println();
        System.out.printf("This is %s a string with %s good", var, "text2");
        System.out.println();
        System.out.printf("This is %2$s a string with %1$s good", "text1", "text2");

        //%c - char
        //%d - byte, short, int, long
        //%f - float, double

        //%b - boolean
        System.out.println();
        System.out.printf("Boolean formatter %b", null);
        System.out.println();
        System.out.printf("Boolean formatter %b", true);
        System.out.println();
        System.out.printf("Boolean formatter %b", false);
        System.out.println();
        System.out.printf("Boolean formatter %b", 24);



    }
}
