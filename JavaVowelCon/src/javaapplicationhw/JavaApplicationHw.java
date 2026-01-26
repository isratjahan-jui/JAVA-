package javaapplicationhw;

import java.util.Scanner;

public class JavaApplicationHw {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter letter : ");
        String letter = scan.next().toLowerCase();

        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.print(letter + " is a vowel");
        } else {
            System.out.print(letter + " is a consonant");
        }

    }
}