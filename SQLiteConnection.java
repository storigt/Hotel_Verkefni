package com.hopur1H.hotelFinder.database; // Make sure the package name matches your project structure

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {

    private static final String URL = "jdbc:sqlite:/Users/gunnarerlendsson/Desktop/Iðnaðarverkfræði/Vor 2024/Þróun hugbúnaðar/Hotel_verkefni/Hotel/resources/hoteldatabase.db"; // Make sure this is the correct relative path

    public static Connection connect() throws SQLException {
        // Load the SQLite JDBC driver (if necessary)
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC driver not found.");
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL);

        // Establish and return the database connection

    }

    public static void main(String[] args) {
        try {
            Connection conn = SQLiteConnection.connect();
            if (conn != null) {
                System.out.println("Connected to the database!");
                // You might want to add some logic here to close the connection
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database.");
            e.printStackTrace();
        }
    }
}
