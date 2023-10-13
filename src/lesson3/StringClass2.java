package lesson3;

public class StringClass2 {
    public static void main(String[] args) {
        String string = "System.out.println вывод следующего текста с новой строки";
        //charAt
        System.out.println(string.charAt(0));
        int length = string.length();
        System.out.println(string.charAt(length - 1));

        //indexOf() lastIndexOf()
        String example = "qwertye";
        System.out.println(example.indexOf("e"));
        System.out.println(example.lastIndexOf("e"));

        //substring()
        String string2 = "вывод следующего текста с новой строки";
        System.out.println(string2.substring(6));
        System.out.println(string2.substring(6, 16));
        System.out.println(string2.substring(0, 6));
        System.out.println(string2.substring(string2.length() - 6));

        //replace
        System.out.println("=========");
        String string3 = "вывод следующего текста с новой строки";
        System.out.println(string3.replace("текста", "слова"));
        System.out.println(string3.replace("текста", "\b"));

        //equals
        int x = 5;
        int y = 6;
        boolean what = x == y;
        String one = "My String";
        String two = "My String";
        boolean whatString = one.equals(two);
        System.out.println(whatString);

        //startsWith(), endsWith()
        System.out.println("=============");
        String string4 = "вывод следующего текста с новой строки";
        System.out.println(string4.startsWith("вывод"));
        System.out.println(string4.startsWith("выfeвод"));
        System.out.println(string4.endsWith("с новой строки"));
        System.out.println(string4.endsWith("с новой строкиdwvwd"));



    }
}
