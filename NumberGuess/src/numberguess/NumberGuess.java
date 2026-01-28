package numberguess;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = randomInRange(34, 70);
        System.out.println("guess a number:");
        int number = input.nextInt();
        if (randomNum == number) {
            System.out.println("Wow! ");
        } else {
            System.out.println("Opps! ");
        }

    }

    static int randomInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
