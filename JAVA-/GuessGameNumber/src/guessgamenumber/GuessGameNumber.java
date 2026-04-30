package guessgamenumber;

import java.util.Scanner;

public class GuessGameNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 10);

        int chance = 3;

        while (chance >= 1) {

            System.out.println("Enter Your Guess Number");
            int guessNumber = scanner.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("You Win");
                break;
            } else if (guessNumber > randomNumber) {
                System.out.println("Your Guess Number is Larger");

            } else {
                System.out.println("Your Guess Number is Smaller");
            }
            chance--;
        }
        System.out.println("System Guess " + randomNumber);
    }
}
