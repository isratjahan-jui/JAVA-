package multidimensionalarray2;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray2 {

    public static void main(String[] args) {

//        int[][] numbers = new int[3][4];
//
//        numbers[0][0] = 1;
//        numbers[0][1] = 2;
//        numbers[0][2] = 3;
//        numbers[0][3] = 4;
//
//        numbers[1][0] = 5;
//        numbers[1][1] = 6;
//        numbers[1][2] = 7;
//        numbers[1][3] = 8;
//
//        numbers[2][0] = 9;
//        numbers[2][1] = 10;
//        numbers[2][2] = 11;
//        numbers[2][3] = 12;
//
//        for (int row = 0; row < numbers.length; row++) {
//
//            for (int col = 0; col < numbers[row].length; col++) {
//                System.out.print(numbers[row][col] + "\t");
//            }
//            System.out.println("");
//        }
//-----with user input ------
        Scanner s = new Scanner(System.in);

        System.out.print("Enter of rows number : ");
        int rowSize = s.nextInt();

        System.out.print("Enter of cols number : ");
        int colSize = s.nextInt();

        int[][] numbers = new int[rowSize][colSize];

        for (int row = 0; row < numbers.length; row++) {

            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("Enter value per row " + (row + 1) + "col " + (col + 1));
                int userInput = s.nextInt();
                numbers[row][col] = userInput;
            }

        }
        System.out.println(Arrays.deepToString(numbers));

//--------mattrix akare dekhanor joono nichger loop---
        for (int[] item : numbers) {
//            System.out.println(Arrays.toString(item));
            for (int singel : item) {
                System.out.print(singel + "\t");

            }
            System.out.println("\n");

        }

    }
    
    
}
