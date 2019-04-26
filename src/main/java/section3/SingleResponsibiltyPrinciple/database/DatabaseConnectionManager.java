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

	private Connection conn;

	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

	private DatabaseConnectionManager() {
	}

	public static DatabaseConnectionManager getManagerInstance() {
		if (connectionInstance == null) {
			connectionInstance = new DatabaseConnectionManager();
		}
		return connectionInstance;
	}

	/**
	 * contains connection details
	 * 
	 * @throws SQLException
	 */

	public void connect() throws SQLException {
		// processing specific to database connection details...
		try {
			conn = DriverManager.getConnection("Some Database URL");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Establised Database Connection...");
	}

	public Connection getConnectionObject() {
		return conn;
	}

	public void disconnect() throws SQLException {
		conn.close();
		System.out.println("Disconnected from Database...");
	}
}
