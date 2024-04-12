package com.hopur1H.hotelFinder.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseSeeder {
    

    // Method to insert sample data into Customers
    private static void seedCustomers() {
        String sql = "INSERT INTO Customers (CustomerID, Name, Email, Phone) VALUES (?, ?, ?, ?);";

        try (Connection conn = SQLiteConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // First customer
            pstmt.setString(1, "CUST001");
            pstmt.setString(2, "John Doe");
            pstmt.setString(3, "john.doe@example.com");
            pstmt.setString(4, "5551234");
            pstmt.executeUpdate();

            // Second customer
            pstmt.setString(1, "CUST002");
            pstmt.setString(2, "Jane Smith");
            pstmt.setString(3, "jane.smith@example.com");
            pstmt.setString(4, "5555678");
            pstmt.executeUpdate();

            // Third customer
            pstmt.setString(1, "CUST003");
            pstmt.setString(2, "Chuck Norris");
            pstmt.setString(3, "ChuckNorris@example.com");
            pstmt.setString(4, "5555394");
            pstmt.executeUpdate();

            // Fourth customer
            pstmt.setString(1, "CUST004");
            pstmt.setString(2, "Sylvester Stallone");
            pstmt.setString(3, "SylvesterStallone@example.com");
            pstmt.setString(4, "5555836");
            pstmt.executeUpdate();

            // Fifth customer
            pstmt.setString(1, "CUST005");
            pstmt.setString(2, "Bruce Willis");
            pstmt.setString(3, "BruceWillis@example.com");
            pstmt.setString(4, "5555943");
            pstmt.executeUpdate();

            System.out.println("Customers seeded successfully.");
        } catch (SQLException e) {
            System.out.println("Error seeding customers: " + e.getMessage());
        }
    }

    // Method to insert sample data into Hotels
    private static void seedHotels() {
        String sql = "INSERT INTO Hotels (HotelID, Name, Location, Amenities, Rating) VALUES (?, ?, ?, ?, ?);";

        try (Connection conn = SQLiteConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // First hotel
            pstmt.setString(1, "HOT001");
            pstmt.setString(2, "Aurora Borealis Inn");
            pstmt.setString(3, "Vesturland");
            pstmt.setString(4, "Free WiFi, Breakfast");
            pstmt.setInt(5, 4);
            pstmt.executeUpdate();

            // Second hotel
            pstmt.setString(1, "HOT002");
            pstmt.setString(2, "Midnight Sun Hotel");
            pstmt.setString(3, "Austurland");
            pstmt.setString(4, "Hot tub, Ocean view");
            pstmt.setInt(5, 5);
            pstmt.executeUpdate();

            // Third hotel
            pstmt.setString(1, "HOT003");
            pstmt.setString(2, "Hótel Akureyri");
            pstmt.setString(3, "Norðurland");
            pstmt.setString(4, "Good weather, Horses");
            pstmt.setInt(5, 2);
            pstmt.executeUpdate();

            // Fourth hotel
            pstmt.setString(1, "HOT004");
            pstmt.setString(2, "Hótel Reykjavík");
            pstmt.setString(3, "Suðurland");
            pstmt.setString(4, "Nice wildlife, good beds");
            pstmt.setInt(5, 4);
            pstmt.executeUpdate();

            System.out.println("Hotels seeded successfully.");
        } catch (SQLException e) {
            System.out.println("Error seeding hotels: " + e.getMessage());
        }
    }

    // Method to insert sample data into Rooms
    private static void seedRooms() {
        String sql = "INSERT INTO Rooms (RoomID, HotelID, Type, Price, Availability) VALUES (?, ?, ?, ?, ?);";

        try (Connection conn = SQLiteConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Room 1
            pstmt.setString(1, "RM001");
            pstmt.setString(2, "HOT001");
            pstmt.setString(3, "Standard");
            pstmt.setDouble(4, 100.00);
            pstmt.setBoolean(5, true);
            pstmt.executeUpdate();

            // Room 2
            pstmt.setString(1, "RM002");
            pstmt.setString(2, "HOT001");
            pstmt.setString(3, "Deluxe");
            pstmt.setDouble(4, 150.00);
            pstmt.setBoolean(5, true);
            pstmt.executeUpdate();

            // Room 3
            pstmt.setString(1, "RM003");
            pstmt.setString(2, "HOT002");
            pstmt.setString(3, "Standard");
            pstmt.setDouble(4, 200.00);
            pstmt.setBoolean(5, true);
            pstmt.executeUpdate();

            // Room 4
            pstmt.setString(1, "RM004");
            pstmt.setString(2, "HOT003");
            pstmt.setString(3, "Deluxe");
            pstmt.setDouble(4, 450.00);
            pstmt.setBoolean(5, false);
            pstmt.executeUpdate();

            // Room 5
            pstmt.setString(1, "RM005");
            pstmt.setString(2, "HOT004");
            pstmt.setString(3, "Standard");
            pstmt.setDouble(4, 50.00);
            pstmt.setBoolean(5, true);
            pstmt.executeUpdate();

            // Room 6
            pstmt.setString(1, "RM006");
            pstmt.setString(2, "HOT004");
            pstmt.setString(3, "Deluxe");
            pstmt.setDouble(4, 150.00);
            pstmt.setBoolean(5, false);
            pstmt.executeUpdate();

            // Additional rooms...
            // ...

            System.out.println("Rooms seeded successfully.");
        } catch (SQLException e) {
            System.out.println("Error seeding rooms: " + e.getMessage());
        }
    }

    // Method to insert sample data into Bookings
    private static void seedBookings() {
        String sql = "INSERT INTO Bookings (BookingID, CustomerID, RoomID, CheckInDate, CheckOutDate, Status, Price) VALUES (?, ?, ?, ?, ?, ?, ?);";

        try (Connection conn = SQLiteConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Booking 1
            pstmt.setString(1, "BOOK001");
            pstmt.setString(2, "CUST001");
            pstmt.setString(3, "RM001");
            pstmt.setString(4, "2024-06-01");
            pstmt.setString(5, "2024-06-05");
            pstmt.setString(6, "Confirmed");
            pstmt.setDouble(7, 400.00);
            pstmt.executeUpdate();

            // Booking 2
            pstmt.setString(1, "BOOK002");
            pstmt.setString(2, "CUST002");
            pstmt.setString(3, "RM002");
            pstmt.setString(4, "2024-06-10");
            pstmt.setString(5, "2024-06-12");
            pstmt.setString(6, "Confirmed");
            pstmt.setDouble(7, 300.00);
            pstmt.executeUpdate();

            // Booking 3
            pstmt.setString(1, "BOOK003");
            pstmt.setString(2, "CUST003");
            pstmt.setString(3, "RM003");
            pstmt.setString(4, "2024-06-20");
            pstmt.setString(5, "2024-06-25");
            pstmt.setString(6, "Confirmed");
            pstmt.setDouble(7, 1000.00);
            pstmt.executeUpdate();

            // Booking 4
            pstmt.setString(1, "BOOK004");
            pstmt.setString(2, "CUST004");
            pstmt.setString(3, "RM004");
            pstmt.setString(4, "2024-07-10");
            pstmt.setString(5, "2024-07-12");
            pstmt.setString(6, "Confirmed");
            pstmt.setDouble(7, 900.00);
            pstmt.executeUpdate();

            System.out.println("Bookings seeded successfully.");
        } catch (SQLException e) {
            System.out.println("Error seeding bookings: " + e.getMessage());
        }
    }

    // Method to insert sample data into Reviews
    private static void seedReviews() {
        String sql = "INSERT INTO Reviews (ReviewID, HotelID, CustomerID, Text, Rating) VALUES (?, ?, ?, ?);";

        try (Connection conn = SQLiteConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Review 1
            pstmt.setString(1, "REV001");
            pstmt.setString(2, "HOT001");
            pstmt.setString(3, "CUST001");
            pstmt.setString(4, "Great experience and friendly staff!");
            pstmt.setInt(5, 5);
            pstmt.executeUpdate();

            // Review 2
            pstmt.setString(1, "REV002");
            pstmt.setString(2, "HOT002");
            pstmt.setString(3, "CUST002");
            pstmt.setString(4, "Amazing views, will come again.");
            pstmt.setInt(5, 4);
            pstmt.executeUpdate();

            System.out.println("Reviews seeded successfully.");
        } catch (SQLException e) {
            System.out.println("Error seeding reviews: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        seedCustomers();
        seedHotels();
        seedRooms();
        seedBookings();
        seedReviews();
    }
}

