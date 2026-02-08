package seatbookingsystemarray;

import java.util.Scanner;

public class SeatBookingSystemArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter rows number: ");
        int rows = input.nextInt();
        System.out.print("enter cols number: ");
        int cols = input.nextInt();
        int[][] seats = new int[rows][cols];
        int choice;
        do {
            System.out.println("\n-- Seat Booking Menu");
            System.out.println("1.Show Seat");
            System.out.println("2.Book Seat");
            System.out.println("3.Booking Cancel ");
            System.out.println("4.Available Seat");
            System.out.println("5.Exit");
            System.out.println("Choose an option");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    showSeats(seats);
                    break;
                case 2:
                    System.out.print("Enter row number: ");
                    int bookRow = input.nextInt() - 1;
                    System.out.print("Enter col number: ");
                    int bookCol = input.nextInt() - 1;
                    if (bookRow >= 0 && bookRow < rows && bookCol >= 0 && bookCol < cols) {
                        if (seats[bookRow][bookCol] == 0) {
                            seats[bookRow][bookCol] = 1;
                            System.out.println("Seat booked successfully");

                        } else {
                            System.out.println("Seat already booked ");
                        }
                    } else {
                        System.out.println("Invalid seat number");
                    }
                    break;
                case 3:
                    System.out.println("Enter row number: ");
                    int cancelRow = input.nextInt() - 1;
                    System.out.println("Enter col number: ");
                    int cancelCol = input.nextInt() - 1;

                    if (cancelRow >= 0 && cancelRow < rows && cancelCol >= 0 && cancelCol < cols) {
                        if (seats[cancelRow][cancelCol] == 1) {
                            seats[cancelRow][cancelCol] = 0;
                            System.out.println("Seat cancel successfully");

                        } else {
                            System.out.println("Seat is already empty");

                        }

                    } else {
                        System.out.println("Invalid seat number");
                    }
                    break;

                case 4:
                    int countAvailable = 0;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (seats[i][j] == 0) {
                                countAvailable++;
                            }
                        }
                    }
                    System.out.println("Available seats " + countAvailable);
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("invalid choice");

            }

        } while (choice != 5);

    }

    public static void showSeats(int[][] seats) {
        System.out.println("\nSeat Layout(0=Empty,1=booked)");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");

            }
            System.out.println();
        }
    }
}
