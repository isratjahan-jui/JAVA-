package ajrobibarbyhumaiunahmed;

import java.util.Arrays;
import java.util.Scanner;

public class HighLowNumber5Comand {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numbers[] = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number");
            int input = s.nextInt();
            numbers[i] = input;
        }
        System.out.println("All number " + Arrays.toString(numbers));

//initialize with first elemennt---
//        int max = 0;
//        int min = 999999;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

        }

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }

}
