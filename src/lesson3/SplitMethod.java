package lesson3;

public class SplitMethod {
    public static void main(String[] args) {
        //split
        String string = "С другой стороны, дальнейшее";
        String[] arrayOfWords = string.split(" ");
        System.out.println("Количество слов в мешке arrayOfWords равно " + arrayOfWords.length);
        String word1 = arrayOfWords[0];
        String word2 = arrayOfWords[1];
        String word3 = arrayOfWords[2];
        String word4 = arrayOfWords[3];
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3.replace(",",""));
        System.out.println(word4);

        //toLowerCase(), toUpperCase()
        System.out.println("============");
        String string2 = "С другой стОроны, дальнЕйшее";
        System.out.println(string2.toLowerCase());
        System.out.println(string2.toUpperCase());
        System.out.println(string2.replace("другой", ("другой").toUpperCase()));

        //trim
        String string3 = " С другой стОроны, дальнЕйшее. ";
        System.out.println(string3);
        System.out.println(string3.trim());
    }



}
