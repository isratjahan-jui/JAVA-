


package practicearray;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number do you want to compare?");
        int n = input.nextInt();
        int numbers[] = new int[n];
        System.out.println("begining of loop " + Arrays.toString(numbers));
        for (int index = 0; index < n; index++) {
            System.out.println("Enter your " + (index + 1) + " number");
            int userInput = input.nextInt();
            numbers[index] = userInput;
        }
        System.out.println("Ending of loop " + Arrays.toString(numbers));

        findMaxNumber(numbers);
        findMinNumber(numbers);
        findAvgNumber(numbers);

    }

    public static void findMaxNumber(int[] numbers) {
        int max = 0;
        for (int item : numbers) {
            if (item >= max) {
                max = item;
            }
        }
        System.out.println("Max number is " + max);
    }

    public static void findMinNumber(int[] numbers) {

//        int min =999999999;
        int min = numbers[0];
        for (int item : numbers) {
            if (item <= min) {
                min = item;
            }
        }
        System.out.println("Min number is " + min);
    }

    public static void findAvgNumber(int[] numbers) {
        double sum = 0;
//       int size=numbers.length;
        for (int item : numbers) {
            sum += item;
        }
//       double avg = sum / size;
        double avg = sum / numbers.length;
        System.out.println("Avg number is " + avg);
    }
}