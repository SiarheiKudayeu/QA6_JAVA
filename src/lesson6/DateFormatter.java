package lesson6;

import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        //%t %T

        //H - часы, M - минуты, S - секунды, L - миллисекунды , N - наносекунды.
        //p - добавляет информацию о pm и am
        System.out.printf("Вывести дату в формате: %tH\n", date);
        System.out.printf("Вывести дату в формате: %tM\n", date);
        System.out.printf("Вывести дату в формате: %tS\n", date);
        System.out.printf("Вывести дату в формате: %1$tH:%1$tM:%1$tS\n", date);

        //A - день недели, d - две цифры даты , B - месяц, m - месяц в виде цифры,
        // Y - год, y - две фин цифры года
        System.out.printf("Вывести дату в формате: %1$tA %1$td %1$tB  \n", date);
        String currentDate = String.format("Вывести дату в формате: %1$tA %1$td %1$tB  \n", date);
        System.out.println("==========");
        System.out.println(currentDate);

        int tomorrowDate = Integer.parseInt(String.format("%td",date))+1;
        System.out.println(tomorrowDate);
    }
}
