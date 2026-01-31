package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = input.nextInt();
        int counter = 0;
//        int i;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                counter = counter + 1;
//                  counter ++;
            }
        }
        if (counter == 2) {
            System.out.println("it is a prime number");

        } else {
            System.out.println("it is not a prime number");

        }

    }

}
