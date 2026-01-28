package simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number1: ");
        double number1 = input.nextDouble();

        System.out.print("enter a number2: ");
        double number2 = input.nextDouble();
        System.out.print("enter a  operator(+ - * /): ");
        String operator = input.next();

        if (operator.equals("+")) {
            double result1 = number1 + number2;
            System.out.print(result1);

        } else if (operator.equals("-")) {
            double result2 = number1 - number2;
            System.out.print(result2);
        } else if (operator.equals("*")) {
            double result3 = number1 * number2;
            System.out.print(result3);
        } else if (operator.equals("/")) {
            double result4 = number1 / number2;
            System.out.print(result4);

        }

//       same logic diffrent method (switch) 
        switch (operator) {
            case "+":
                System.out.println("Result: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Result: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Result: " + (number1 * number2));
                break;

            case "/":
                System.out.println("Result: " + (number1 / number2));
                break;
        }

    }
}
