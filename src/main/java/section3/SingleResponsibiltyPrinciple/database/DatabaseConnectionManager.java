package section3.SingleResponsibiltyPrinciple.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * I put this class here just for demonstration purposes so you can see roughly
 * how the internals of a connection manager would look like. Notice that this
 * class has a private constructor. That means, clients cannot create instances
 * of this class. But notice it has a method called getManagerInstance() which
 * returns an instance of this class.
 * 
 * @author Imtiaz
 *
 */

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
