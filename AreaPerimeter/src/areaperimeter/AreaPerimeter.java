package areaperimeter;

import java.util.Scanner;

public class AreaPerimeter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length : ");
        double length = scan.nextDouble();

        System.out.print("Enter width : ");
        double width = scan.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("area is " + area);
        System.out.println(" perimeter is " + perimeter);
    }

}
