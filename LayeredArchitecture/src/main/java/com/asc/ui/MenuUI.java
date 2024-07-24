package com.asc.ui;

import com.asc.model.BookingModel;

import java.util.Scanner;

public class MenuUI {

    static final Scanner scanner = new Scanner(System.in);

    public static int displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Book Flights");
        System.out.println("2. Display Bookings");
        System.out.println("3. Search Booking by Booking ID");
        System.out.println("4. Update Booking");
        System.out.println("5. Delete Booking");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static BookingModel bookFlights() {
        System.out.print("Enter Booking ID: ");
        int bookingId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after nextInt()

        System.out.print("Enter Source: ");
        String source = scanner.nextLine();

        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter Ticket Class: ");
        String ticketClass = scanner.nextLine();

        System.out.print("Enter Number of Passengers: ");
        int noOfPassengers = scanner.nextInt();

        System.out.print("Is this a Round Trip? (true/false): ");
        boolean roundTrip = scanner.nextBoolean();

        return new BookingModel(bookingId, source, destination, ticketClass, noOfPassengers, roundTrip);
    }
}
