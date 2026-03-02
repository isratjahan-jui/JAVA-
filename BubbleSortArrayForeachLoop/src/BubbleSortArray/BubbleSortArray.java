package BubbleSortArray;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortArray {

    public static void main(String[] args) {

//        user Input start---
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
//     user Input end---
        System.out.println("Ending of loop " + Arrays.toString(numbers));
        // --- Method call---
        System.out.println("Bubble sort " + Arrays.toString(BubbleSort(numbers)));
//         user Input end---

//      Without  user Input start ---
        int arrays[] = {56, 80, 98, 17, 33, 45};
//        --- Method call---
        System.out.println("Bubble sort " + Arrays.toString(BubbleSort(arrays)));

    }

    public static int[] BubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        }
        return array;
    }

}
