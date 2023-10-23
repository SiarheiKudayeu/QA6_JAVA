package lesson7;

public class PersonalMethodsExample {
    public static void sortArrayFromMinToMax(int[] numberstInt){
        for(int i = 0; i < numberstInt.length; i++){
            int max;
            for(int a = i + 1; a < numberstInt.length; a++){
                if(numberstInt[i] < numberstInt[a]){
                    max = numberstInt[a];
                    numberstInt[a] = numberstInt[i];
                    numberstInt[i] = max;
                }
            }
        }
    }

}
