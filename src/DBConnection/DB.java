package DBConnection;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class DB {

    //Variables used for establishing connection
    private static final String URL = "jdbc:mysql://localhost:3306/kammode?useSSL=false&serverTimezone=UTC";
    private static final String USERNAME = "dev";
    private static final String PASSWORD = "dev123";
    private static Connection connection = null;

    /**
     * Attempts to create the connection to database
     */
    public DB() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method responsible for terminating the database connection.
     */
    private static void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
