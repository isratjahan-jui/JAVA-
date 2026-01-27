package usernamematchnextpass;

import java.util.Scanner;

public class UserNameMatchNextPass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter user name:");
        String userName = input.nextLine();

        if (userName.equalsIgnoreCase("java")) {
            System.out.print("enter your password:");
            String password = input.nextLine();
            if (password.equals("jk9P4")) {
                System.out.println(" Welcome " + userName);
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        } else {
            System.out.println("Invalid username.");
        }
    }

    }
