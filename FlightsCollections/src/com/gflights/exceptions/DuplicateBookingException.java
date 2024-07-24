package com.gflights.exceptions;

public class DuplicateBookingException extends RuntimeException{
    public DuplicateBookingException(String message){
        super(message);
    }
}
