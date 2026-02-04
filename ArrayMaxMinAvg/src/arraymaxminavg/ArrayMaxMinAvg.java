package arraymaxminavg;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMinAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many number you want");
        int n = input.nextInt();
        int numbers[] = new int[n];
        System.out.println(" begining loop" + Arrays.toString(numbers));
        for (int index = 0; index < n; index++) {

            System.out.print("enter your number" + (index + 1));

            getPosition(index + 1);
            int userInput = input.nextInt();
            numbers[index] = userInput;
        }
        System.out.println("End loop" + Arrays.toString(numbers));
        MaxNumber(numbers);
        MinNumber(numbers);
        AvgNumber(numbers);
    }

    public static void getPosition(int number) {
        switch (number) {
            case 1 ->
                System.out.println("st");
            case 2 ->
                System.out.println("nd");
            case 3 ->
                System.out.println("rd");
            default ->
                System.out.println("th");
        }
    }

    public static void MaxNumber(int[] jui) {
        int max = 0;
        for (int item : jui) {
            if (item >= max) {
                max = item;
            }
        }
        System.out.println("Max number is" + max);
    }

    public static void MinNumber(int[] jui) {
        int min = 999999;
        for (int item : jui) {
            if (item <= min) {
                min = item;
            }
        }
        System.out.println("Min number is" + min);
    }

    public static void AvgNumber(int[] jui) {
        double sum = 0;

        for (int item : jui) {
            sum += item;}
        double avg = (double) sum / jui.length;
        System.out.println("Avg number is" + avg);
    }

}
