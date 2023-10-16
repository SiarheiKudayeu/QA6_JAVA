package lesson4.switch_case;

import java.util.Scanner;

public class SwitchCaseExample {
    // Dev, QA, DevOps
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your profession:");
        String profession = scanner.nextLine();

        switch (profession.toLowerCase()){
            case ("qa"):
            case ("aqa"):
                System.out.println("Hello QA");
                System.out.println("Are you testing mobile apps?");
                String mobile = scanner.nextLine();
                switch (mobile){
                    case ("yes"):
                        System.out.println("You are testing mobile apps.");
                        break;
                    case ("no"):
                        System.out.println("You are not testing mobile apps.");
                        break;
                }
                break;
            case ("dev"):
                System.out.println("Hello Dev");
                break;
            case ("devops"):
                System.out.println("Hello DevOps");
                break;
            default:
                System.out.println("There is no such profession.");
        }
    }

}
