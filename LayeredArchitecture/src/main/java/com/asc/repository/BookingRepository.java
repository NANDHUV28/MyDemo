package com.asc.repository;

import com.asc.exception.BookingNotFoundException;
import com.asc.exception.DuplicateBookingException;
import com.asc.model.BookingModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookingRepository {
    private Map<Integer, BookingModel> bookingMap = new HashMap<>();

    public void addBooking(BookingModel bookingModel) {
        if (bookingMap.containsKey(bookingModel.getBookingId())) {
            throw new DuplicateBookingException("Booking with ID " + bookingModel.getBookingId() + " already exists.");
        }
        bookingMap.put(bookingModel.getBookingId(), bookingModel);
        System.out.println("Saved booking: " + bookingModel);
    }

    public Collection<BookingModel> getAllBookings() {
        // indicates that the method is expected to return multiple instances of BookingModel
        if (bookingMap.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            System.out.println("All Bookings:");
            for (BookingModel booking : bookingMap.values()) {
                System.out.println(booking);
            }
        }
        return bookingMap.values();  //returing the collection of bookings
    }

    public BookingModel getBookingById(int bookingId) {
        if (!bookingMap.containsKey(bookingId)) {
            throw new BookingNotFoundException("Booking with ID " + bookingId + " not found.");
        }
        return bookingMap.get(bookingId);
    }

    public void updateBooking(BookingModel updatedBooking) {
        if (!bookingMap.containsKey(updatedBooking.getBookingId())) {
            throw new BookingNotFoundException("Booking with ID " + updatedBooking.getBookingId() + " not found.");
        }
        bookingMap.put(updatedBooking.getBookingId(), updatedBooking);
        System.out.println("Booking updated: " + updatedBooking);
    }

    public void deleteBooking(int bookingId) {
        if (!bookingMap.containsKey(bookingId)) {
            throw new BookingNotFoundException("Booking with ID " + bookingId + " not found.");
        }
        BookingModel deletedBooking = bookingMap.remove(bookingId);
        System.out.println("Booking deleted: " + deletedBooking);
    }

}
