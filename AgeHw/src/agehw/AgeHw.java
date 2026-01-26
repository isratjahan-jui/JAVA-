package agehw;

import java.util.Scanner;

public class AgeHw {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter letter : ");
        int age = scan.nextInt();
        if (age >= 70) {
            System.out.println("time is over");
        } else if (age >= 45) {
            System.out.println("you are senior");
        } else if (age >= 19) {
            System.out.println("you are adult");
        } else if (age == 0) {
            System.out.println("you are baby");
        } else {
            System.out.println("invalid age");
        }

    }

}
