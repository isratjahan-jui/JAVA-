package circleifelse;

import java.util.Scanner;

public class CircleIfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter your radius:");
        float radius = input.nextFloat();
        if (radius <= 0) {
            System.out.println("invalid");

        } else {
            float area = (float) (Math.PI * Math.pow(radius, 2));
            System.out.println("Area is " + area);
        }

    }

}
