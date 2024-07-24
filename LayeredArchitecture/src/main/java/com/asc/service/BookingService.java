package com.asc.service;

import com.asc.exception.BookingNotFoundException;
import com.asc.exception.DuplicateBookingException;
import com.asc.model.BookingModel;
import com.asc.repository.BookingRepository;

import java.util.Collection;

public class BookingService {
    private BookingRepository bookingRepository = new BookingRepository();

    public void addBooking(BookingModel booking) throws DuplicateBookingException {
        bookingRepository.addBooking(booking);
    }

    public BookingModel getBookingById(int bookingId) throws BookingNotFoundException {
        return bookingRepository.getBookingById(bookingId);
    }

    public Collection<BookingModel> getAllBookings() {
        return bookingRepository.getAllBookings();
    }

    public void updateBooking(BookingModel updatedBooking) throws BookingNotFoundException {
        bookingRepository.updateBooking(updatedBooking);
    }

    public void deleteBooking(int bookingId) throws BookingNotFoundException {
        bookingRepository.deleteBooking(bookingId);
    }
}
