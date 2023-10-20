package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Task {
    //arraySort
    public static void main(String[] args) {
        int[] newArray = new int[10];
        Random random = new Random();
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(newArray));

        for(int i = 0; i < newArray.length; i++){
            int min;
            for(int a = i + 1; a < newArray.length; a++){
                if(newArray[i] > newArray[a]){
                    min = newArray[a];
                    newArray[a] = newArray[i];
                    newArray[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
