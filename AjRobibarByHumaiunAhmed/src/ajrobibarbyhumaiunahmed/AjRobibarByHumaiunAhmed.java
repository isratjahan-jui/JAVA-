package ajrobibarbyhumaiunahmed;

import java.util.Scanner;

public class AjRobibarByHumaiunAhmed {

    public static void main(String[] args) {
        
//        1 
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer Number");
        int input = scan.nextInt();
        int sum = 0;

        while (input >= 0) {
            sum += input;
            System.out.println("Enter integer Number");
            input = scan.nextInt();
        }
        scan.close();
        System.out.println("Sum is " + sum);
        
        

        
        
        

    }

}
