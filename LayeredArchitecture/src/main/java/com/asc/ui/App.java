package com.asc.ui;

import com.asc.exception.BookingNotFoundException;
import com.asc.exception.DuplicateBookingException;
import com.asc.model.BookingModel;
import com.asc.repository.BookingRepository;
import com.asc.service.BookingService;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to GFlights");
        BookingRepository bookingRepository = new BookingRepository();

        while (true) {
            int choice = MenuUI.displayMainMenu();
            switch (choice) {
                case 1:
                    try {
                        BookingModel bookingModel = MenuUI.bookFlights();
                        bookingRepository.addBooking(bookingModel);
                    } catch (DuplicateBookingException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    bookingRepository.getAllBookings();
                    break;
                case 3:
                    System.out.print("Enter Booking ID: ");
                    int bookingId = MenuUI.scanner.nextInt();
                    MenuUI.scanner.nextLine(); // consume newline character
                    try {
                        BookingModel booking = bookingRepository.getBookingById(bookingId);
                        System.out.println("Booking found: " + booking);
                    } catch (BookingNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter Booking ID to update: ");
                    bookingId = MenuUI.scanner.nextInt();
                    MenuUI.scanner.nextLine(); // consume newline character
                    try {
                        BookingModel updatedBooking = MenuUI.bookFlights();
                        updatedBooking.setBookingId(bookingId);
                        bookingRepository.updateBooking(updatedBooking);
                    } catch (BookingNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter Booking ID to delete: ");
                    bookingId = MenuUI.scanner.nextInt();
                    MenuUI.scanner.nextLine(); // consume newline character
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
