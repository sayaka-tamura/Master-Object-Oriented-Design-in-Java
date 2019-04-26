/**
 * @author : Sayaka Tamura
 * Apr 26, 2019
 * Udemy Master Object Oriented Design in Java: Section 2 Lecture 14 
 * 
 */
package section3.SingleResponsibiltyPrinciple.domain.dao;

import section3.SingleResponsibiltyPrinciple.domain.Employee;

public class EmployeeDAO {
	public EmployeeDAO() {
	}

	public void saveEmployee(Employee employee) {
		// Commented out below just to show you how you would go about "really" saving
		// an employee to a database
		// But since that's not the objective of this lesson, I've left a simple
		// implementation.
		/*
		 * DatabaseConnectionManager databaseConnection =
		 * DatabaseConnectionManager.getManagerInstance(); databaseConnection.connect();
		 * 
		 * DatabaseConnectionManager.getManagerInstance().getConnectionObject().
		 * prepareStatement("Some SQL..."); databaseConnection.disconnect();
		 */

		System.out.println("Saved Employee to Database");
	}

	public void deleteEmployee(Employee employee) {
		// DatabaseConnectionManager.getManagerInstance().getConnectionObject().prepareStatement("Some
		// SQL...");

		System.out.println("Removed employee from database");
	}

}
