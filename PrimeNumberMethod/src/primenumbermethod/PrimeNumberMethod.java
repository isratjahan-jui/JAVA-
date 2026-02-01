package primenumbermethod;

import java.util.Scanner;

public class PrimeNumberMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int userInput = input.nextInt();

        String num = CheckPrimeNumber(userInput);
        System.out.println(num);
    }

    public static String CheckPrimeNumber(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                counter = counter + 1;
//                     counter++;
            }
        }
        if (counter == 2) {
            return (number + " it is a prime Number");
        } else {
            return (number + " it is not a prime number");
        }
    }

}
