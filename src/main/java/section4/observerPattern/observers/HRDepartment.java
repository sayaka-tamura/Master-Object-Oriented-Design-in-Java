package section3.observerPatternHomework.detailedSolution.observers;

import section3.observerPatternHomework.detailedSolution.domain.Employee;

public class HRDepartment implements IObserver {

    @Override
    public void callMe(Employee employee, String message) {
        System.out.println("HR department notified");
        System.out.println(message + employee);
    }
}
