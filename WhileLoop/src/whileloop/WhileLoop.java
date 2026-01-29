package whileloop;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your number:");
        int number = input.nextInt();
        int result = 1;
        int i = 1;
        while (i<= number) {
            result = result * i;
            i++;
        }

        System.out.println(result);

    }

}
