package com.gflights.repository;

import com.gflights.model.BookingModel;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BookingRepository {
    //private List<BookingModel> bookingModelList = new ArrayList<>();

    public void addBooking(BookingModel bookingModel) throws DuplicateBookingFound {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/flight", "root", "mysql");
            System.out.println("Driver Loaded!");
            PreparedStatement statement=connection.prepareStatement("INSERT INTO booking (BookingID, Source, Destination, TicketClass, NoOfPassenger, RoundTrip) VALUES (?,?,?,?,?,?)");
            System.out.println("Statement created");
            statement.setInt(1, bookingModel.getBookingId());
            statement.setString(2, bookingModel.getSource());
            statement.setString(3, bookingModel.getDestination());
            statement.setString(4, bookingModel.getTicketClass());
            statement.setInt(5, bookingModel.getNoOfPassengers());
            statement.setBoolean(6, bookingModel.isRoundTrip());
            statement.executeUpdate();
//            System.out.println("Saved booking: "+ bookingModel);
        }
        catch ( ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (SQLException e){
            if(e.getErrorCode()==1062){
                System.out.println("Duplicate booking found");
            }
        }
//        catch (DuplicateBookingFound duplicateBookingFound){
//            System.out.println(duplicateBookingFound.getMessage());
//        }
    }

    public void displayBookings() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/flight", "root", "mysql");
            System.out.println("Driver Loaded!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM booking");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("bookingId"));
                    System.out.println(resultSet.getString("source"));
                    System.out.println(resultSet.getString("destination"));
                    System.out.println(resultSet.getString("ticketClass"));
                    System.out.println(resultSet.getInt("NoOfPassenger"));
                    System.out.println(resultSet.getBoolean("roundTrip"));
                }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void searchBooking(int bookingId) throws BookingNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/flight", "root", "mysql");
            System.out.println("Driver Loaded!");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM booking WHERE bookingId = "+bookingId);
            ResultSet resultSet = statement.executeQuery();
            boolean noRecords=false;
            while(resultSet.next()) {
                noRecords=true;
                System.out.println(resultSet.getInt("bookingId"));
                System.out.println(resultSet.getString("source"));
                System.out.println(resultSet.getString("destination"));
                System.out.println(resultSet.getString("ticketClass"));
                System.out.println(resultSet.getInt("NoOfPassenger"));
                System.out.println(resultSet.getBoolean("roundTrip"));
            }
            if(!noRecords){
                throw new BookingNotFoundException("Booking not found" + bookingId);
            }
        }
         catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        catch(BookingNotFoundException bookingNotFoundException){
            System.out.println(bookingNotFoundException.getMessage());
        }
    }

    public void updateBooking(int updatingId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/flight", "root", "mysql");
            System.out.println("Driver Loaded!");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            int noOfRowsAffected = statement.executeUpdate("update Booking set ticketclass='Economy' where  bookingId="+updatingId);
            System.out.println("No of rows updated: " + noOfRowsAffected);
        }
        catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBooking(int bookingId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/flight", "root", "mysql");
            System.out.println("Driver Loaded!");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            int noOfRowsAffected = statement.executeUpdate("delete from `Booking` where bookingId="+bookingId);
            System.out.println("No of rows deleted: " + noOfRowsAffected);
        }
        catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
class BookingNotFoundException extends RuntimeException{
    public BookingNotFoundException(String message){
        super(message);
    }
}

class DuplicateBookingFound extends RuntimeException {
    public DuplicateBookingFound(String message) {
        super(message);
    }
}
