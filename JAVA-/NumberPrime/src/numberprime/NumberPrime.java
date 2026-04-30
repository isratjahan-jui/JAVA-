package numberprime;

import java.util.Scanner;

public class NumberPrime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number");
        int number = input.nextInt();
    
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(number + "it is a prime Number");
        } else {
            System.out.println(number + "it is not a prime number");
        }

    }

}
