/**
 * @author : Sayaka Tamura
 * Apr 26, 2019
 * Udemy Master Object Oriented Design in Java
 * 
 */
package section3.OpenClosedPrinciple_And_StrategyPattern.practice;

public class Nurse extends Employee {

	public Nurse(int employeeID, String name, String department, boolean working) {
		super(employeeID, name, department, working);
		System.out.println("Nurse is action...");
	}

	// Nurses' Responsibilities
	private void checkVitalSigns() {
		System.out.println("Checking Vitals");
	};

	private void drawblood() {
		System.out.println("Drawing Blood");
	}

	private void cleanPatientArea() {
		System.out.println("Cleaning Patient Area");
	}

	@Override
	public void performDuties() {
		checkVitalSigns();
		drawblood();
		cleanPatientArea();
	}
}
