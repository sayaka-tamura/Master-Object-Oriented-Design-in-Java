package section4.observerPattern.subjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import section4.observerPattern.domain.Employee;
import section4.observerPattern.domain.EmployeeDAO;
import section4.observerPattern.observers.IObserver;

public class EmployeeManagementSystem implements ISubject {

	private List<IObserver> observers;

	private List<Employee> employees;

	private EmployeeDAO employeeDAO;

	private Employee employee;

	private String message;

	public EmployeeManagementSystem() {
		observers = new ArrayList<>();
		employeeDAO = new EmployeeDAO();
		employees = employeeDAO.generateEmployees();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (IObserver departments : observers) {
			departments.callMe(employee, message);
		}
	}

	// create
	public void hireNewEmployee(Employee employee) {
		this.employee = employee;
		message = "New hire: ";
		employees.add(employee);
		notifyObservers();
	}

	// read
	public void showEmployees() {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	// update
	public void modifyEmployeeName(int id, String name) {
		boolean notify = false;
		for (Employee employee : employees) {
			if (id == employee.getEmployeeID()) {
				employee.setName(name);
				this.employee = employee;
				message = "Employee name has been modified: ";
				notify = true;
			}
		}
		if (notify) {
			notifyObservers();
		}
	}

	// delete
	public void deleteEmployee(int id, String name) {
		boolean notify = false;

		Iterator<Employee> itr = employees.iterator();
		Employee currentEmployee = null;
		while (itr.hasNext()) {
			currentEmployee = itr.next();
			if (id == currentEmployee.getEmployeeID()) {
				itr.remove();
				message = "Employee quited: ";
				notify = true;
			}
		}

		if (notify) {
			notifyObservers();
		}
	}
}
