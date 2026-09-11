package eventticketregistrationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
    "jdbc:sqlite:database/ticket_registration.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}