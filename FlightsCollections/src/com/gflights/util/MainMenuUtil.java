package com.gflights.util;

import java.util.Scanner;

public class MainMenuUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static int displayMainMenu() {
        System.out.println("Welcome to GFlights...");
        System.out.println("1. Book Flights");
        System.out.println("2. Display Bookings");
        System.out.println("3. Search Booking by Booking ID");
        System.out.println("4. Update Booking");
        System.out.println("5. Delete Booking");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after nextInt()

        return choice;
    }
}
