package com.gflights.util;

import com.gflights.model.BookingModel;
import com.gflights.exceptions.BookingNotFoundException;
import com.gflights.exceptions.DuplicateBookingException;
import com.gflights.repository.BookingRepository;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to GFlights");
        BookingRepository bookingRepository = new BookingRepository();

        while (true) {
            int choice = MainMenuUtil.displayMainMenu();
            switch (choice) {
                case 1:
                    try {
                        BookingModel bookingModel = MenuUtil.bookFlights();
                        bookingRepository.addBooking(bookingModel);
                    } catch (DuplicateBookingException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    bookingRepository.displayBookings();
                    break;
                case 3:
                    System.out.print("Enter Booking ID: ");
                    int bookingId = MenuUtil.scanner.nextInt();
                    MenuUtil.scanner.nextLine(); // consume newline character
                    try {
                        BookingModel booking = bookingRepository.getBookingById(bookingId);
                        System.out.println("Booking found: " + booking);
                    } catch (BookingNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter Booking ID to update: ");
                    bookingId = MenuUtil.scanner.nextInt();
                    MenuUtil.scanner.nextLine(); // consume newline character
                    try {
                        BookingModel updatedBooking = MenuUtil.bookFlights();
                        updatedBooking.setBookingId(bookingId);
                        bookingRepository.updateBooking(updatedBooking);
                    } catch (BookingNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter Booking ID to delete: ");
                    bookingId = MenuUtil.scanner.nextInt();
                    MenuUtil.scanner.nextLine(); // consume newline character
                    try {
                        bookingRepository.deleteBooking(bookingId);
                    } catch (BookingNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}