package checkfactorialnumbermethod;

import java.util.Scanner;

public class CheckFactorialNumberMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int userInput = input.nextInt();

        int num = CheckFactorialNumber(userInput);
        System.out.println(num);
    }

    public static int CheckFactorialNumber(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {

            result = result * i;

        }
        return result;
    }

}
