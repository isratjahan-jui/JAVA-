package numberisprime;

import java.util.Scanner;

public class NumberIsPrime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(number + " It is Prime Number.");
        } else {
            System.out.println(number + " It is not Prime Number.");
        }

    }

}
