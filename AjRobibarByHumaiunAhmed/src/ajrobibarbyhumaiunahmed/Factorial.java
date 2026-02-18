package ajrobibarbyhumaiunahmed;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
//        2
//          with input 

          Scanner scan = new Scanner(System.in);
        System.out.println("Enter  Number");
        int input = scan.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;

        }
        System.out.println("factorial of is " + factorial);
        
        
//        without input
       
//           int factorial = 1;
//        for (int i = 1; i <= 5; i++) {
//            factorial *= i;
//
//        }
//        System.out.println("factorial of 5 is " + factorial);
        

    }

}
