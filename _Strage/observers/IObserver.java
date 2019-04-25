package section3.observerPatternHomework.detailedSolution.observers;

import section3.observerPatternHomework.detailedSolution.domain.Employee;

public interface IObserver {

    void callMe(Employee employee, String message);
}
