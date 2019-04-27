package section4.observerPattern.clients;

import java.util.Date;

import section4.observerPattern.domain.Employee;
import section4.observerPattern.observers.HRDepartment;
import section4.observerPattern.observers.IObserver;
import section4.observerPattern.observers.PayrollDepartment;
import section4.observerPattern.subjects.EmployeeManagementSystem;

public class App {

	public static void main(String[] args) {

		IObserver payroll = new PayrollDepartment();
		IObserver hrDepartment = new HRDepartment();

		EmployeeManagementSystem ems = new EmployeeManagementSystem();

		ems.registerObserver(payroll);
		ems.registerObserver(hrDepartment);

		Employee bob = new Employee("Bob", new Date(), 35000, true);
		ems.hireNewEmployee(bob);

		ems.modifyEmployeeName(6, "Bobby");
		ems.modifyEmployeeName(234, "Conan");
	}
}
