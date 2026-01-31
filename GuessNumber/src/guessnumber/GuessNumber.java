package guessnumber;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);

        int chance = 3;
        boolean win = false;

        while (chance >= 1) {
            System.out.println("enter your guess number:");
            int guessNumber = input.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("you are win!");
                win = true;
                break;

            } else if (guessNumber > randomNumber) {
                System.out.println("your number is larger");

            } else {
                System.out.println("your number is smaller");

            }

            chance--;
        }
        if (!win) {
            System.out.println("Better luck next time!! ");
        }

        System.out.println("system guess number " + randomNumber);
    }

}
