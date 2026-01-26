package javaarearadiusinput;

import java.util.Scanner;

public class JavaAreaRadiusInput {

    public static void main(String[] args) {

// with input:-
        Scanner scan = new Scanner(System.in);
        System.out.println("enter radius : ");
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius, radius);
        System.out.println("Area is " + area);
    }

}
