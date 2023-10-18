package lesson5.while_cycle;

public class WhileEx {
    public static void main(String[] args) {
 /*       int iterator = 1;
        while (iterator <= 10){
            System.out.println("This is line number "+ iterator);
            iterator++;
        }*/
 /*       int iterator1 = 1;
        while (true) {
            System.out.println("This is break line number " + iterator1);
            iterator1++;
            if (iterator1 > 10) {
                break;
            }
        }*/

        int iterator2 = 1;
        while (iterator2 <= 10) {
            if (iterator2%2==0){
                System.out.println("This number is " + iterator2);
            }
            iterator2++;
        }
    }
}
