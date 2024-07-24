package com.gflights.util;

import com.gflights.model.BookingModel;
import com.gflights.repository.BookingRepository;
import com.gflights.util.MainMenuUtil;
import com.gflights.util.MenuUtil;

import static com.gflights.util.MenuUtil.scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to GFlights");

        BookingRepository bookingRepository = new BookingRepository();
        int choice=MainMenuUtil.displayMainMenu();

        while (choice!=0){

            switch (choice) {
                case 1:
                    BookingModel bookingModel = MenuUtil.bookFlights();
                    bookingRepository.addBooking(bookingModel);
                    break;
                case 2:
                    bookingRepository.displayBookings();
                    break;
                case 3:
                    System.out.print("Enter Booking ID to search: ");
                    int searchId = scanner.nextInt();
                    bookingRepository.searchBooking(searchId);
                    break;
                case 4:
                    System.out.print("Enter Booking ID to update: ");
                    int updateId = scanner.nextInt();
                    bookingRepository.updateBooking(updateId);
                    break;
                case 5:
                    System.out.print("Enter Booking ID to delete: ");
                    int deleteId = scanner.nextInt();
                    bookingRepository.deleteBooking(deleteId);
                    break;
                case 0:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            choice=MainMenuUtil.displayMainMenu();
        }

        scanner.close();
    }
}
