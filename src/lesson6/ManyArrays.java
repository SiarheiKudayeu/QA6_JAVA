package lesson6;

public class ManyArrays {
    public static void main(String[] args) {
        //Двумерный массив
        int[][] numbers = new int[3][4];  // { {1,2,3,13}, {5,6,7,4}, {9,10,11,4} }


        int[][] numbers2 = {
                {1, 2, 3, 4, 13}, {5, 6, 7}, {9, 10, 11}
        };
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print("( ");
            for (int b = 0; b < numbers2[i].length; b++) {
                System.out.print(numbers2[i][b] + ", ");
            }
            System.out.print("\b\b)");
            System.out.println();


            //Трехмерные
            int[][][] three = {
                    {{1,2},{3,4}}, {{5,6},{7,8}}, {{9,10},{11,12}}
            };
        }
    }
}
