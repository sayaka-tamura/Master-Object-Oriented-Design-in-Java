/**
 * @author : Sayaka Tamura
 * Apr 26, 2019
 * Udemy Master Object Oriented Design in Java
 * 
 */
package section3.OpenClosedPrinciple_And_StrategyPattern.practice;

public class Doctor extends Employee {

	public Doctor(int employeeID, String name, String department, boolean working) {
		super(employeeID, name, department, working);
		System.out.println("Doctor in action...");
	}

	// Doctors' Responsibilities
	private void prescribeMedicine() {
		System.out.println("Priscribe Medicine");
	}

	private void diagnosePatient() {
		System.out.println("Diagnose Patient");
	}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatient();
	}
}
