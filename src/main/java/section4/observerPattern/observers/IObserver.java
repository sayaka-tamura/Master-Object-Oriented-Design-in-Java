package section4.observerPattern.observers;

import section4.observerPattern.domain.Employee;

public interface IObserver {

	void callMe(Employee employee, String message);
}
