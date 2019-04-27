package section4.observerPattern.dao_simple;

import java.util.ArrayList;
import java.util.List;

import section4.observerPattern.domain.Employee;
import section4.observerPattern.observers.IObserver;

public class EmployeeManagementSystem {

	private List<IObserver> observerList = new ArrayList<>();

	private List<Employee> employees = new ArrayList<>();

	private static EmployeeManagementSystem instance;

	public static EmployeeManagementSystem getInstance() {
		if (instance == null) {
			instance = new EmployeeManagementSystem();
		}
		return instance;
	}

	public void addEmployee(Employee employee) {
		notifyAllDepartments();
		employees.add(employee);
		System.out.println("New employee hired: " + employee);
	}

	public void addObserver(IObserver observer) {
		observerList.add(observer);
	}

	private void notifyAllDepartments() {
		for (IObserver observer : observerList) {
			observer.callMe();
		}
	}
}
