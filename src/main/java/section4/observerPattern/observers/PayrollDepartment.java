package section4.observerPattern.observers;

import section4.observerPattern.domain.Employee;

public class PayrollDepartment implements IObserver {

	@Override
	public void callMe(Employee employee, String message) {
		System.out.println("Payroll department notified");
		System.out.println(message + employee);
	}
}
