package section4.observerPattern.observers;

import section4.observerPattern.domain.Employee;

public class HRDepartment implements IObserver {

	@Override
	public void callMe(Employee employee, String message) {
		System.out.println("HR department notified");
		System.out.println(message + employee);
	}
}
