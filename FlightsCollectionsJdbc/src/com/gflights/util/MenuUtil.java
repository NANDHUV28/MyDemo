package com.gflights.util;

import com.gflights.model.BookingModel;

import java.util.Scanner;

public class MenuUtil {
    public static final Scanner scanner = new Scanner(System.in);

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
