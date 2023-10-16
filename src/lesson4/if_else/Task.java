package lesson4.if_else;


import java.util.Scanner;

public class Task {
    /*2) Написать программу которая спрашивает у пользователя вопрос:
            "Что вас интересует?".
    Если пользователь вводит с клавиатуры "Profession", то в консоль выводится "Automation Quality Assurance".
    Если пользователь вводит с клавиатуры "Programming language", то в консоль выводится "Java".
    Если пользователь вводит с клавиатуры "Group", то в консоль выводится "QA-6".
    В противном случае в консоль выводится "Information not found... Sorry".*/
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.println("Что вас интересует?");
        String result = question.nextLine();
        if (result.equals("Profession")) {
            System.out.println("Automation Quality Assurance");
        } else if (result.equals("Programming language")) {
            System.out.println("Java");
        } else if (result.equals("Group")) {
            System.out.println("QA-6");
        } else {
            System.out.println("Information not found... Sorry");
        }
    }
}
