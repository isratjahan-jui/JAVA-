package underweigthnormal;

import java.util.Scanner;

public class UnderweigthNormal {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter your weight: ");
        double weight = scn.nextDouble();
        

        if (weight < 18.5) {
            System.out.println("Underweight");

        } else if (weight <= 25.0) {
            System.out.println("Normal");
        } else if (weight <= 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }

}
