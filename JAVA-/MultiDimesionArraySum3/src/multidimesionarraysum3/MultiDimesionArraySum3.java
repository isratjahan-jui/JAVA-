package multidimesionarraysum3;

import java.util.Arrays;

public class MultiDimesionArraySum3 {

    public static void main(String[] args) {

    }

    public static void sumMultidimensionalArray(int[][] myArray) {
        int sum = 0;
        for (int[] row : myArray) {
            for (int col : row) {
                sum += col;
            }
            System.out.println(sum);
        }

    }

    public static void sumMultidimensionalArraysum(int[][] myArray) {
        int sum[] = new int[3];
        int colSum = 0;

        // nested loop diye sob element jog kora
        // column loop
        for (int col = 0; col < myArray.length; col++) {
            // row loop
            for (int row = 0; row < myArray.length; row++) {   // column loop
                colSum += myArray[row][col];
            }
            sum[col] = colSum;
            colSum = 0;
        }

        System.out.println(Arrays.toString(sum));
    }

}
