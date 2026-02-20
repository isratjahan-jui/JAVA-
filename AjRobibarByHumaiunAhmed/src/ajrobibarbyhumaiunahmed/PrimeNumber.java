package ajrobibarbyhumaiunahmed;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scan.nextInt();

        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("It is a prime  number");
        } else {
            System.out.println("It is not a prime  number");
        }

    }

}
