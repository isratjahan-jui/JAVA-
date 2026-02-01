package primenumber1;

import java.util.Scanner;

public class PrimeNumber1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Enter Your Number");
                int counter = 0;
                
          
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter = counter + 1;
//                     counter++;
                }
            }
            if (counter == 2) {
                System.out.println(number + "it is a prime Number");
            } else {
                System.out.println(number + "it is not a prime number");
            }

        }
    }


