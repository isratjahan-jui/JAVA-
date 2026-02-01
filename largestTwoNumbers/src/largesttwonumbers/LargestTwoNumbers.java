package largesttwonumbers;

import java.util.Scanner;

public class LargestTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number1:");
        int number1 = input.nextInt();
        System.out.println("Enter your number2:");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }

}
