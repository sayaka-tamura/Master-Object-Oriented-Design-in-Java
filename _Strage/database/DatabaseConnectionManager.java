package section2.singleResponsibilityPrincipleHomework.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private Connection connection;

    private static DatabaseConnectionManager instance;

    public DatabaseConnectionManager() {
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect() {
        try {
            connection = DriverManager.getConnection("Database URL");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connecting to the database");
    }

    public Connection getConnectionObject() {
        return connection;
    }

    public void disconnect() {
        System.out.println("Disconnecting");
    }
}
