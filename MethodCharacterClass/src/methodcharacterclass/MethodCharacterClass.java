package methodcharacterclass;

import java.util.Scanner;

public class MethodCharacterClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your name:");
        String name = input.next();
        String firstChar = name.substring(0, 1).toUpperCase();
        String lastPart = name.substring(1).toLowerCase();

        String newName = firstChar + lastPart;
        System.out.println(newName);

    }

}
