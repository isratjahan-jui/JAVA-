package usernamepassword;

import java.util.Scanner;

public class UserNamePassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter user name:");
        String userName = input.nextLine();
        System.out.print("enter your password:");
        String password = input.nextLine();

        if (userName.equalsIgnoreCase("java") && password.equals("agT6k")) {
            System.out.println(" Welcome " + userName);
        } else {
            System.out.println("Incorrect password. Try again.");
        }

    }

}
