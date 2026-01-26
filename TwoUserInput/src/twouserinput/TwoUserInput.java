package twouserinput;

import java.util.Scanner;

public class TwoUserInput {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter your number1: ");
        int num1 = scan.nextInt();

        System.out.print("Please enter your number2: ");
        int num2 = scan.nextInt();

        int num3 = num1 + num2;
        System.out.print(num3);

    }

}
